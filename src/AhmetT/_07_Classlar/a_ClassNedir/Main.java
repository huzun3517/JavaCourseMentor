package AhmetT._07_Classlar.a_ClassNedir;

public class Main {

    public static void main(String[] args) {

        A aClass;
        aClass = new A();

        aClass.name = "a Klass";
        System.out.println(aClass.name);

        A bClass = new A();
        bClass.name = "b Klass";
        System.out.println(bClass.name);

        Main m = new Main();
        m.yazdir();
        int sayi = m.num(5);
        System.out.println(sayi);




    }

     void yazdir() {
        System.out.println("Yazı");
    }

    int num(int a){
        return a*a;
    }



}

class A{

    String name;
}
