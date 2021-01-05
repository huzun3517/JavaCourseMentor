package AhmetT._06_List_Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class c_soru2 {

     /*  C03_Lists de ArrayList hazirlayan methodu kullanabilirsiniz

        Yazilacak Methodlar:
        1.  Konsoldan "1 2 34 21 34 56 78 3 5 7" seklinde girilen sayilari ayirarak int'e
            cevirip bize int[] return eden bir method yazin
        2.  Aldigi int arrayi LinkedList'e ceviren bir method yazin
        3.  Bir method yazin, bu method bir LinkedList ve bir int deger alsin
            Bu listede aldigi int' den kactane oldugunu döndursun

        main islemleri:
        1.  String okutturun
        2.  Methodla int[]'e cevirin
        3.  Bu arrayi linkedList'e cevirin
        4.  C03_Lists de hazirlanan method ile arrayList (size:5# min:3, max :10) olusturun
        5.  Bu iki arrayin ortak ve ortak olmayan diger toplam elemanlarini yazdirin
        6.
    */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Rakamlar giriniz: ");
        String rakamlar = scanner.nextLine();

        System.out.println("************************************");

        int [] intArr = strToIntArray(rakamlar);
        System.out.println("sonarr(dizi) = " + Arrays.toString(intArr)); // diziye atadık

        System.out.println("************************************");

        LinkedList<Integer> list1 = new LinkedList<>(arrToLinledList(intArr));// linkliste çevirdik metodu kulanndık
        System.out.println("Linklist list1 = " + list1);

   //     System.out.println(arrToLinledList(sonarr)); // Linkliste direk yazdırdık

        System.out.println("************************************");

        HashSet<Integer>hs = new HashSet<>(list1); // Haschset e çevirdik
        System.out.println("Haschset hs = " + hs);

        System.out.println("***********************************");

        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        int kactane = kacTane(list1,sayi);
        System.out.println("LinkedListte kactane " + sayi + " var = " + kactane); // int değeri LinkedListte kaç tane var



    }
    public static int[] strToIntArray(String str) {

        String[] strArr = str.trim().split(" ");
        int[] intArr = new int[strArr.length];

    /*    //1.Yöntem
        for (int i = 0; i <intArr.length ; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

     */

        //2.Yöntem
        int i =0;
        for (String s :strArr) {
            intArr[i++] = Integer.parseInt(s);
        }


        return intArr;
    }
    public static LinkedList<Integer>arrToLinledList(int[] arr) {
        LinkedList<Integer> tempList = new LinkedList<>();

        for (int n: arr) {
            tempList.add(n);
        }
        return tempList;
    }
    public static int kacTane(LinkedList<Integer> LinledList, int num) {

        int sayac =0;
        for (int i = 0; i <LinledList.size() ; i++) {
            if ( LinledList.get(i)== num){
                sayac++;
            }
        }
        return sayac;
    }
}
