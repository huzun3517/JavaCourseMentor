package Burak._06_ClassMethods.c_Odev_2.Yontem;

public class Test {

    //todo       Karnıyarık örneği gibi kendiniz bir konu bulup onu Classlar arasında çağırın. Örn: Hayvan, insan, araba, bilgisayar...

    public static void main(String[] args) {

    Araba araba1 = Araba.arabaEkle("Kırmızı",4,4,"16V","Renault");
    Araba.printAraba(araba1);

    }
}
