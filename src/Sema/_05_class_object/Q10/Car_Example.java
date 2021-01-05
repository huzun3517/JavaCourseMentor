package Sema._05_class_object.Q10;

class Car {

    String model;
    int manufactureDate;
    double motorSize;}

public class Car_Example {

    public static void main(String[] args) {

     Car toyota=new Car();

     toyota.model="Toyota Camry";
     toyota.manufactureDate=2020;
     toyota.motorSize=2.3;

     System.out.print("Model:"+toyota.model);
     System.out.print(" "+toyota.manufactureDate);
     System.out.print(" "+toyota.motorSize);
}

}
