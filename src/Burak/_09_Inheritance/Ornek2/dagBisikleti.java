package Burak._09_Inheritance.Ornek2;

public class dagBisikleti extends bisiklet {

    //dağ bisikleti bir bisiklettir, ancak her bisiklet dağ bisikleti değildir.
    // o yüzden bisiklet'te bu field'ları kullanamayız.

    int kacVites;
    boolean araziTekeri;


    public dagBisikleti(String renk, int kacTekerli, double tekerlekBoyutu, boolean ziliVarMi, int kacVites, boolean araziTekeri) {
        super(renk, kacTekerli, tekerlekBoyutu, ziliVarMi);
        this.kacVites = kacVites;
        this.araziTekeri = araziTekeri;

    }

    void dagBisikletiInfo(){
        System.out.println("Bisikletin vites sayısı: " + this.kacVites);
        System.out.println("Bisikletin arazi tekeri var mı? : " + this.araziTekeri);
    }
}

