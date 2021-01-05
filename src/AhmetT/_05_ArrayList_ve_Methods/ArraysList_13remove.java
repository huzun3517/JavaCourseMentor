package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList_13remove {
    public static void main(String[] args) {
        /*
            remove(int index)       # Belirtilen index'li elemani arrayList'den siler
            remove(Object o)        # Belirtilen o elemani ArrayList'de varsa siler
            removeAll(Collection c) # Belirtilen C yi (ArrayList ya da Collections'un diger arrayleri) ArrayList'den siler
            removeRange(int fromIndex, int toIndex)
            # fromIndex'den toIndex'e kadar olan elemanlari ArrayListden siler fromIndex : dahil, toIndex: haric tir
         */

        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));

        // ArrayList list1 tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<String> list1 = new ArrayList<>(List.of("2","3"));

        // list yazdirliliyor
        System.out.println("list : " + list);

        // list1 yazdirliliyor
        System.out.println("list1 : " + list1);

        // 6. index'de bulunan 7 sayisi remove ediliyor
        list.remove(6);
        System.out.print("list.remove(6); sonrasi : ");
        System.out.println("list : " + list);

        // 5 degerli eleman remove ediliyor
        list.remove("5");
        System.out.print("list.remove(5); sonrasi : ");
        System.out.println("list : " + list);

        // list2 elemanlari list1 den siliniyor
        list.removeAll(list1);
        System.out.print("list.remove(list1); sonrasi : ");
        System.out.println("list : " + list);

    }
}
