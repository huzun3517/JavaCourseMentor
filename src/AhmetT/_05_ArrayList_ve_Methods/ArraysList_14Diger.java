package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_14Diger {
    public static void main(String[] args) {
        /*
            subList(int fromIndex, int toIndex)
            Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

         */
        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        // list.subList(2,5); 2. index dahil, 5. index haric
        System.out.println("list.subList(2,5) : " + list.subList(2,5));

        // yeni bir list1 arrayList'i list.subList() ile de tanimlanabilir
        ArrayList<Integer> list1 = new ArrayList<>(list.subList(4,8));

        System.out.println("list.subList(4,8) ile list1 tanimlandi : " + list1);

    }

}
