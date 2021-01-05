package Burak._10_Interface.Ornek1;

public class Main {

    public static void main(String[] args) {

        Calisan calisan = new Calisan();
        Ogrenci ogrenci = new Ogrenci();

        IDatabase calisan2 = new Calisan();

        calisan.hesapAcma();
        ogrenci.hesapAcma();

        calisan2.hesapAcma();
    }
}
