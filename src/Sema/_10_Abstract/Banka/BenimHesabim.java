package Sema._10_Abstract.Banka;

public class BenimHesabim extends Banka {
    @Override
    double paraYatir(double miktar) {
        super.Bakiye+=miktar;
        return super.Bakiye;
    }

    @Override
    double paraCek(double miktar) {
        super.Bakiye -=miktar;
        return super.Bakiye;
    }
    public BenimHesabim(double Bakiye){
        super.Bakiye=Bakiye;
        System.out.println(Bakiye);
    }
}
