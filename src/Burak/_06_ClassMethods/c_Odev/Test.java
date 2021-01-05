package Burak._06_ClassMethods.c_Odev;

//todo       Karnıyarık örneği gibi kendiniz bir konu bulup onu Classlar arasında çağırın. Örn: Hayvan, insan, araba, bilgisayar...

public class Test {

    public static void main(String[] args) {

        Araba araba1 = new Araba();


        araba1.renk = "Kırmızı";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println(araba1.renk);
        System.out.println(araba1.kapilar);
        System.out.println(araba1.tekerlekler);
        System.out.println(araba1.motor);
        System.out.println(araba1.model);

    }
}
