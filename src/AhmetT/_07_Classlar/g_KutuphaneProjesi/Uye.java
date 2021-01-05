package AhmetT._07_Classlar.g_KutuphaneProjesi;

public class Uye {
    String name;


    public static Uye uyeOlustur(String name){
        Uye uye = new Uye();
        uye.name = name;
        return uye;
    }
}
