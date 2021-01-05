package Zeynep._05_object_class;

public class Ogrenci {

    // TODO
    //  isim, bolum, yas, birinciSinav, ikinciSinav ve ucuncuSinav instance variable
    //  (degiskenlerini) iceren bir Ogrenci class i olusturunuz
    //  ogrencinin not ortalamasini hesaplayacak bir method olusturunuz.

    String isim;
    String bolum;
    int yas;
    int birinciSinav;
    int ikinciSinav;
    int ucuncuSinav;

    int notOrtalamasi(){

        return (birinciSinav+ikinciSinav+ucuncuSinav)/3;
    }


}
