package Zeynep._05_object_class;

public class AnaSinif {

    public static void main(String[] args) {

        Sinif sinif = new Sinif();
        sinif.konu = "Java";

        sinif.ogrenci = new Ogrenci();
        sinif.ogrenci.isim = "Hasan";
        sinif.ogrenci.bolum = "bilgisayar";
        sinif.ogrenci.yas = 20;
        sinif.ogrenci.birinciSinav = 69;
        sinif.ogrenci.ikinciSinav = 75;
        sinif.ogrenci.ucuncuSinav = 89;

        sinif.ogretmen = new Ogretmen();
        sinif.ogretmen.isim = "Ali";
        sinif.ogretmen.bolum = "Muhendis";
        sinif.ogretmen.deneyim = 5;

        System.out.println(sinif);





    }
}
