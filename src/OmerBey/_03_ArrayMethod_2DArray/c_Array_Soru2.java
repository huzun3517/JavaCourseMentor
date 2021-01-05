package OmerBey._03_ArrayMethod_2DArray;

import java.util.Arrays;

public class c_Array_Soru2 {

    public static void main(String[] args) {

/*
        İnt array oluşturunuz ve eleman sayısı 5 olsun.
        Elemanlar random atansın. (10 a kadar - 10 dahil)

        Array'i yazdırınız.     array = [......]

        Daha sonra Array'daki maximum değeri bulunuz ve yazdırınız.

        ÖRN:
        array[2,5,9,6,3]

        maximum değer =9
         */

        int [] dizi = new int[5];

        for (int i=0 ; i<dizi.length; i++){

            dizi[i] = (int) (Math.random() * 10 + 1);

        }

        for (int i =0; i< dizi.length; i++){
            System.out.println(i+1+".sayı: " + dizi[i]);

        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println("Max değer: " + dizi[dizi.length-1]);

/*
        int [] a = new int[5];

        for (int i = 0; i <a.length ; i++) {
            a[i] = (int) (Math.random()*10+1);
        }

        System.out.println("Array:  " + Arrays.toString(a));

        int max = 0;

        for (int b = 0; b<a.length; b++){

            if (a[b]>max){
                max=a[b];
            }
        }
        System.out.println("Maksimum değer : " + max);
 */
    }
}
