package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_10contains_clear_isEmpty {
    public static void main(String[] args) {
        /*
            contains(Object o)  # ArrayList'de belirtilen o elemanini arar varsa true döndürür
            clear()             # listedeki tüm elemanlari siler.
            isEmpty()           # ArrayList'de hic eleman yoksa true, en az bir eleman varsa false döner
         */

        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        // list ekrana yazdiriliyor
        System.out.println(list);

        System.out.print("list.contains(3)    sonucu: ");
        // list icinde 3 var mi kontrol ediliyor
        if (list.contains(3))
            System.out.println("list'te 3 var");
        else
            System.out.println("list'te 3 yok ");

        System.out.print("list.contains(3)    sonucu: ");
        // list icinde 20 var mi kontrol ediliyor
        if (list.contains(20))
            System.out.println("list'te 3 var");
        else
            System.out.println("list'te 3 yok ");


        // list isEmpty(); ile kontrol ediliyor
        System.out.print("list.isEmpty() :  ");
        System.out.println(list.isEmpty());

        // list clear(); ediliyor
        System.out.print("list.clear()'dan sora list:  ");
        list.clear();
        System.out.println(list);

        // list isEmpty(); ile kontrol ediliyor
        System.out.print("list.isEmpty() :  ");
        System.out.println(list.isEmpty());
    }
}
