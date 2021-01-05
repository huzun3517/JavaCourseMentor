package Burak._05_Hashmap_n_Methods;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_11 {
    public static void main(String[] args) {

//todo            Hashmap Value'ları toplama

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon",               296);
        map.put("Ebay",                 301);
        map.put("Saturn",               326);
        map.put("MediaMarkt",           340);
        map.put("Apple Store",          320);

        int toplam = 0;
        for (Map.Entry<String, Integer> sum : map.entrySet()){
            int fiyat = sum.getValue();

            toplam += fiyat; // toplam = toplam + fiyat
        }
        System.out.println("Fiyatların toplamı " + toplam);

    }
}
