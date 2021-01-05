package Sema._04_2D_Array_Method_Mentoring;

import java.util.Scanner;

public class d_odev_cevap {

  /*
     int[][] m = new int[2][4];
     Ekrandan 2D Array in elementlerini alan ve bunlarin toplamini yazdiran Java programini yaziniz.
     task1-->Scanner class  ile ekrandan 2D Array in degerlerini alabilen kod parcasini yaziniz.
     task2-->2D array in degerlerini toplayan method'u yaziniz.
     */

    public static void main(String[] args) {
        //-->Task1
        //scanner
        Scanner input=new Scanner(System.in);
        //Enter Array degerleri
        int[][] m = new int[2][4];
        System.out.println(m.length+" satirindan "+m[0].length+" sutunundan olusan Array degerleriniz giriniz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=input.nextInt();
            }
        }
        //-->Task2
        System.out.println("2D Array'deki elemanlarin toplami:"+sum(m));
    }

    private static int sum(int[][] m) {
        int total=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                total+=m[i][j];
            }
        }
        return total;
    }
}

