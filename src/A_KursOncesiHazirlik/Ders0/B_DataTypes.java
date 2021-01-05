package A_KursOncesiHazirlik.Ders0;

public class B_DataTypes {
    public static void main(String[] args) {

        // Primitive Data Types-- ilkel veri tipleri
        /*


        Tamsayi veri tipleri
        byte
        short
        int
        long

        Ondalik sayi veri tipler
        float
        double

        boolean
        char

         */


        System.out.println("============Byte==============================================");

       // Byte=8 bit
        // Byte bellekte 8 bitlik yer kaplar. -128 ile 127 arasinda degerler alir
        byte b=3;
       // byte bSayi=200;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println("============Short==============================================");
    //  bellekte 16 bitlik yer kaplar. -32768 ile 32767 araliginda degerler alir

        short sSayi=234;
        short s=3;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println("============int==============================================");

        // bellekte 32 bitlik yer kaplar.-2147483648 ile 2147483647 araliginda degerler alir

          int iSayi= 23;
        System.out.println(iSayi);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println("============long==============================================");
// bellekte 64 bitlik yer kaplar.-2147483648 ile 2147483647 araliginda degerler alir
        long lSayi=3231243845555L;
        long lg=3;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println("============float==============================================");
        // bellekte 32 bitlik yer kaplar.


        float f=3f;
        float f1=3.2f;
       // double d=3.4;
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println("============double==============================================");
        // bellekte 64 bitlik yer kaplar.

        double d1=3.5;
        double d2=4;
        double d3=4.0;
        double d4=2.6d;


        // pi sayisi= 3.14

        int i1=22/7;
        float i2=22/7f;
        double i3=22/7d;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("============boolean==============================================");

        boolean b1=true;
        boolean b2=false;
        System.out.println(b1);

        System.out.println("============char==============================================");
        // char 2^16 karakteri simgeler
        // unicode karakterleri simgeler
        char c1='A';
        System.out.println(c1);
        char c2='?';
        System.out.println(c2);
        char c3='*';
        char c4=19;
        System.out.println(c4);
    }
}
