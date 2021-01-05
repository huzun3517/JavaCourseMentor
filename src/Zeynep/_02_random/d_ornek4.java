package Zeynep._02_random;

import java.util.Scanner;

public class d_ornek4 {

    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise sift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

        Scanner scanner = new Scanner(System.in);

        System.out.print("Min : ");
        int max = scanner.nextInt();
        System.out.print("Max : ");
        int min = scanner.nextInt();

        int random = (int) (Math.random() * ((max - min) + 1)) + min;
        if (random %2 == 0) {
            System.out.println("Çift sayı");
        }
        else {
            System.out.println("Tek sayı");
        }

        //2.Yol ternary operator ile

        String str =(random %2 == 0) ? "cift sayidir" : "tek sayidir";

    }


}
