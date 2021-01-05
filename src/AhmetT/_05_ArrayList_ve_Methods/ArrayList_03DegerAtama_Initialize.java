package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;

public class ArrayList_03DegerAtama_Initialize {
    public static void main(String[] args) {
        // ulkeler adinda String bir ArrayList define edip
        // ayni zamanda initialize (ilk deger atamasi) ediyoruz.
        // burada en sonda 2 süslü parantez icinde add yapiliyor
        ArrayList<String> ulkeler = new ArrayList<String>(){
            {
                add("Almanya");
                add("Fransa");
                add("Ingiltere");
                add("Ispanya");
                add("Italya");

            }
        };

        // ulkeler ArrayList'ini ekrana yazdiriyoruz
        System.out.println(ulkeler);
    }
}
