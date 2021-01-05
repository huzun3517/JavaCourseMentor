package Burak._02_While_DoWhile.WhileLoops;

import java.util.Scanner;

public class c_while {

    public static void main(String[] args) {

        //TODO STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    /*    String pin_sys = "Hu.180884";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Pin kodunuzu giriniz: ");
        String pin = scanner.nextLine();

        while (!pin.equals(pin_sys)){
            System.out.println("Yanlış pin kodu girdiniz.");
             pin = scanner.nextLine();
        }
         System.out.println("Başarı ile giriş yapıldı...");

     */

     /*   String pin_sys = "Hu.180884";
        int kalanhak = 3;

        Scanner scanner = new Scanner(System.in);



        do {
            System.out.print("Lütfen Pin kodunuzu giriniz: ");
            String pin = scanner.nextLine();

            if (pin_sys.equals(pin)){
                System.out.println("Başarı ile giriş yaptınız...");break;
            }
            else {
                System.out.println("Yanlış pin kodu girdiniz...");
                kalanhak--;
                System.out.println("Kalan hakkınız: " + kalanhak);
            }

    }while (kalanhak > 0);
        if (kalanhak == 0)
        System.out.println("Giriş hakkınız bitti...");

      */

        Scanner scanner = new Scanner(System.in);
        String pin_sys = "Hu.180884";
        int giris_hakki = 3;

        System.out.println("***************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("***************************");

       while (true){
           System.out.print("Pin kodunuzu giriniz: ");
           String pin = scanner.nextLine();

           if (pin.equals(pin_sys)){
               System.out.println("Başarı ile giriş yaptınız...");
               break;
           }

               else {
                   System.out.println("Yanlış giriş yaptınız...");
                   giris_hakki -= 1;
                   System.out.println("Giriş hakkınız: " + giris_hakki);
               }

           if (giris_hakki == 0){
               System.out.println("Giriş hakkınız kalmadı. Tekrar bekleriz...");
               break;
           }
       }


    }



}


