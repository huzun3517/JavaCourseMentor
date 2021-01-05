package Burak._08_TryCatch;

public class Ornek4 {
    public static void main(String[] args) {
        System.out.println("Kodumuz başlıyor....");

        int sayi = 0;

        int[] arr = new int[3];

        try {
            sayi = 2 / 0;

        }
        catch (ArithmeticException bolmeHata){
            System.out.println(bolmeHata.getMessage());

        }
        try {
            arr[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException arrayHatasi){
            System.out.println(arrayHatasi.getMessage());

        }
        System.out.println("Kodumuz bitiyor...");
    }
}