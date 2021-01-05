package Sema._09_Polymorphism.soru2;

 class A{
    int x = 10;
}

class B extends A {

    int x = 20;
}

public class test {

    public static void main(String[] args) {

        B a = new B();
        System.out.println(a.x);
    }
}
