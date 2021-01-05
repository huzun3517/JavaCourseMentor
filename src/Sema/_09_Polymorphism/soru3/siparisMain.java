package Sema._09_Polymorphism.soru3;

public class siparisMain {

    public static void main(String[] args) {

        yemekler anaYemekler = new AnaYemekler("ozbek pilavı");
        System.out.println( anaYemekler.siparis());

        yemekler salatalar = new Salatalar("gavurdagi salatasi");
        System.out.println(salatalar.siparis());

        yemekler tatlilar = new Tatlilar("dondurmalı künefe");
        System.out.println(tatlilar.siparis());
    }
}
