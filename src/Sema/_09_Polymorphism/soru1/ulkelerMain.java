package Sema._09_Polymorphism.soru1;

public class ulkelerMain {

    public static void main(String[] args) {

        ulkeler ulkeler = new ulkeler();
        ulkeler.isimleri();
        ulkeler almanya = new Almanya();
        almanya.isimleri();
        ulkeler ingiltere = new Ingiltere();
        ingiltere.isimleri();

        Almanya almanya1 = new Almanya();
        almanya1.ogrenciSayisi();

        // ozaman class ların kendine ait olan metodları polymorphism ile çağıramıyoruz.
        // Kendine ait obje oluşturmamız gerekiyor.

    }
}
