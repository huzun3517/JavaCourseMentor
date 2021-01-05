package AhmetT._03_Method;

import java.util.Arrays;

public class m_AdvsnceZeroFront {

    public static void main(String[] args) {

        int[] arr ={1,0,0,1,0,0,1,1,0,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 ={1,0,0,1,0,0,1,1,0,1};
        System.out.println(Arrays.toString(arrDuzenle(arr2)));



    }

    public static int[] arrDuzenle(int[] arr) {

        int sifirSayisi = 0;
        int[] revArr = new int[arr.length];

        for (int i= 0; i < arr.length; i++) {
            if (arr[i] == 0) sifirSayisi++;
        }

        for (int i = 0; i < revArr.length ; i++) {
            if (i < sifirSayisi) revArr[i] = 0;
            else revArr[i] = 1;
        }



  /*      for (int i = sifirSayisi; i < revArr.length ; i++) {
           revArr[i] = 1;
        }

   */

        return revArr;
    }
}
