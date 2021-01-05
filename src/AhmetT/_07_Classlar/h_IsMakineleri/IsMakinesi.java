package AhmetT._07_Classlar.h_IsMakineleri;
import java.util.HashSet;

// TODO
//  IsMakinesi  --> fileds : String isim, int maxKullanici, boolean calisiyorMu,Personel sofor
//  HashSet<Personel> kullanicilar, HashSet<String> gerekliEhliyetSinifi
//  isMakinesiOlustur(String yeniIsim, String...ehliyetler) : is makinesi olusturacak
//  soforEkle(Personel...yeniSofor): gelen soforlerin ehliyeti kullanabilecekEhliyetler'de varsa ve
//  maxKullaniciSofor sayisini asmamissa ekleyecek yoksa kullanamaz diyecek. Bir araci
//  soforBin(Personel yeniSofor) : ismakinesine sofor binecek, sofor varsa zaten soforü var uyarisi verecek
//  soforIn() : ismakinesinden soforü indirecek, zaten sofor yoksa sofor yok diyecek

public class IsMakinesi {
    String isim;
    int maxKullanici = 2;
    boolean calisiyorMu = false;
    Personel sofor = null;
    HashSet<Personel> kullanicilar;
    HashSet<String> gerekliEhliyetSinifi;


    public static IsMakinesi isMakinesiOlustur(String yeniIsim, String...ehliyetler){
        IsMakinesi isMakinesi = new IsMakinesi();
        isMakinesi.kullanicilar = new HashSet<>();
        isMakinesi.sofor = new Personel();
        isMakinesi.gerekliEhliyetSinifi = new HashSet<>();
        isMakinesi.isim = yeniIsim;
        isMakinesi.calisiyorMu = false;
        for (int i = 0; i < ehliyetler.length; i++) {
            isMakinesi.gerekliEhliyetSinifi.add(ehliyetler[i]);
        }
        return isMakinesi;
    }

    boolean kullanabilirMi(Personel calisan){
        if (kullanicilar.size()>2){
            return false;
        }
        if (!gerekliEhliyetSinifi.contains(calisan.ehliyet)){
            return false;
        }
        return  true;
    }

    void soforEkle(Personel...yeniSofor){
        for (int i = 0; i < yeniSofor.length; i++) {
            if (!kullanabilirMi(yeniSofor[i]))
                System.out.println(yeniSofor[i].isim + ", " + isim + " kullanamaz");
            else {
                kullanicilar.add(yeniSofor[i]);
                System.out.println(yeniSofor[i].isim + ", " + isim + " is makinesine soför olarak atandi");
            }
        }
    }

    void soforBin(Personel yeniSofor){
        if (!kullanicilar.contains(yeniSofor))
            System.out.println(yeniSofor.isim + " bu araci kullanmaya yetkili degil.");
        else if (sofor != null)
            System.out.println(sofor.isim + " suan is makinesinde.");
        else {
            sofor = yeniSofor;
            System.out.println(yeniSofor.isim + " is makinesine bindi");
        }
    }

    void makineCalis(){
        if (sofor == null)
            System.out.println("Soför Yok");
        else if (calisiyorMu)
            System.out.println(isim + " zaten calisiyor");
        else if (sofor == null)
            System.out.println("Soförsüz makine calisamaz.");
        else
            calisiyorMu = true;
    }

    void makinePaydos(){
        if (sofor == null)
            System.out.println("Soför Yok. " + isim + " Calisamaz");
        else if (!calisiyorMu)
            System.out.println(isim + " zaten calismiyor");
        else
            calisiyorMu = true;
    }
}
