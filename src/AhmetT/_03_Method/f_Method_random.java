package AhmetT._03_Method;

import java.util.Scanner;

public class f_Method_random {

    public static void main(String[] args) {

        // 0-10 arası random atanan sayıların toplamını method ile yapınız. Mainde toplam sonucunu bastırınız.

        Scanner scanner = new Scanner(System.in);

        int sayi = (int)(Math.random()*10);

        int sonuc = toplamYaz(sayi,sayi);
        System.out.println("Toplam sonuc= " + sonuc);



    }
    public static int toplamYaz(int...sayilar) {
        int toplam = 0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam += sayilar[i];

        }
        return toplam;
    }


}
