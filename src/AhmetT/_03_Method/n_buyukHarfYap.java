package AhmetT._03_Method;

import java.util.ArrayList;

public class n_buyukHarfYap {

    public static void main(String[] args) {


    }

   /* Aldigi stringin istedigimiz indexli karakterlerini büyük digerlerini kücük yapan method
    String strNew = buyukHarfYap("meRhaba java", 0, 8,11);   ---> Merhaba JavA

    */
    public static String buyukHarfYap(String str, int...indexler){
        ArrayList<Integer> listTemp = new ArrayList<>();
        for (int n : indexler) listTemp.add(n);
        str = str.trim().toLowerCase();
        String[] strArr = str.split("");
        String strReturn="";
        for(int i=0; i<strArr.length; i++)
            if (listTemp.contains(i)) strReturn += strArr[i].toUpperCase();
            else strReturn += strArr[i];

        return strReturn;
    }

}
