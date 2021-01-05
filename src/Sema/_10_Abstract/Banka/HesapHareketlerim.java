package Sema._10_Abstract.Banka;

public class HesapHareketlerim {
        public static void main(String[] args) {
            BenimHesabim bh=new BenimHesabim(100);

            System.out.println(bh.paraYatir(500));
            System.out.println(bh.paraCek(200));
        }
    }

