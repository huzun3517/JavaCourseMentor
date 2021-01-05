package AhmetT._07_Classlar.d_Class3;

import java.util.HashSet;

public class Insan {
    String name;
    int age;
    HashSet<Insan> arkadaslar;
    Insan dostum;


    //-------------------------------------------------
    public static Insan insanOlustur(String name, int age, Insan...arkadas){
        Insan insan = new Insan();
        insan.name = name;
        insan.age = age;
        insan.arkadaslar = new HashSet<>();
        if (arkadas.length>0)
            for(Insan ins : arkadas)
                insan.arkadaslar.add(ins);

        return insan;
    }


    //-------------------------------------------------
    void arkadasEkle(Insan...ins){
        if (ins.length>0)
            for (Insan i : ins)
                arkadaslar.add(i);
    }

    //-------------------------------------------------
    void arkadasSil(Insan ins){
        arkadaslar.remove(ins);
    }



    //-------------------------------------------------
    void arkadaslarinKimler(){
        if (arkadaslar.size()>0) {
            for (Insan ar : arkadaslar)
                System.out.println(ar.name + " " + ar.age);
        }else System.out.println("Yalnizim dostlar");
    }

    boolean arkadasinMi(Insan ins){
        return arkadaslar.contains(ins);
    }

    void dostAta(Insan ins){
        if (arkadaslar.contains(ins))
            dostum = ins;
        else{
            arkadaslar.add(ins);
            dostum = ins;
        }

    }

    boolean dostunVarMi(){
        return dostum != null ? true : false;
    }

    Insan dostunKim(){
        return dostum;
    }
}
