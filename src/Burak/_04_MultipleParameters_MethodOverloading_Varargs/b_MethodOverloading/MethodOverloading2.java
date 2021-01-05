package Burak._04_MultipleParameters_MethodOverloading_Varargs.b_MethodOverloading;

public class MethodOverloading2 {
    public static void main(String[] args) {

        //todo Method Overloading ---- Method'a Aşırı Yükleme ---- Farklı tip parametrelerle
            dersNotu("Burak", 78, 80.14, true);
            dersNotu("Nazif", 68, 55.15);
            dersNotu("Nesibe", 90, true);
            dersNotu("Hasan", 60);
            dersNotu("Ömer", 100, 100.00, true);
            //Tek method ile farklı değerleri çıkarıp ekleyebiliyoruz. Buna methoda aşırı yükleme deniyor.

    }
    public static void dersNotu(String isim, int not, double ortalama, boolean dersDurumu){
        System.out.println("Öğrencinin adı: " + isim + " - " + " Sınav notu: " + not + " - " + "Ortalaması: " + ortalama + " - " + "Dersten geçebildi mi? : " + dersDurumu);
    }
    public static void dersNotu(String isim, int not, double ortalama){
        System.out.println("Öğrencinin adı: " + isim + " - " + " Sınav notu: " + not + " - " + "Ortalaması: " + ortalama);
    }
    public static void dersNotu(String isim, int not, boolean dersDurumu){
        System.out.println("Öğrencinin adı: " + isim + " - " + " Sınav notu: " + not + " - " + "Dersten geçebildi mi? : " + dersDurumu);
    }
    public static void dersNotu(String isim, int not){
        System.out.println("Öğrencinin adı: " + isim + " - " + " Sınav notu: " + not);
    }
}
