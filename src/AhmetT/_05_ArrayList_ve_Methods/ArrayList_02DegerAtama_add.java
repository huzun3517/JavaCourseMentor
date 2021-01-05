package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;

public class ArrayList_02DegerAtama_add {

    public static void main(String[] args) {
        // ulkeler adinda String bir ArrayList define ediyoruz. (tanimliyoruz).
        // ArrayList define edildi ancak initialize (ilk deger atamasi) edilmedi.
        ArrayList<String> ulkeler = new ArrayList<String>();

        // Define edilen Arrayliste deger tek tek add ediliyor
        ulkeler.add("Almanya");
        ulkeler.add("Fransa");
        ulkeler.add("Ingiltere");
        ulkeler.add("Ispanya");
        ulkeler.add("Italya");

        // ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler
        // Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.
        System.out.println(ulkeler);
    }
}

