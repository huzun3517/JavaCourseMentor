package Zeynep._04_Set;

import java.util.HashSet;

public class c_Soru2 {

    /*
    main method altinda bos bir hashset olusturunuz.
    parametresi Integer set ve integer array ve adi elementEkle
    olan bir method yaziniz (return tipi olmayacak)
    yine set icindekileri yazdiracak ayrica bir metod daha yaziniz.
     */

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        elementekle(hs,new int[] {10,11,12,13,24});

        print(hs);
    }

    public static void elementekle(HashSet<Integer> hset, int[] arr) {


        HashSet<Integer> hs = new HashSet<>();

        for (Integer num:arr) {
            hs.add(num);
        }
        System.out.println(hs);

    }

    public static void print(HashSet<Integer> set) {
        for (Integer integer: set) {
            System.out.println(set);
        }
    }
}
