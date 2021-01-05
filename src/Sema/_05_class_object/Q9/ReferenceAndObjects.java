package Sema._05_class_object.Q9;

public class ReferenceAndObjects {

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2;
        st2 = st1;

        st1.name = "Ali";
        st2.marks = 87;
        st1.section = 'C';

        System.out.print("student1 : " + st1.name + " " + st1.marks + " " + st1.section);
        System.out.print(" student2 : " + st2.name + " " + st2.marks + " " + st2.section);
    }
}
class Student{

    String name;
    int marks;
    char section;
}
