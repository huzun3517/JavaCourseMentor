package AhmetT._04_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
rangeBtw() isminde bir method oluşturun.
Parametre olarak   bir Arraylist  ve iki ayrı int
return tipi Integer Arraylist
 Arraylist'in iki int arasındaki değerlerini Arrayliste yazdırınız.
return  Arraylist

Example (Örnek):
ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
min = 20
max = 30
return = (20,22,25,28,30)
min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
 */

public class SORU {

    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));

        int min = 20;
        int max = 30;

        System.out.println(rangeBtw(arrayList,min,max));


    }
    public static ArrayList<Integer> rangeBtw(ArrayList<Integer>arrayList, int min, int max){

        ArrayList<Integer>arrays1 = new ArrayList<>();

        for (int i = 0; i < arrayList.size() ; i++) {

            if (arrayList.get(i) >= min && arrayList.get(i) <= max){
                arrays1.add(arrayList.get(i));
            }
        }
        return arrays1;
    }
}