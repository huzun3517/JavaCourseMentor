package A_KursOncesiHazirlik.Ders3.KonuAnlatimi;

import java.util.Scanner;

public class ornek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen otomatik mesaj bırakınız: ");
        String mesaj = scanner.nextLine();

        System.out.println("Mesajınız: " + mesaj);
        System.out.println("Mesajınız: " + mesaj.toUpperCase());
        System.out.println("Mesajınız: " + mesaj.length());




    }
}
