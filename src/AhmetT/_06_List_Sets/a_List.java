package AhmetT._06_List_Sets;

import java.util.*;

public class a_List {

    public static void main(String[] args) {
        /*  Listler arraylerin  gelistirilmis halisir, mükerrer eleman olabilir
            List    --> ArrayList, LinkedList           aralarinda performans farki vardir

            .add()                      .addAll(collection)
            .set(index, eleman)         .indexOf(eleman)
            .get(index)                 .lastIndexOf(eleman)
            .remove(index)              .remove(eleman)
            .iterator()                 .subList(fromIndex, toIndex)
            .retailAll(collection)
         */


        // Normal bir arrayin tanimlamasi
        // 1. Tür tanimlama ve deger atama
        int[] arrNormal1 = {1,2,3};

        // 2. Tür tanimlama ve deger atama
        int[] arrNormal2 = new int[]{4,5,6};

        // 3. Tür tanimlama ve deger atama
        int[] arrNormal3 = new int[3];
        arrNormal3[0] = 7;
        arrNormal3[1] = 8;
        arrNormal3[2] = 9;


        //Eger yapilan tüm tanimlama ilse birlikte deger atama da yapilacaksa
        // tanimlama için var ifadesi kullanilabilir
        // burada ilk deger atandigi icin int yerine var denebilir.
        // Java esitligin sag tarafina bakip num2 yi int olarak tanimlar
        int num1 = 5;
        int num2 = 5;

        int num3;       // num3 int olacagi icin bu asamada deger atanmasa da hata olmaz
        //  var num4;   // ilk deger atanmadigi icin var kullanmak hata olusturur

        //var arrayNormal5 = {10,11,12};        // array ifade edilmedigi icin hata olusur
        int[] arrayNormal4 = new int[]{10,11,12}; // degiskenin int[] oldugu sag tarafta aciklanmistir

        //ArrayListler
        // 1. tanimlama ve initialize tarzi
        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(3);

        // 2. tanimlama ve initialize tarzi
        ArrayList<Integer> arrList5 = new ArrayList<>(){
            {
                add(4);
                add(5);
                add(6);
            }
        };

        // 3. tanimlama ve initialize tarzi
        List arrList3 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7));

        // 4. tanimlama ve initialize tarzi, üst sinif kullanimi
        List<Integer> arrList4 = new ArrayList<Integer>(List.of(5,6,7,8,9));



        System.out.println("-----------------------");
        System.out.println(listToHashSet(arrList1));

        String str1 = "Merhaba";


        String str = new String("Merhaba");
        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(new String("Merhaba").toUpperCase());

        int sayi = new Scanner(System.in).nextInt();

    }




    // gönderilen arraylisti set e dönüstüren method
    public static HashSet<Integer> listToHashSet(ArrayList<Integer> arrL){
        //HashSet<Integer> tempHS = new HashSet<>(arrL);
        HashSet<Integer> tempHS = new HashSet<>();
        tempHS.addAll(arrL);

        return tempHS;
        //return new HashSet<>();
    }


}
