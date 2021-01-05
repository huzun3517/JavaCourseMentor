package AhmetT._08_GenelTekrar;

import java.util.Arrays;
import java.util.TreeSet;

public class Task05 {
    // TODO
    //  String[] hangiHarflerVar(String str)
    //  aldigi str icinde hangi harfler oldugunu array olarak return eden method yaziniz
    //  "abaababccd"    --> {'a', 'b', 'c', 'd'}

    public static void main(String[] args) {

        System.out.println(Arrays.toString(hangiHarflerVar("abaababccd")));


    }

    public static String[] hangiHarflerVar(String str) {

        String[] arrStr = str.split("");
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(arrStr));
        String[] arrReturn = new String[ts.size()];

        int i =0;
        for (String s : ts)
            arrReturn[i++] = s;
        return arrReturn;

    }

    /*
    public static String[] hangiHarflerVar(String str){ //  "abaababccd"
        String[] arrStr = str.split("");          //    {"a", "b", "a", ...., "d"}
        ArrayList<String> arrNew = new ArrayList<>();

        for (int i = 0; i < arrStr.length; i++) {
            String ch = arrStr[i];
            boolean buldum = false;

            for (int j = 0; j < arrNew.size(); j++) {
                if (arrNew.get(j).equals(ch)){
                    buldum = true;
                }
            }
            if (!buldum)
                arrNew.add(ch);

        }

        String[] arrReturn = new String[arrNew.size()];
        int i=0;
        for (String s : arrNew)
            arrReturn[i++] = s;
        return arrReturn;
    }
     */
}
