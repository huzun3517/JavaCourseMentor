package OmerBey._09_Inheritance.Arabam;

public class Test {

    public static void main(String[] args) {

        araba araba1 = new araba("Toyota");
        araba araba2 = new araba("Ford");

        kamyon kamyonet1 = new kamyon("Dodge");
        kamyon kamyonet2 = new kamyon("Ford");

        tasitlar.arabaKimlik(araba1);
        System.out.println("--------------------");
        tasitlar.arabaKimlik(araba2);
        System.out.println("--------------------");
        tasitlar.arabaKimlik(kamyonet1);
        System.out.println("--------------------");
        tasitlar.arabaKimlik(kamyonet2);





    }
}
