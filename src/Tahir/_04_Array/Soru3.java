package Tahir._04_Array;

import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {
        //TODO  $ ve  € isareti olanlarin toplamlarini ayri ayri bulun

        String arr="$1 $23 $134 $2 $7 $24 32 €40 €2 €65 €4";

        String[] dizi = arr.split(" ");
        System.out.println(Arrays.toString(dizi));

        int topDolar = 0;
        int topEuro = 0;

        for (int i = 0; i <dizi.length ; i++) {

            if (dizi[i].contains("$"))
                topDolar += Integer.parseInt(dizi[i].replace("$",""));

            else  if (dizi[i].contains("€"))
                topEuro += Integer.parseInt(dizi[i].replace("€",""));
        }

        System.out.println("topDolar = " + topDolar);
        System.out.println("topEuro = " + topEuro);





    }
}
