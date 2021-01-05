package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_11get_set {
    public static void main(String[] args) {
        /*
            get(int index)
            # belirtilen index teki elemani verir.

            set(int index, E element)
            # AraryList'in belirtilen index elemanina element degerini yazar
         */

        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("list : " + list);
        System.out.println("2 indexli elemani list.get(2); ile cagriliyor: ");
        System.out.println(list.get(2));

        list.set(2, 100);
        System.out.println("list'n 2 index nolu elemani list.set(2, 100); ile 100 yapiliyor : ");
        System.out.println(list);
    }
}
