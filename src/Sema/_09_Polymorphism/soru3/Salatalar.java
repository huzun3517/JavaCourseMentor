package Sema._09_Polymorphism.soru3;

public class Salatalar extends yemekler {

    public Salatalar(String isim) {
        super(isim);
    }

    @Override
    public String siparis() {
        return getClass().getSimpleName() + "dan " + getIsim() + " alabilir miyim?";
    }
}
