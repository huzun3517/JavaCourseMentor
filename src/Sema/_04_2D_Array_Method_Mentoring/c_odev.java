package Sema._04_2D_Array_Method_Mentoring;

import java.util.Scanner;

public class c_odev {

     /*
     int[][] m = new int[2][4];
     Ekrandan 2D Array in elementlerini alan ve bunlarin toplamini yazdiran Java programini yaziniz
     task1-->Scanner class  ile ekrandan 2D Array in degerlerini alabilen kod parcasini yaziniz.
      task2-->2D array in degerlerini toplayan method'u yaziniz.
     */
    public static void main(String[] args) {
        int [][] arry=new int[2][4];

        System.out.println(topla(arry));

    }
    public static int topla(int [][] arr){
        Scanner sc=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Deger giriniz: ");
                arr[i][j]=sc.nextInt();
                toplam+=arr[i][j];


            }

        }
        return toplam;
    }
}