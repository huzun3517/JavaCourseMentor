package Burak._06_ClassMethods.a_ClassMethods;

public class b_Static_vs_NonStatic {

    //todo            Static Method vs Static Olmayan Method
    //todo            void = hiçlik
    //todo            Static'leri Static elektrik olarak kodlayabilirsiniz.

    public static void buMethodStatic(){
        System.out.println("Merhaba");

    }
    public void buMethodStaticDegil(){
        System.out.println("Selamlar");

    }

    public static void main(String[] args) {
        buMethodStatic();
        // buMethodStaticDegil();  Bu Compile Error verir.

        // Bu yöntem static olayan methodu çağırmamıza yarıyor.
        b_Static_vs_NonStatic yeniObje = new b_Static_vs_NonStatic();
        yeniObje.buMethodStaticDegil();
    }
}
