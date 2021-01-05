package AhmetT._03_Method;

import java.util.Scanner;

public class i_ArrayStringRevers {

     /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String str = scanner.nextLine();


        System.out.println(reverseStr(textDuzenle(str))); // iç içe 2 metod kullandık. Önce textDuzenle yi kullandık
        // metnin boşluklarını duzenledik. Sonra da reverseStr ile tersten yazdırdık.

    }

    public static String textDuzenle(String str) {
        // başında ortasında sonunda boşluklarla yazılmış olan
        // bir text i normal şekline getirip yazma.

        String strNew = "";
        strNew = str.trim().replaceAll("[ ]+"," ");

        return strNew;


    }


    public static String reverseStr(String str) {
        // Stringi ters yazma

        String stRet = "";

        for(int i=str.length()-1;i>=0;i--){
            stRet += str.charAt(i);
        }
        return stRet;

    }

    public static void reverseStr1(String str) {
        // dizi ile ters yazma

        String[] cumle = str.split("");

        for (int i = cumle.length-1; i >= 0 ; i--) {
            System.out.print(cumle[i]);


        }
    }


}
