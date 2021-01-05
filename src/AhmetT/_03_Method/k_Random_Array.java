package AhmetT._03_Method;

import java.util.Arrays;
import java.util.Scanner;

public class
k_Random_Array {

    // return n elemanlı ve elemanları 0-max int random degerler olan array

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n elemanlı dizi için n : ");
        int n = scanner.nextInt();

        System.out.print("random için max : ");
        int max = scanner.nextInt();
        System.out.println("********************");

        System.out.println(Arrays.toString(arrayHazirla(n,max)));


    }

    public static int[] arrayHazirla(int n, int max) {

        int[]arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max + 1));

        }
        return arr;

    }
}
