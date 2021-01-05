package Sema._09_Polymorphism.soru3;

public class Tatlilar extends yemekler {

    public Tatlilar(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getIsim() + " alabilir miyim?";
    }
}
