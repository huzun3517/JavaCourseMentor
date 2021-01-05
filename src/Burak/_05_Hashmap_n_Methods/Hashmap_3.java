package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;

public class Hashmap_3 {
    public static void main(String[] args) {

//todo            Hashmap kopyalama yolları

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon",               "296 Euro");
        map.put("Ebay",                 "301 Euro");
        map.put("Saturn",               "326 Euro");
        map.put("MediaMarkt",           "340 Euro");
        map.put("Apple Store",          "320 Euro");

        HashMap<String, String> map2 = new HashMap<>();
//        System.out.println("----1.YOL-----");
//        map2 = new HashMap<>(map);
//        System.out.println("map2 = " + map2);


        System.out.println("-----2.YOL-------");
        map2.putAll(map);
        System.out.println("map2 = " + map2);

    }
}
