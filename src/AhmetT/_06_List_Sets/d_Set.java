package AhmetT._06_List_Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class d_Set {
    /*      Set ler unique elemanlardan olusur, mükerrer eleman olmaz

            Set     --> HashSet         : bir algoritmaya göre kayit
                        LinkedHashset   : giris sirasina göre kayit
                        TreeSet         : sirali kaydeder

            .add(eleman)                .addAll(collection)
            .contains(eleman)           .containsAll(collection)
            .remove(eleman)             .removeAll(collection)
            .clear()                    .isEmpty()
            .size()                     .iterator()
     */

    public static void main(String[] args) {
        //Setler
        // 1. tanimlama ve initialize tarzi
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(2);

        // 2. tanimlama ve initialize tarzi
        HashSet<Integer> set2 = new HashSet<>(){
            {
                add(3);
                add(4);
            }
        };

        // 3. tanimlama ve initialize tarzi
        Set set3 = new HashSet<Integer>(List.of(1,2,3,4));

        // 4. tanimlama ve initialize tarzi, üst sinif kullanimi
        Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4));





    }
}
