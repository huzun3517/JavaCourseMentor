package Sema._08_Encapsulation._03_BMI;

public class BMI {

    //name, age, weight,height
    private String name;
    private int age;
    private double weight;
    private double height; //1.60

//bmi=weight/(height*height) getBMI()
//bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez getStatus()


    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        double bmi=weight/(height*height);
        return Math.round(bmi);
    }

    public String getStatus(){

        double bmi=getBMI();

        if(bmi<18.5)
            return "zayif";

        else if(bmi<25)
            return "normal";

        else if(bmi<30)
            return "kilolu";

        else
            return "obez";
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
