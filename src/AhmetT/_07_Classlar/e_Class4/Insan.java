package AhmetT._07_Classlar.e_Class4;

import java.util.ArrayList;
import java.util.HashSet;

public class Insan {

    String name;
    int age;
    char cinsiyet;
    boolean evli = false;
    HashSet<Insan> cocuklar;
    HashSet<Insan>kardesler;
    Insan es;
    Insan anne;
    Insan baba;

    public Insan(String name, int age, char cinsiyet) {
        this.name = name;
        this.age = age;
        this.cinsiyet = cinsiyet;
        this.cocuklar = new HashSet<>();
        this.kardesler = new HashSet<>();
    }
// anne baba ekleyen method. Aynı zamanda anne ve babaya bu çocuğu ekliyor.
    void anneBabaEkle(Insan anne, Insan baba){

        this.anne = anne;
        this.baba = baba;
        anne.cocuklar.add(this);
        baba.cocuklar.add(this);
    }

    // karsilıklı kardesleri ekliyor.
    void kardesEkle(Insan...kardes) {

        for (Insan k : kardes) {
            this.kardesler.add(k);
            k.kardesler.add(this);
            k.anne = this.anne;
            k.baba = this.baba;
        }
    }

    void evlen(Insan es){
        if (this.age < 18)
            System.out.println("Daha büyümedim");
        else if (es.age < 18)
            System.out.println("O daha çok küçük");
        else if (this.cinsiyet == es.cinsiyet)
            System.out.println("Böyle biri ile evlenilmez");
        else if (es == this.anne || es == this.baba)
            System.out.println("Anne yada baba ile evlenilmez");
        else if (this.kardesler.contains(es) || es.kardesler.contains(this) )
            System.out.println("Kardeşle evlenilir mi?");
        else if (this.cocuklar.contains(es))
            System.out.println("Insan cocuguyla evlenir mi?");
        else if (this.evli)
            System.out.println("Ben evliyim");
        else if (es.evli)
            System.out.println("O evli olmaz");
        else {
            this.es = es;
            es.es = this;
            this.evli =true;
            es.evli = true;
        }
    }

    public String toString(){

        return this.name + " " + this.age;
    }

    // cocuk ekleyen method
    void cocukEkle(Insan cocuk){

        this.cocuklar.add(cocuk);
        this.es.cocuklar.add(cocuk);

        if (this.cinsiyet== 'B'){
            cocuk.anne = this;
            cocuk.baba = this.es;
        }
        else {
            cocuk.baba = this;
            cocuk.anne = this.es;
        }
    }

    //cocuklari listeleyen method, yoksa
    void cocuklarinKimler(){

        if (this.evli) {
            if (this.cocuklar.size() > 0) {
                for (Insan c : this.cocuklar)
                    System.out.println(c);
            } else {
                System.out.println("Evli değilim");
            }
        }
        else {
            System.out.println("Evli Değilim");

            }
    }

    boolean cocukVarMi(){

        return this.cocuklar.size() > 0;

    }

    Insan amca(int sira){
        ArrayList<Insan> krd = new ArrayList<>();

        for (Insan ins : this.baba.kardesler){
            if (ins.cinsiyet == 'E')
                krd.add(ins);
        }
        if (krd.size() > 0) {
            if (sira > krd.size() - 1) sira = krd.size() - 1;
            return krd.get(sira -1);
        }
        else
            return null;
    }

}
