package Zeynep._05_object_class;

public class Sinif {
    /*TODO
       konu ve ogrenci/ogretmen siniflarini da cagiracak sekilde instance variable lar olusturunuz.
       ogrencinin olusturdugu raporu verecek bir toString methodu olusturunuz.
       soyle gozukmeli:

        Dersin konusu: Java
        Isim: Hasan
        Yas: 26
        Bolum: Bilgisayar
        Not ortalamasi: 67

        Ogretmenin adi: Ali
        Mezun oldugu bolumu: Isletme
        Ogretmenin kalitesi: Olaganustu kaliteli bir ogretmen
     */

    String konu;
    Ogrenci ogrenci;
    Ogretmen ogretmen;


    public String toString(){

        return "Dersin konusu : " + konu +
                "\n ogrenci ismi: " + ogrenci.isim +
                "\n bolumu: " + ogrenci.bolum +
                "\n yasi: " + ogrenci.yas +
                "\n ilksinav: " + ogrenci.birinciSinav+
                "\n ikincisinav: " + ogrenci.ikinciSinav +
                "\n ucuncusinavi: " + ogrenci.ucuncuSinav +
                "\n ortalamasi: " + ogrenci.notOrtalamasi()+

                "\n\n ogretmenin ismi: " + ogretmen.isim +
                "\n bolumu: " + ogretmen.bolum+
                "\n deneyim: " + ogretmen.deneyim+
                "\n kalitesi: "+ ogretmen.ogretmenimNasil();
    }


}
