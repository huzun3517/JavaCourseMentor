package AhmetT._07_Classlar.e_Class4;

public class Main {

    public static void main(String[] args) {

        Insan dede1 = new Insan("Dede-1",66,'E');
        Insan nine1 = new Insan("Nine-1",61,'B');

        Insan dede2 = new Insan("Dede-2",66,'E');
        Insan nine2 = new Insan("Nine-2",61,'B');


        Insan bay1 = new Insan("Bay-1",42,'E');
        Insan bayan1 = new Insan("Bayan-1",40,'B');
        Insan bay2 = new Insan("Bay-2",42,'E');
        Insan bayan2 = new Insan("Bayan-2",40,'B');

        Insan cocuk11 = new Insan("Cocuk-11",21,'E');
        Insan cocuk12= new Insan("Cocuk-12",12,'B');

        Insan cocuk21 = new Insan("Cocuk-21",13,'E');
        Insan cocuk22= new Insan("Cocuk-22",4,'B');

        dede1.evlen(nine1);
        dede1.cocukEkle(bay2);
        bay1.anneBabaEkle(nine1,dede1);
        bayan1.anneBabaEkle(nine2,dede2);

        bay1.kardesEkle(bay2);
     // System.out.println(bay1.evli);
        bay1.evlen(bayan1);
        bay1.cocukEkle(cocuk11);
        bay1.cocukEkle(cocuk12);
        System.out.println("---------------------------");
        cocuk11.baba.baba.cocuklarinKimler();
        System.out.println("----------------------------");

   //   System.out.println(cocuk11.baba.es.anne);
        bay1.cocuklarinKimler();
        System.out.println(bay1.es);




    }
}


