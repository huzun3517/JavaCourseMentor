package Sema._09_Polymorphism.soru3;

public class AnaYemekler extends yemekler {

    public AnaYemekler(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return  getIsim() + " alabilir miyim?";
    }
}
