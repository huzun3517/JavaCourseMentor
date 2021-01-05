package AhmetT._06_List_Sets;

import java.util.ArrayList;
import java.util.Collections;

public class b_Soru1 {

    /*  Method:
        Aldigi boyutta ArrayList hazirlayan ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz

        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */


    public static void main(String[] args) {

     //   System.out.println(arrListHazirla(10,5,10)); // metodu burada parantez içinde kullanabiliriz. değişken ataması yapar.

    //    ArrayList<Integer>arrayList1 = new ArrayList<>(arrListHazirla(10,5,10));

        ArrayList<Integer>arrayList1 = new ArrayList<>();
        arrayList1 = arrListHazirla(10,5,10);

        ArrayList<Integer>arrayList2 = new ArrayList<>();
        arrayList2 = arrListHazirla(5,0,20);

        System.out.println("arrList1 = " + arrayList1);
        System.out.println("arrList2 = " + arrayList2);

    //    arrayList1.retainAll(arrayList2);//Kesişimi
    //    System.out.println(arrayList1);

        ArrayList<Integer> arrayListFark1 = new ArrayList<>();
        ArrayList<Integer> arrayListFark2 = new ArrayList<>();

        arrayListFark1 = arrayList1;
        arrayListFark2 =arrayList2;

        arrayListFark1.removeAll(arrayList2); //1 in 2 den farkı
        System.out.println("arrListFark1 = " + arrayListFark1);

        arrayListFark2.removeAll(arrayList1); //2nin 1 den farkı
        System.out.println("arrListFark2 = " + arrayListFark2);

   //     arrayListFark1.addAll(arrayListFark2); // Farkların birleşimi
  //      System.out.println("arrListFarkların birleşimi =" + arrayListFark1);


        Collections.sort(arrayListFark1); // Farkın sıralanması
        System.out.println("Fark1 in sıralanmış hali = " + arrayListFark1);

        Collections.reverse(arrayListFark1); // Farkın tersten yazdırılması
        System.out.println("Fark2 in sıralanmış hali =" + arrayListFark1);


    }
    public static int getRandom(int min, int max) {

        return (int)(min + Math.random()*(max-min+1));
    }



    public static ArrayList<Integer> arrListHazirla(int size, int min, int max) {

        ArrayList<Integer> tempArrList = new ArrayList<>();

        for (int i = 0; i < size ; i++) {
            tempArrList.add(getRandom(min,max));
        }
        return tempArrList;
    }


}
