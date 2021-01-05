package AhmetT._05_ArrayList_ve_Methods;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_05DegerAtama_Listof {
    public static void main(String[] args) {

        // ulkeler adinda String bir ArrayList define edip
        // ayni zamanda initialize (ilk deger atamasi) ediyoruz.
        // burada sondaki () icinde Arrays.asList() ile ekleniyor
        ArrayList<String> ulkeler = new ArrayList<String>(
                List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya")
        );

        // ulkeler ArrayList'ini ekrana yazdiriyoruz
        System.out.println(ulkeler);


        /*
            ArrayList<String> ulkeler = new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

            ifadesinin okunmasi kolay olsun diye  List.of() ifadesi alt satira yazilmistir.

            ArrayList<String> ulkeler = new ArrayList<String>(
                List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya")
            );

         */
    }
}
