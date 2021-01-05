package Burak._09_Inheritance.Ornek2;

public class bisiklet {


    String renk;
    int kacTekerli;
    double tekerlekBoyutu;
    boolean ziliVarMi;


    public bisiklet(String renk, int kacTekerli, double tekerlekBoyutu, boolean ziliVarMi) {
        this.renk = renk;
        this.kacTekerli = kacTekerli;
        this.tekerlekBoyutu = tekerlekBoyutu;
        this.ziliVarMi = ziliVarMi;
    }

    void bisikletInfo(){

        System.out.println("Bisikletin rengi: " + this.renk);
        System.out.println("Bisikletin teker sayısı: " + this.kacTekerli);
        System.out.println("Bisikletin teker boyutu: " + this.tekerlekBoyutu);
        System.out.println("Bisikletin zili var mı? : " + this.ziliVarMi);




    }


}
