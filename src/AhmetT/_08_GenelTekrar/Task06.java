package AhmetT._08_GenelTekrar;

import java.util.Scanner;

public class Task06 {
     // TODO
    //   String verialString()           kullanicidan bir string alan method yaziniz
    //   tersYaz(String str)             veriAlString() ile aldigi stringin tamamini ters cevirip return eden methodu yazin
    //   kelimeleriTersYaz(String str)   veriAlString() ile aldigi stringin sadece kelimelerini ters cevirip return eden methodu yaziniz
    //   oteleString(String str)         veriAlString() ile kullanicidan alinan stringin her bir harfini ötele.
    //                                   abcd--> bcde             zdeZ--> aefA

    public static void main(String[] args) {

        String str = verialString("Cümle giriniz: ");

   //     System.out.println(tersYaz(str));

   //     System.out.println(kelimeleriTersYaz(str));

        System.out.println(oteleString(str));


    }

    public static String verialString(String yazi){
        Scanner scanner = new Scanner(System.in);
        System.out.print(yazi + ": ");
        return scanner.nextLine();
    }


    public static String tersYaz(String str){

        String strReturn = "";

        str = str.trim().replaceAll("[ ]"," ");

        for (int i = str.length()-1; i >= 0 ; i--) {

            strReturn += str.charAt(i);
        }
        return strReturn;
    }


    public static String kelimeleriTersYaz(String str){


        String[] arr =  str.trim().replaceAll("[ ]+"," ").split(" ");

        String strTers = "";

        for (int i = arr.length-1; i >= 0; i--) {

            strTers += arr[i] + " ";
        }

        return strTers.trim();
    }

    public static String oteleString(String str){

        str = str.trim().replaceAll("[ ]"," ");

        char[] charArr = str.toCharArray();

        String strNew ="";

        for (int i = 0; i < charArr.length ; i++) {

            char c = charArr[i];

            if (c == 'z')
                strNew += 'a';

            else if (c == 'Z')
                strNew += "A";

            else if (c== ' ')
                strNew += " ";

            else
                strNew += (char)(c + 1);
        }
        return strNew;
    }
}