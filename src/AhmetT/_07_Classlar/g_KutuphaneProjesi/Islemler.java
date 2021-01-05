package AhmetT._07_Classlar.g_KutuphaneProjesi;

public class Islemler {

    String name;                // Instance variable        // fields, attributes, properties
    static String name1;        // class variable

    void denem(){
        String s = name;
        name = "isim";
        int num=0;
    }

    // class a ait
    public static int cikartma(int a, int b){
        return a-b;
    }

    // Obje, Instance, nesne  ye aittir.
    double bolme(double a, double b){
        return a/b;
    }
}
