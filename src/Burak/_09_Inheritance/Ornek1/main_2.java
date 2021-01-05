package Burak._09_Inheritance.Ornek1;

public class main_2 {
    public static void main(String[] args) {

        isci Isci = new isci("Metin Er", "Kalıp Ustası", 3000);

        mühendis Muhendis = new mühendis("Ebru Yılmaz", "Makine Mühendisi", 4800);

        sef Sef = new sef("Burhan Atay", "Metal Ustası", 3500);

        System.out.println("----------------------");
        Muhendis.bilgiler();
        System.out.println("----------------------");
        Isci.bilgiler();
        System.out.println("----------------------");
        Sef.bilgiler();
        System.out.println("----------------------");


        //şimdi biz bir üst sınıf oluşturduk.
        //şimdiyse bir alt sınıf yani SubClass oluşturacağız.

    }
}
