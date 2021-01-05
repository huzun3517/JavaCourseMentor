package Sema._05_class_object.Q6;

public class Person {

    String firstName = "John";
    String lastName = "Doe";
    int age = 24;

    public static void main(String[] args) {

        Person myObj = new Person();
        System.out.print("Name: " + myObj.firstName+" " + myObj.lastName);
        System.out.print(" Age: " + myObj.age);
    }
}

