package Sema._06_Constructor_Mentoring.Q10;

class TechnoStudy {

    int num;
    String name;

    TechnoStudy(){

        System.out.println("Techno Study ");
    }
}

class Techno{

    public static void main(String[] args) {

        TechnoStudy student1=new TechnoStudy();

        System.out.println(student1.name);
        System.out.println(student1.num);
    }
}



