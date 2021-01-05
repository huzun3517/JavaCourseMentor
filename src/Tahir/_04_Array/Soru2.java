package Tahir._04_Array;

public class Soru2 {
    public static void main(String[] args) {
        //TODO   $ ve € isaretlerini kaldirip sayilari toplayin
        String arr = "$1 $23 $134 $2 $7 $24 32 €40 €2 €65 €4";

        String arr2 = arr.replaceAll("[$€]",""); // "1 23 134 2 7 24 32 40 2 65 4"

        String[] dizi = arr2.split(" ");

        int[] array = new int[dizi.length];

        int toplam = 0;
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(dizi[i]);
            toplam += array[i];

        }
        System.out.println(toplam);


    }
}
