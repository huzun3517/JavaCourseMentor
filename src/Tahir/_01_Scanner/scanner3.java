package Tahir._01_Scanner;

import java.util.Scanner;

public class scanner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vize1;
        int vize2;
        int finalnot;

        System.out.print("Vize1: ");
        vize1 = scanner.nextInt();

        System.out.print("Vize2: ");
        vize2 = scanner.nextInt();

        System.out.print("Final: ");
        finalnot = scanner.nextInt();

        double sonuc = ((vize1 + vize2)/2) * 0.3 + (finalnot * 0.7);
        System.out.println("Sonuc: " + sonuc);
    }
}
