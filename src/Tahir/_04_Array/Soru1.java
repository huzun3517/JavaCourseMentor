package Tahir._04_Array;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        /* TODO Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu alin.

        [C, o, n, g, u, r, a, t, u, l, a, t, i, o, n, s]
        [s, n, o, i, t, a, l, u, t, a, r, u, g, n, o, C]
        snoitalutarugnoC
        Cingritilitiins  // o ,a ve u harfini i ye donuster

         */
        String str="Congratulations";
        String[]arr=str.split("");
        System.out.println(Arrays.toString(arr) ); // Stringin diziye çevrilmiş orjinal hali
        System.out.println();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals("o"))
                arr[i] = "i";

            else if (arr[i].equals("a"))
                arr[i] = "i";

            else if (arr[i].equals("u"))
                arr[i] = "i";

            System.out.print(arr[i]); // dizinin o,a,u --> i ye çevrilmiş hali.
        }
        System.out.println();
        System.out.println();

        String []yeniArr=new String[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            yeniArr[arr.length-1 - i] = arr[i];
        }

        System.out.println(Arrays.toString(yeniArr)); // dizinin ters çevrilerek yeni bir diziye atılıp yazdırılması.


    }
}
