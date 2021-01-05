package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;

public class ArraysList_08add {
    public static void main(String[] args) {
        /*
            add(Object o)                # ArrayList'e o elemanini sona ekler
            add(int index, Object o)     # ArrayList'in belirlenen indexsine elemenan ekler ve arrayin elemanlarini birer kaydirir
            size()                       # ArrayList'in eleman sayisini döndürür. array'lerdeki length gibi.
         */

        // ArrayList tanimlaniyor
        ArrayList<Integer> list = new ArrayList<>();

        // eleman ekleniyor
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        // list yazdiriliyor
        System.out.println(list);

        // list size()
        System.out.println("list.size() : " + list);

        // belirli indexlere yeni elemanlar ekleniyor
        list.add(3, 10);        // 3 nolu index'e 10 ekler digerlerisi öteler
        list.add(5, 11);        // 5 nolu index'e 11 ekler digerlerisi öteler
        //list.add(20, 100);                   // hata verir cünkü 20 nolu index yok

        // ArrayList ekrana yazdiriliyor
        System.out.println("list.add(3,10); ve lias.add(5,11); sonrasi: ");
        System.out.println(list);

    }
}
