package AhmetT._04_Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_ozet {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(30);
        System.out.println(arrayList); // [10, 40, 30]

        arrayList2.add(100);
        arrayList2.add(200);
        System.out.println(arrayList2); // [100, 200]

        arrayList.add(20);
        System.out.println(arrayList); // [10, 40, 30, 20]

        arrayList.add(2,25);
        System.out.println(arrayList); // [10, 40, 25, 30, 20]

        arrayList.addAll(arrayList2);
        System.out.println(arrayList); // [10, 40, 25, 30, 20, 100, 200]

        Collections.sort(arrayList);
        System.out.println(arrayList); // [10, 40, 25, 30, 20, 100, 200]

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList); // [10, 20, 25, 30, 40]

        int[] dizi = {1,2,3}; // 3 elemanlı dizi oluşturduk.

        for (int n : dizi)  // 3 elemanlı diziyi arrayList imizin içine attık.
            arrayList.add(n);
        System.out.println(arrayList); // [10, 20, 25, 30, 40, 1, 2, 3]

        System.out.println(dizi[0]); // dizimizin 0.indeksi --> 1
        System.out.println(arrayList.get(0)); // arraylistimizin 0.indeksi --> 10
    }
}
