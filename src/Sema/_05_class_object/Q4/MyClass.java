package Sema._05_class_object.Q4;

public class MyClass {

    int x = 5;

    public static void main(String[] args) {

        MyClass myObj1 = new MyClass();  // Object 1
        MyClass myObj2 = new MyClass();  // Object 2

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
/*
05
50
55
Compiler Error
 */
