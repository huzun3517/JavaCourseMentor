package Tahir._06_LinkedHaschMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class b_TreeMaps {

    public static void main(String[] args) {

        /*
        10, Java
        20, PHP
        2,  Python
        57, C++
        89, C#
        40, Javascript
         */
        System.out.println("******************   hashMap   *********************");

        Map<Integer,String> hashMap = new HashMap<>();

        hashMap.put(10,"Java");
        hashMap.put(20,"PHP");
        hashMap.put(2,"Python");
        hashMap.put(57,"C++");
        hashMap.put(89,"C#");
        hashMap.put(40,"Javascript");

        for (Map.Entry<Integer,String > entry : hashMap.entrySet()) {
            System.out.println("Keys= " + entry.getKey() + " value= " + entry.getValue());
        }
        System.out.println("*****************     linkedHasshMap    ****************");

        Map<Integer,String> linkedHasshMap = new LinkedHashMap<>(hashMap);

        linkedHasshMap.put(10,"Java");
        linkedHasshMap.put(20,"PHP");
        linkedHasshMap.put(2,"Python");
        linkedHasshMap.put(57,"C++");
        linkedHasshMap.put(89,"C#");
        linkedHasshMap.put(40,"Javascript");

        for (Map.Entry<Integer,String > entry : linkedHasshMap.entrySet()) {
            System.out.println("Keys= " + entry.getKey() + " value= " + entry.getValue());
        }

        System.out.println("******************   treeMap     ********************");

        Map<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(10,"Java");
        treeMap.put(20,"PHP");
        treeMap.put(2,"Python");
        treeMap.put(57,"C++");
        treeMap.put(89,"C#");
        treeMap.put(40,"Javascript");

        for (Map.Entry<Integer,String > entry : treeMap.entrySet()) {
            System.out.println("Keys= " + entry.getKey() + " value= " + entry.getValue());
        }

    }
}
