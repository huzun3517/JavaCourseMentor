package AhmetT._03_Method;

import java.util.ArrayList;

public class g_Method_Arraylist {

    // Method ile Arraylist gönderme

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(30);
        System.out.println(arrayList); // [10, 40, 30]

        System.out.println(aListTopla(arrayList)); // toplam--> 80

        System.out.println(aListtopla(arrayList,5)); // --> 5 tane random sayı ekle


    }

    public static int aListTopla(ArrayList<Integer> lst) {
        int sum = 0;
        for (int n : lst)
            sum +=n;
        return sum;

    }

    public static ArrayList<Integer>aListtopla(ArrayList<Integer> lst, int n) {
        for (int i =0; i < n; i++)
            lst.add((int)(Math.random()*100));
        return lst;
    }

}
