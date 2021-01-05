package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;

public class ArrayList_01Tanimlama {
    public static void main(String[] args) {
        /*
            Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            ArrayList<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitivelerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir
         */

        // Bazi tanimlamalar
        ArrayList<String> arrStr = new ArrayList<String>();
        ArrayList<String> arrStr1 = new ArrayList<>();
        ArrayList<Integer> arrInt = new ArrayList<>();
        ArrayList<Boolean> arrBool = new ArrayList<>();

    }
}
