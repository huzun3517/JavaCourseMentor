package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;

public class Hashmap_4 {
    public static void main(String[] args) {

//todo            Hashmap boşaltma .clear

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon",               "296 Euro");
        map.put("Ebay",                 "301 Euro");
        map.put("Saturn",               "326 Euro");
        map.put("MediaMarkt",           "340 Euro");
        map.put("Apple Store",          "320 Euro");

        System.out.println(".clear'dan önce Map: " + map);
        map.clear();
        System.out.println(".clear'dan sonra Map: " + map);
        System.out.println(map.isEmpty());

    }
}

