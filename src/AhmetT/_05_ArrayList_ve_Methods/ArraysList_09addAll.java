package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList_09addAll {
    public static void main(String[] args) {
         /*
            addAll(Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri (daha sonra görülecek)) sona ekler

            addAll(int index, Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri)  belirtilen indexten itibaren ekler
            # arrayin kalan elemanlarini kaydirir
         */

        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        // ArrayList list1 tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> list1 = new ArrayList<>(List.of(10,20,30,40,50));

        // ArrayList list2 tanimlanip, initializer icinde initialize ediliyor
        ArrayList<Integer> list2 = new ArrayList<>(){
            {
                for (int i = 0; i <10 ; i++) {
                    add(i);
                }

            }
        };

        // list yazdirliliyor
        System.out.println("list : " + list);

        // list2 elemanlari list'e ekleniyor
        list.addAll(list1);

        // ArrayList ekrana yazdiriliyor
        System.out.println("list1'in sona eklenmis hali");
        System.out.println("list : " + list);


        // list3 elemanlari list'e ekleniyor
        list.addAll(3, list1);

        // ArrayList ekrana yazdiriliyor
        System.out.println("list3'ün 3.indexten itibaren eklenmis hali");
        System.out.println("list : " + list);


    }
}
