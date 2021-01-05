package Burak._09_Inheritance.Ornek2;

public class elektrikliBisiklet extends bisiklet {

        int akuKapasitesi;
        boolean gps;


    public elektrikliBisiklet(String renk, int kacTekerli, double tekerlekBoyutu, boolean ziliVarMi, int akuKapasitesi, boolean gps) {
        super(renk, kacTekerli, tekerlekBoyutu, ziliVarMi);
        this.akuKapasitesi = akuKapasitesi;
        this.gps = gps;
    }

    void eBisikletInfo(){
        System.out.println("Bisikletin akü kapasitesi: " + this.akuKapasitesi);
        System.out.println("Bisikletin GPS'i var mı? : " + this.gps);
    }

}

