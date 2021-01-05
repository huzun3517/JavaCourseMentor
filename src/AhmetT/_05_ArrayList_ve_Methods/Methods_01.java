package AhmetT._05_ArrayList_ve_Methods;

public class Methods_01 {

    public static void main(String[] args) {

        int n = 10;

        method1(n);
        System.out.println();

        method1(20);

        System.out.println();

        method1(30);
        System.out.println();
        int num1 = 5;

        int[] intArr = {1,34,21,23,87,3,67,43};

        int max = maxArray(intArr);
        System.out.println(max);
    }


    public static int maxArray(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }

        return max;
    }


    public static void method1(int n){
        for (int i = 0; i < n ; i++) {
            System.out.print(i + " ");
        }
    }


}
