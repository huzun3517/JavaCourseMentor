package AhmetT._03_Method;

import java.util.Scanner;

public class j_TextDuzenle {

    // başında ortasında sonunda boşluklarla yazılmış olan bir text i normal şekline getirip yazma.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String str = scanner.nextLine();

        System.out.println(textDuzenle(str));

    }

    public static String textDuzenle(String str) {

        String strNew = "";
        strNew = str.trim().replaceAll("[ ]+"," ");

        return strNew;


    }
}
