package Tahir._04_Array;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //TODO Kullanicidan aldigimiz 6 elemanli arrayin icinde kac tane 3 e bolunebilen sayi vardir ?
        
        int [] dizi = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(i + ".indexi giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        int sayac = 0;

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i] % 3 == 0)
                sayac++;
        }
        System.out.println(sayac);



    }
}
