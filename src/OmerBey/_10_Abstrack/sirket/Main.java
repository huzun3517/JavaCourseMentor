package OmerBey._10_Abstrack.sirket;

public class Main {

    public static void main(String[] args) {

        insan ogrenci = new calisan("Ömer","Özdemir",0);
        insan sekreter = new calisan("Hande","Yılmaz",123);
        insan danisman = new calisan("Hüseyin","Özdemir",22);

        ogrenci.bilgilendirme();
        ogrenci.calis();
        System.out.println("--------------------------");

        danisman.bilgilendirme();
        danisman.calis();
        System.out.println("--------------------------");

        sekreter.bilgilendirme();
        sekreter.calis();
        System.out.println("--------------------------");

        sekreter.isimDegistir("Mahmut","Akçay");
        sekreter.bilgilendirme();
        System.out.println("--------------------------");






    }
}
