package Zeynep._04_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class a_SetNedir {

    public static void main(String[] args) {

        /*
        HashSet
        değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)

        ayni değerlerin birden fazla olmasına izin vermez

        sadece bir null değeri alabilir.(treeSet hariç)
        LinkedHashSet                          TreeSet
        giriş sırasına dikkat eder.     alfabetik ya da küçükten büyüğe.
         */

        HashSet<String> set = new HashSet<>();
        set.add("kaplan");
        set.add("aslan");
        set.add("zurafa");
        set.add("fil");
        set.add("kedi");
        set.add("kedi");
        System.out.println("set = " + set);

        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("kaplan");
        treeset.add("aslan");
        treeset.add("zurafa");
        treeset.add("fil");
        treeset.add("kedi");
        treeset.add("kedi");
        System.out.println("treeset = " + treeset);

        LinkedHashSet<String> link = new LinkedHashSet<>();
        link.add("kaplan");
        link.add("aslan");
        link.add("kedi");
        link.add("zurafa");
        link.add("ayi");
        System.out.println("link = " + link);







    }
}
