package AhmetT._07_Classlar.h_IsMakineleri;
import java.util.HashSet;

// TODO
//  Personel class     --> fields : String isim, String ehliyetSinifi, HashSet<String> yetenekleri
//  personelKayit(String yeniIsim, String yeniEhliyet, String...yetenekleri) :
//  yeni personel kaydedip return edecek

public class Personel {
    String isim;
    String ehliyet;
    HashSet<String> yetenekleri;


    public static Personel personelKayit(String yeniIsim, String yeniEhliyet, String...yetenekleri){
        Personel personel = new Personel();
        personel.yetenekleri = new HashSet<>();
        personel.isim = yeniIsim;
        personel.ehliyet = yeniEhliyet;
        for (int i = 0; i < yetenekleri.length; i++) {
            personel.yetenekleri.add(yetenekleri[i]);
        }
        return personel;
    }
}
