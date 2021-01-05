package Burak._09_Inheritance.Ornek3;

public class main {
    public static void main(String[] args) {

        insan arif = new insan();

        cocuk ali = new cocuk();

        arif.boy = 180;
        arif.kilo = 70;
        arif.buyume(); // +1
        arif.yemek(); // +1
        arif.spor();  //  -1

        System.out.println("Arif'in boyu: " + arif.boy);
        System.out.println("Arif'in kilosu: " + arif.kilo);

        ali.boy = 50;
        ali.kilo = 10;
        ali.buyume(); // +3
        ali.yemek();  // +2
        ali.spor();  // +1


        System.out.println("Ali'nin boyu: " + ali.boy);
        System.out.println("Ali'nin kilosu: " + ali.kilo);

    }
}
