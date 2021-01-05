package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;

public class Hashmap_7 {
    public static void main(String[] args) {

//todo            Hashmap .get  Spesifik bir Key'i elde etmemize yarıyor.

        HashMap<String, String> map = new HashMap<>();
        //        Key                      Value
        map.put("Amazon",               "296 Euro");
        map.put("Ebay",                 "301 Euro");
        map.put("Saturn",               "326 Euro");
        map.put("MediaMarkt",           "340 Euro");
        map.put("Apple Store",          "320 Euro");

        System.out.println("Amazon'da Ipad ne kadar? - " + map.get("Amazon"));

    }
}
