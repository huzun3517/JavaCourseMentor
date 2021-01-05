package OmerBey._06_Methods_MultipleClasses.c_barinak;

import java.util.Scanner;

public class hayvanlar {

    String hayvan;
    int yasi;
    String renk;

    public void tercihler(){

        System.out.println("*********    Hayvan Barınağımıza Hoşgeldiniz    *********");
        System.out.println("Barınakta bulunan hayvanlar");
        System.out.println("Kedi");
        System.out.println("Köpek");
        System.out.println("*****************************");

        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Hangi hayvanı sahiplenmek istiyorsunuz: ");
            String hayvan = scanner.nextLine();

            if (hayvan.equalsIgnoreCase("kedi")){
                yasi = 4;
                renk = "beyaz";
                System.out.println("Cinsi = " + hayvan);
                System.out.println("Yaşı = " + yasi);
                System.out.println("Rengi = " +renk);
                break;
            }
            else if (hayvan.equalsIgnoreCase("köpek")){
                yasi = 3;
                renk = "siyah";
                System.out.println("Cinsi = " + hayvan);
                System.out.println("Yaşı = " + yasi);
                System.out.println("Rengi = " +renk);
                break;
            }
            else {
                System.out.println("Barınağımızda " + hayvan + " yoktur.");
                System.out.println("------------------------------");
            }
        }
    }
}
