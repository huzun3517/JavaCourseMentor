package AhmetT._02_Arrays;

import java.util.Scanner;

public class c_Array_ters_yazdirma {

    public static void main(String[] args) {

        // Önünde ve arkasında boşluklar olan bir cümle giriniz.
        // Bu cümleyi ters çeviriniz ve yazdırınız.
        //          Merhaba          Dunya
        // a y n u D   a b a h r e M

        Scanner scanner = new Scanner(System.in);
        System.out.print("Önünde ve arkasında boşluklar olan bir cümle giriniz: ");
        String text = scanner.nextLine();



   /*
        String str1 = text.trim(); // Merhaba          Dunya
        String str2 = str1.replaceAll("\\s+"," "); //Merhaba Dunya
        String[] strArr = str2.split(" ");
        
    */
        
        String[] strArr = text.trim().replaceAll("\\s+"," ").split("");

    /*    for (String s: strArr) {
            System.out.println(s + " ");
        }

     */

        for (int i = strArr.length-1; i >= 0 ; i--) {
            System.out.print(strArr[i] + " ");

        }

    }
}
