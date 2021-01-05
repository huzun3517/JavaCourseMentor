package Burak._06_ClassMethods.c_Odev_2.Yontem;

public class Araba {


     String renk;
     int kapilar;
     int tekerlekler;
     String motor;
     String model;

     public static Araba arabaEkle(String renk, int kapilar, int tekerlekler, String motor, String model){

         Araba araba = new Araba();
         araba.renk = renk;
         araba.kapilar = kapilar;
         araba.tekerlekler = tekerlekler;
         araba.motor = motor;
         araba.model = model;

         return araba;
     }

     public static void printAraba(Araba araba){

         System.out.println(araba.renk);
         System.out.println(araba.kapilar);
         System.out.println(araba.tekerlekler);
         System.out.println(araba.motor);
         System.out.println(araba.model);
     }
}

