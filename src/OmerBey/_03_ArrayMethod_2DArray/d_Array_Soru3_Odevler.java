package OmerBey._03_ArrayMethod_2DArray;

import java.util.Arrays;

public class d_Array_Soru3_Odevler {
    public static void main(String[] args) {

        /*

iki ayrı int array oluşturun. İkisinin de eleman sayısı  5 olsun.
Elemanlar random atansın. (15 e kadar - 15 dahil)

2 int array'i de ekrana yazdırınız.  (1.dizi =
                                                        2.dizi=        )



Eğer iki arrayda ortak elemanlar varsa o elemanları yazdırınız.
Yoksa, "ortak eleman yoktur" mesajını konsola yazdırınız.

ÖRNEK:
1.Dizi : [1,2,3,4,5]
2.Dizi : [4,5,6,7,8]

ortak eleman: 4     ortak eleman: 5

    // TODO: 1  İpucu :

           Ortak eleman ararken oluşturacağınız koşula int count ekleyin. (int count = 0;)
Eğer ortak eleman varsa count++
Eğer ortak eleman yoksa, count==0 ise           "ortak eleman yoktur".

         */

        int [] dizi1 = new int[5];
        int [] dizi2 = new int[5];
        int sayac=0;

        for (int i = 0; i < dizi1.length ; i++) {
            dizi1[i] = (int) (Math.random()*15 + 1);
        }
        System.out.println(Arrays.toString(dizi1));

        for (int i = 0; i < dizi1.length ; i++) {
            dizi2[i] = (int) (Math.random()*15 + 1);
        }
        System.out.println(Arrays.toString(dizi2));

        for (int i = 0; i <dizi1.length ; i++) {
            for (int j = 0; j <dizi2.length ; j++) {
                if (dizi1[i] == dizi2[j]){
                    System.out.println();
                    System.out.print("ortak eleman:" + dizi1[i] + "   ");
                    sayac++;
                }
            }
        }
        if (sayac==0) {
            System.out.println("ortak eleman yoktur");
        }
    }
}
