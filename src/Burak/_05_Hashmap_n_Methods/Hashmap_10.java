package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;

public class Hashmap_10 {
    public static void main(String[] args) {

//todo            Hashmap bir satıra Key'leri diğer satıra Value'ları yazdırma

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon",               296);
        map.put("Ebay",                 301);
        map.put("Saturn",               326);
        map.put("MediaMarkt",           340);
        map.put("Apple Store",          320);

        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (Integer value : map.values()){
            System.out.print(value + " ");
        }

    }
}
