package Tahir._06_LinkedHaschMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class d_TreeMaps3 {

    //TODO TreeMap kullanarak bir cümlenin içindeki harflerin frekansını bulma

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String str = scanner.nextLine();

        Map<Character,Integer> frekans = new TreeMap<>();

        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);

            if (frekans.containsKey(c)){
                frekans.replace(c,frekans.get(c)+1); // tahir ata frekans(a,1)
            }
            else {
                frekans.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()) {
            System.out.println("Karakter " + entry.getKey() + " " + entry.getValue() + " kadar var...");
        }
    }
}
