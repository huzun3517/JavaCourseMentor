package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;

public class Hashmap_5 {
    public static void main(String[] args) {

//todo            Hashmap .containsKey

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon",               "296 Euro");
        map.put("Ebay",                 "301 Euro");
        map.put("Saturn",               "326 Euro");
        map.put("MediaMarkt",           "340 Euro");
        map.put("Apple Store",          "320 Euro");

        String key = "Apple Store";
        if (map.containsKey(key)){
            System.out.println("Değer(Value): " + map.get(key));
        } else{
            System.out.println("Bu map'de bununla alakalı bir şey yok");
        }
        System.out.println("Saturn'de Ipad satılıyor mu?" + map.containsKey("Saturn"));

    }
}
