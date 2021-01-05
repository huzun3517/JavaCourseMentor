package Sema._04_2D_Array_Method_Mentoring;

public class a_sayiBul {
    /*
     int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
      verilen Array icinde
    --> kac tane sayi oldugunu return eden  methodu yazdiriniz
     */
    public static void main(String[] args) {
        int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        //method u cagir
        System.out.println("2D Array icindeki sayilar:"+kacSayi(array));

    }
    //method
    private static int kacSayi(int[][] array) {
        int say=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                say++;
            }
        }
        return say;
    }

    //2.metot
    public static int arrayCount(int[][] array){
        int count = 0;
        for (int[] arr : array)
            for (int n : arr)
                count++;
        return count;
    }


}
