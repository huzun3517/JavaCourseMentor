package AhmetT._07_Classlar.c_Class2;

import java.util.ArrayList;

public class Insan {
    String name;
    int age;
    ArrayList<String> yetenekler;



    public static Insan insanOlustur(String name, int age, String...yetenek){
        Insan insan = new Insan();
        insan.name = name;
        insan.age = age;
        insan.yetenekler = new ArrayList<>();
        if (yetenek.length>0){
            for (int i = 0; i < yetenek.length; i++) {
                insan.yetenekler.add(yetenek[i]);
            }
            /*
                for (String ytn : yetenek)
                    insan.yetenekler.add(ytn);
             */
        }

        return insan;
    }


    void yetenekAta(String yetenek){
        yetenekler.add(yetenek);
    }

    void yeteneklerinNedir(){
        for(String ytn : yetenekler)
            System.out.print(ytn + ", ");
    }

    int kacYeteneginVar(){
        return yetenekler.size();
    }
}
