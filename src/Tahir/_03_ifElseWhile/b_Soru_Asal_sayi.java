package Tahir._03_ifElseWhile;

import java.util.Scanner;

public class b_Soru_Asal_sayi {

    public static void main(String[] args) {

        // Bir sayı giriniz. Bu sayi asal sayiMi?
        // Girdiğimiz sayıya kadar butun asal sayıarı yazdıralım.
        // Sadece 1 e ve kendine bolunebilen sayilara asal sayi denir.(Prime number)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        int sayac = 2;
        boolean isPrime = true;

        while (sayac < sayi){
            if (sayi % sayac == 0) {
                isPrime = false;
                break;
            }
            sayac++;
        }
        if (isPrime == true) {
            System.out.println("Asal");
        }
        else {
            System.out.println("Asal değil");
        }
    }
}
