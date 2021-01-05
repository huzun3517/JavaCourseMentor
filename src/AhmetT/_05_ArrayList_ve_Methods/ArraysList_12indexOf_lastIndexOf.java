package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_12indexOf_lastIndexOf {
    public static void main(String[] args) {
        /*
            indexOf(Object O)
            # Belirtilen elemanin ilk bulunma indexini verir, eleman yoksa -1 döner.

            lastIndexOf(Object O)
            # Belirtilen elemanin son bulunma indexini verir, eleman yoksa -1 döner.
         */

        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,7,8,9));

        System.out.println("list : " + list);
        System.out.println("2 elemaninin list.indexOf(2); ilk bulunma index'i bulunuyor: ");
        System.out.println(list.indexOf(2));

        System.out.println("2 elemaninin list.lastIndexOf(2); son bulunma index'i bulunuyor: ");
        System.out.println(list.lastIndexOf(2));
    }}
