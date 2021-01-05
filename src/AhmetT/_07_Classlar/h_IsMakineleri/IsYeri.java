package AhmetT._07_Classlar.h_IsMakineleri;
import java.util.HashSet;

// TODO
//  IsYeri class    --> fileds : String isim, int calisanMaxKapasite, HashSet<Personel> calisanlar, HashSet<IsMakinesi> isMakineleri
//  isyeriTanimla(String yeniIsim, int kapasite, Personel...calisanlar) : isyeri tanimlayacak
//  void iseAl(Personel yeniPersonel) : yeni calisan kaydedip, o personeli calisanlar HashSet ine ekleyecek. Zaten kayitli ise uyaracak
//  void istenCikart(Personel cikarilacakPersonel) : calisani isten cikartacak. p calisan degilse uyaracak.
//  void isMakinesiEkle(IsMakinesi...yeniIsMakineleri) : is yerine isMakineleri ekleyecek
//  void isMakinesiCikar(IsMakinesi cikarilacakIsMakinesi) : is yerinnden isMakineleri çıkartacak.

public class IsYeri {
    String isim;
    int calisanMaxKapasite;
    HashSet<Personel> calisanlar;
    HashSet<IsMakinesi> isMakineleri;


    public static IsYeri isyeriTanimla(String yeniIsim, int kapasite, Personel...calisanlar){
        IsYeri isYeri = new IsYeri();
        isYeri.calisanlar = new HashSet<>();
        isYeri.isMakineleri = new HashSet<>();
        isYeri.isim = yeniIsim;
        for (int i = 0; i < calisanlar.length; i++) {
            isYeri.calisanlar.add(calisanlar[i]);
        }
        return isYeri;
    }

    int mevcutCalisanSayisi(){

        return calisanlar.size();
    }

    boolean iseAlinabilirMi(){

        return (mevcutCalisanSayisi() + 1 >calisanMaxKapasite);
    }

    void iseAl(Personel yeniPersonel){
        if (iseAlinabilirMi()){
            System.out.println("Isyeri kapasitesi dolu oldugu icin " + yeniPersonel.isim + " ise alinamaz");
        }else {
            calisanlar.add(yeniPersonel);
            System.out.println(yeniPersonel.isim + " ise kabul edildi.");
        }
    }

    void istenCikart(Personel cikarilacakPersonel){
        calisanlar.remove(cikarilacakPersonel);
        System.out.println(cikarilacakPersonel.isim + " is'ten cikartildi.");
    }

    void isMakinesiEkle(IsMakinesi...yeniIsMakineleri){
        for (int i = 0; i < yeniIsMakineleri.length; i++) {
            isMakineleri.add(yeniIsMakineleri[i]);
        }
    }

    void isMakinesiCikar(IsMakinesi cikarilacakIsMakinesi){

        isMakineleri.remove(cikarilacakIsMakinesi);
    }
}
