package A_KursOncesiHazirlik.scannerOdevler;

import java.util.Scanner;

public class KarakterUzunluguHesaplama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1. stringi giriniz: ");
        String bir = sc.nextLine();
        System.out.println("Karakter sayısı: " + bir.length());

        System.out.print("2. stringi giriniz: ");
        String iki = sc.nextLine();
        System.out.println("Karakter sayısı: " + iki.length());

        int toplam = bir.length() + iki.length();
        System.out.println("Karakter sayıları toplamı: " + toplam);
    }
}


        /*          todo KARAKTER SAYISI BULMA
        1. 3 ayrı String değeri girin.

         Sistemin isteyecekleri : -->>  (soru olarak 1. string giriniz:     2. stringi giriniz:   .... )
        2. Stringlerin "ayrı ayrı "karakter sayısını bulun ve her Stringi girdiğinizde altına yazdırın.

       todo örn: 1.Stringi giriniz: Merhaba
                 Uzunluğu: 7

        3. son olarak tüm karakter sayılarını birbiri ile toplayınız.
        4.Toplamı yazdırınız.



         */


