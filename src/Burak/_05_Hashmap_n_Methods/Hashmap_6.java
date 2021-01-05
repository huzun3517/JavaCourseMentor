package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;

public class Hashmap_6 {
    public static void main(String[] args) {

//todo            Hashmap .containsValue

        HashMap<String, String> map = new HashMap<>();

        map.put("Amazon",               "296 Euro");
        map.put("Ebay",                 "301 Euro");
        map.put("Saturn",               "326 Euro");
        map.put("MediaMarkt",           "340 Euro");
        map.put("Apple Store",          "320 Euro");

        String value = "301 Euro";
        if (map.containsValue(value)){
            System.out.println("Bu fiyatta bir satıcı bulundu.");
        }else{
            System.out.println("Bu fiyatta bir satıcı bulunamadı..");
        }
        System.out.println("296 Euro'ya Ipad var mı?" + map.containsValue("296 Euro"));
    }
}
