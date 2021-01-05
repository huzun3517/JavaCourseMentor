package OmerBey._04_Mentoring4_ArrayList_Methodlari;

import java.util.ArrayList;
import java.util.Collections;

public class Soru3_Bonus {
      /*
İki adet Integer ArrayList  a   ve   b oluşturun.   İkisi de 6 elemandan oluşmalı. (int arraylist a   ve     int arraylist   b )


RandomEkleVeOrtakElemaniBul isminde bir method oluşturun.

Bu method, oluşturduğumuz iki int array ' e 0'dan 50 ye kadar random değer atasın.
Değerler atandıktan sonra bu iki int array  küçükten büyüğe sıralansın.

Devamında, bu iki array arasında ortak eleman olup olmadığı check edilsin.
Eğer ortak eleman varsa, o eleman yazılsın.
Eğer yoksa "Ortak eleman yoktur" mesajı gelsin.



OrtakElemanlariKaldir   adında void bir method oluşturun.
Bu method ise,  a ' dan ,   a ile   b nin ortak elemanlarını çıkartsın ve  int arraylistin a yeni halini yazdırsın.

Ve bu iki methodu main methodunda çağırın.


Konsol şöyle olmalı:
a  ilk hali :     [6, 18, 21, 31, 32, 47]
b ilk hali  :    [18, 19, 21, 36, 38, 40]
ortak elemanlar    :  18       ortak elemanlar    :  21
Ortak olanları çıkarttıktan sonra   ArrayList   a: [6, 31, 32, 47]

 */

    public static void main(String[] args) {

        ArrayList<Integer>a = new ArrayList<>();
        ArrayList<Integer>b = new ArrayList<>();

        RandomEkleVeOrtakElemaniBul(a,b);
        System.out.println();

        OrtakElemanlariKaldir(a,b);


    }

    public static void RandomEkleVeOrtakElemaniBul(ArrayList<Integer>r1, ArrayList<Integer>r2) {


        for (int i = 0; i <6 ; i++) {
            r1.add((int)(Math.random()*50 + 1));
        }
        Collections.sort(r1);
        System.out.println("a = " + r1);

        for (int i = 0; i <6 ; i++) {
            r2.add((int)(Math.random()*50 + 1));
        }
        Collections.sort(r2);
        System.out.println("b = " + r2);
        System.out.println();

        int sayac = 0;
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6 ; j++) {
             if (r1.get(i) == r2.get(j))  {
                 System.out.println("Ortak elemanlar = " + r1.get(i));
                 sayac++;
             }

            }

            }
        if (sayac == 0){
            System.out.println("Ortak eleman yoktur...");
        }

    }

    public static void OrtakElemanlariKaldir(ArrayList<Integer>r1, ArrayList<Integer> r2){


        r1.removeAll(r2);
        System.out.println("yeni a = " + r1);


    }
}
