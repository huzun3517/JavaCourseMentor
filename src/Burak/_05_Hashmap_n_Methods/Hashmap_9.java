package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_9 {
    public static void main(String[] args) {

//todo            Hashmap Alt alta Value yazdırma

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon",               "296 Euro");
        map.put("Ebay",                 "301 Euro");
        map.put("Saturn",               "326 Euro");
        map.put("MediaMarkt",           "340 Euro");
        map.put("Apple Store",          "320 Euro");

        System.out.println(map.values());

        for (Map.Entry<String, String> entry : map.entrySet() ){
            String value = entry.getValue();

            System.out.println("Value: " + value);
        }
    }
}
