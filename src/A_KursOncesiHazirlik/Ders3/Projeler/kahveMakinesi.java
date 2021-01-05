package A_KursOncesiHazirlik.Ders3.Projeler;

import java.util.Scanner;

public class kahveMakinesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Kahve makinesine hoşgeldiniz.... ");
        System.out.println("1.Americano");
        System.out.println("2.Türk Kahvesi");
        System.out.println("3.Cappicino");
        System.out.println("4.Sütlü Kahve");

        System.out.print("Kahvenizin numarasını seçin: ");
        int num = scanner.nextInt();


        if (num == 1) {
            System.out.println("Mericanonuz hazırlanıyor...");
        }

        else if (num == 2){
            System.out.println("Türk kahvesi hazırlanıyor...");

        }

        else if (num == 3){
            System.out.println("Cappicino hazırlanıyor...");

        }

        else if (num == 4){
            System.out.println("Sütlü kahve hazırlanıyor...");

        }

        else {
            System.out.println("Hatalı giriş yaptınız...");
        }





    }
}
