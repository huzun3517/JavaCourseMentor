package Tahir._01_Scanner;

import java.util.Scanner;

public class scanner2 {

    public static void main(String[] args) {

        /* rakamla bir sayi yazdir int olsun
        String olan bir sayi yazdir
        sonra yazdirdiğin sayilarin toplam değerini int olarak yazdirin.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Int olan bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        scanner.nextLine();


        System.out.print("String olan sayı giriniz: ");
        String sayiString = scanner.nextLine();
        int sayison = Integer.parseInt(sayiString);


        int toplam = sayi + sayison;
        System.out.println("Toplam =" + toplam);


    }
}
