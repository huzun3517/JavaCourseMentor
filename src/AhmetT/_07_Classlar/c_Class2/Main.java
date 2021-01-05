package AhmetT._07_Classlar.c_Class2;


public class Main {

    public static void main(String[] args) {
        Insan ali = Insan.insanOlustur("Ali", 20);
        Insan veli = Insan.insanOlustur("Veli", 22, "Kosma", "Takla Atma");

        System.out.println(ali.name + ", " + ali.yetenekler.size());

        System.out.println(veli.name + ", " + veli.yetenekler.size());

        System.out.println("Velinin yeteneklere");
        veli.yeteneklerinNedir();
        System.out.println("\nVelinin: " + veli.kacYeteneginVar());
        System.out.println();
        ali.yetenekAta("Güler");

        System.out.println("Alinin yetenekleri");
        ali.yeteneklerinNedir();
        System.out.println("\nAlinin: " + ali.kacYeteneginVar());


    }
}

/*
    Class2 package icinde, Main.java ve Insan.java olusturuldu.

    Insan class islemleri:
        String name; int age; ArrayList<String> yetenekler; ekleyin
        Methodlari:
              Insan InsanOlustur(String name, int age):
                 bu methodda varArgs olarak varsa yetenekler de arraylist e eklenebilsin

              Asagidaki methodlarin parametrelerini ayarlayiniz
              void yetenekAta();  olusturulan insana yetenek atasin
              void yeteneklerinNedir(); ilgili insanin yetenellerini listelesin
              int kacYeteneginVar();    ilgili insanin yetenek sayisini return etsin

    Main class islemleri:
         insanlar olusturun,
         yetenekler atayin
         yetenekleri ve sayilarini sorun


*/
