package AhmetT._07_Classlar.b_Class1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nüfus:" + Insan.nufus);

        Insan ali = Insan.insanOlustur("Ali", 25);
        System.out.println(ali.name + ", " + ali.age + ", " + ali.numara + "    Nüfus:" + Insan.nufus);

        Insan veli = Insan.insanOlustur("Veli", 20);
        System.out.println(veli.name + ", " + veli.age + ", " + veli.numara + "    Nüfus:" + Insan.nufus);

        Insan ayse = Insan.insanOlustur("Ayse", 19);
        System.out.println(ayse.name + ", " + ayse.age + ", " + ayse.numara + "    Nüfus:" + Insan.nufus);

        System.out.println(ali.yasiKac());
        System.out.println(veli.yasiKac());
        ali.numara = 10;
        System.out.println(ali.name + ", " + ali.age + ", " + ali.numara + "    Nüfus:" + Insan.nufus);
    }
}