package Sema._05_class_object.Q5;

public class MyClass {

    int x = 10;

    public static void main(String[] args) {

        MyClass myObj = new MyClass();
        myObj.x = 25;
        System.out.println(myObj.x);
    }
}
/*
10
15
25
35
 */
