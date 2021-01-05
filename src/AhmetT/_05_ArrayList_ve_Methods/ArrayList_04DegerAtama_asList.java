package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_04DegerAtama_asList {
    public static void main(String[] args) {
        // ulkeler adinda String bir ArrayList define edip
        // ayni zamanda initialize (ilk deger atamasi) ediyoruz.
        // burada sondaki () icinde Arrays.asList() ile ekleniyor
        // Arrays.asList(1,2,3) demek 1,2,3 elemanlarini array olarak al demek
        ArrayList<String> ulkeler = new ArrayList<String>(
                Arrays.asList("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya")
        );

        // ulkeler ArrayList'ini ekrana yazdiriyoruz
        System.out.println(ulkeler);
/*
            ArrayList<String> ulkeler = new ArrayList<String>( Arrays.asList("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

            ifadesinin okunmasi kolay olsun diye  Arrays.asList(); ifadesi alt satira yazilabilir.

            ArrayList<String> ulkeler = new ArrayList<String>(
                Arrays.asList("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya")
            );

         */
    }
}
