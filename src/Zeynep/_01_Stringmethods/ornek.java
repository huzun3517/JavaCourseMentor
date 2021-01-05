package Zeynep._01_Stringmethods;

import java.util.Scanner;

public class ornek {

    public static void main(String[] args) {

        //TODO ORNEK2

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //ikinci ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Stringstr1 : ");
        String str1 = scanner.nextLine();  //mavi

        System.out.print("Stringstr2 : "); //gokyuzu
        String str2 = scanner.nextLine();

        String al1 = str1.substring(1);
        String al2 = str2.substring(1);
        System.out.println("Stringlerin ilk birleşimi: " + str1 + " " + str2);
        System.out.println("Stringlerin islemden sonraki birlesimi: " + al1 + " " + al2);
    }
}
