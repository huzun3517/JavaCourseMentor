package AhmetT._07_Classlar.g_KutuphaneProjesi;

import java.util.ArrayList;
import java.util.HashSet;

public class Kutuphane {
    String name;
    int maxUyeSayisi;
    HashSet<Uye> uyeleri;
    ArrayList<Kitap> kitaplari;

    public static Kutuphane kutuphaneOlustur(String name, int maxUSayisi){
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.name = name;
        kutuphane.maxUyeSayisi = maxUSayisi;
        kutuphane.uyeleri = new HashSet<>();
        kutuphane.kitaplari= new ArrayList<>();
        return kutuphane;
    }


    void uyeEkle(Uye...uyeler){
        for (Uye u : uyeler)
            uyeleri.add(u);
    }

    void listeUyeler(){
        for(Uye u : uyeleri)
            System.out.println(u.name);

    }

    void kitapEkle(Kitap...kitaplar){
        for (Kitap k : kitaplar)
            kitaplari.add(k);
    }

    void listeKitaplar(){
        for(Kitap k : kitaplari)
            System.out.println(k.name + " " + k.basimYili + " " + k.kutuphanede);

    }

}
