package AhmetT._07_Classlar.b_Class1;

public class Insan {
    String name;
    int age;            // instance variable, new ile olusturulan nesne
    static int nufus;   // class variables
    int numara;

    // class method
    public static Insan insanOlustur(String name, int age){
        Insan insan = new Insan();
        insan.name = name;
        insan.age = age;
        insan.numara++;
        nufus++;
        return  insan;
    }

    // instance method
    int yasiKac(){
        return age;
    }
}
