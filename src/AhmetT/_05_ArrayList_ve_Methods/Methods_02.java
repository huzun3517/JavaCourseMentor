package AhmetT._05_ArrayList_ve_Methods;

import java.util.Arrays;

public class Methods_02 {
    public static void main(String[] args) {


        int[] b = arrayHazirla(5, 10, 20);
        System.out.println(Arrays.toString(b));

        // int[] a = {1,2,3};
        int[] a = arrayHazirla(10, 10, 100);
        int max = maxArray(a);
        System.out.println(Arrays.toString(a) + " " + max);

        System.out.println(Arrays.toString(sayiToArr(12345678)));

        int[] aa = arrayHazirla(100, 0,100);
        int max1 = maxArray(aa);
        System.out.println(max1);
    }


    // method türü int[], return ettigi tür
    // parametreler   int length, int min, int max
    // length elemanli bir array olusturacak ve icini de min ile max arasinda random sayilarla dolduracak
    public static int[] arrayHazirla(int length, int min, int max){
        int[] arrMethod = new int[length];

        for (int i = 0; i < arrMethod.length; i++) {
            arrMethod[i] = (int)(min + Math.random()*(max - min + 1));  // arrayi random sayilarla dolduruyoruz
        }
        return arrMethod;
    }

    // gelen int[] arrayin max degerini döndürür
    public static int maxArray(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }


    // gelen int sayinin rakamlarindan bir int[] array hazirlar.
    // 1234 --> {1,2,3,4}  gibi
    public static int[] sayiToArr(int num){
        String strNum = Integer.toString(num);      //  int num'i strNum adinda Stringe ceviriyoruz
        String[] strArr = strNum.split("");     // strNum'i split("") ile her harfi strArr'e atiyoruz

        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);    // strArr'in her elemanini int'e cevirip intArr'e atiyoruz
        }
        return intArr;
    }
}

// Math.Random  --> [0,1)       0-1 arasi random sayi üretir
// Math.Random*10  --> [0, 10)
// Math.Random*10 + 5  --> [5, 15)
