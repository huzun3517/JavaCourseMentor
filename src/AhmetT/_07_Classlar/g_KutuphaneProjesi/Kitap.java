package AhmetT._07_Classlar.g_KutuphaneProjesi;

public class Kitap {
    String name;
    int basimYili;
    boolean kutuphanede = true;

    public static Kitap kitapOlustur(String name, int basimYili){
        Kitap x = new Kitap();
        x.name = name;
        x.basimYili = basimYili;
        return x;
    }

    public static Kitap kitapOlustur(String name, int basimYili, boolean kutuphanede){
        Kitap x = new Kitap();
        x.name = name;
        x.basimYili = basimYili;
        x.kutuphanede = kutuphanede;
        return x;
    }
}
