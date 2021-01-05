package Burak._08_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kodumuz başlatılıyor...");

        try {
            System.out.print("Bir int değeri gir: ");
            scanner.nextInt();
        }
        catch (ArithmeticException bolmeHatasi){
            System.out.println(bolmeHatasi.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException arrayHatasi){
            System.out.println(arrayHatasi.getMessage());
        }
        catch (InputMismatchException scannerHatasi){
            System.out.println(scannerHatasi.toString());
        }
        finally {
            System.out.println("Finally her durumda çalışır.");
        }
        System.out.println("Kodumuz bitiyor...");




    }
}
