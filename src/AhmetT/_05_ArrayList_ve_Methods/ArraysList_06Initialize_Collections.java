package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysList_06Initialize_Collections {
    public static void main(String[] args) {

        // ulkeler ArrayList'i tanimlansin
        ArrayList<String> ulkeler = new ArrayList<String>(
                List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya")
        );

        // Yeni tanimlanacak ulkelerYeni ArrayList'ine yukaridaki ArrayListi tanimlamak icin
        // () icine yukaridaki ulkeler arrayList'i yazilir.
        // Yani ulkelerYeni ArrayList ulkeler ArrayListinden olusacak demektir
        ArrayList<String> ulkelerYeni = new ArrayList<String>(ulkeler);
        ulkelerYeni.add("Türkiye");     // ulkelerYeni ye Türkiye yi ekledik
        ulkelerYeni.add("ABD");         // ulkelerYeni ye ABD yi ekledik

        System.out.println("ulkeler : " + ulkeler);
        System.out.println("ulkelerYeni : " + ulkelerYeni);



        // Collections nCopies kullanimi
        // nCopies(int n, Object o);  n elemanli nums arrayi olusturur ve hepsini o ile doldurur
        // Collection.fill(List, o); ise tanimlanmis ve deger atanmis arrayList'in tüm elemanlarini o ile doldurur
        ArrayList<Integer> nums = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("nums : " + nums);


    }
}
