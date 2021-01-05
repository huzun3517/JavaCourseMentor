package AhmetT._02_Arrays;

import java.util.Arrays;

public class a_Array_max_min {

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 23, 9, 11, 2};
        //           0  1  2   3  4  5   6  = 7 eleman
        // arr[0];arr[1];arr[i];...;arr[6];

        int max=arr[0];
        //  max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){       //      i       arr[i]      max     yeniMax
            if (max < arr[i])                   //      0       1           1       1
                max = arr[i];                   //      1       5           1       5
            //      2       8           5       8

        }
        System.out.println(max);

///////////////////////////////////////////////////////////////////////////

        int max1 =arr[0];

        for (int i=0; i<arr.length; i++){
            if (max1 < arr[i]) {
                max1 = arr[i];
            }

        }

        int max2 = arr[0];
        for (int i=0; i<arr.length; i++){
            if (max2<arr[i] && arr[i]!=max1){
                max2 = arr[i];
            }

        }
        System.out.println(max1 + " : " + max2);


        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

    }
}
