package A_KursOncesiHazirlik.Ders3.Projeler;

import java.util.Scanner;

public class TechnoSporSalonu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Techno Spor Salonu'na hoşgeldiniz!");

        System.out.print("İsim Soyisim: ");
        String isim = scanner.nextLine();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Kilo: ");
        double kilo = scanner.nextDouble();

        System.out.print("Boy: ");
        double boy = scanner.nextDouble();

        System.out.print("Kaç aylık kaydolacaksınız: ");
        int aylik = scanner.nextInt();

        int aylik_ucret = 20;

        int toplam_tutar = aylik_ucret * aylik;

        System.out.print("Toplam Tutar: " + toplam_tutar + " Euro");



    }
}
