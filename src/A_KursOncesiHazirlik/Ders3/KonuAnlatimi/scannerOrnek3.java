package A_KursOncesiHazirlik.Ders3.KonuAnlatimi;

import java.util.Scanner;

public class scannerOrnek3 {

    public static void main(String[] args) {

        //TODO DOUBLE ÖRNEGİ
        //  Double normalde . ile kullanılır ancak konsola yazarken ondalık kısmı ,(virgül) ile yazmalısınız.
        // double ' ı konsola yazarken , kullanıyoruz.

        Scanner sc = new Scanner(System.in);


        System.out.print("Lise notunuzu giriniz:");

        double liseNotu = sc.nextDouble();


        System.out.print("Üniversite notunuzu giriniz:");

        double uniNotu = sc.nextDouble();


        System.out.println("Lise diploma notunuz: " + liseNotu + "\n" + "üniversite notunuz:" + uniNotu);

    }


}
