package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;

public class Hashmap_2 {
    public static void main(String[] args) {

//todo            Hashmap .size() methodu

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon",               "296 Euro");
        map.put("Ebay",                 "301 Euro");
        map.put("Saturn",               "326 Euro");
        map.put("MediaMarkt",           "340 Euro");
        map.put("Apple Store",          "320 Euro");

        System.out.println("Map'in boyutu: " + map.size());

    }
}
