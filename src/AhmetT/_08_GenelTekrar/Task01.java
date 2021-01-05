package AhmetT._08_GenelTekrar;

import java.util.Scanner;

public class Task01 {
      // TODO
     //   void yazdirN(String str, int n);
     //   Alacagi stringi n defa aralarinda birer tab olacak sekilde yazdiran method yaziniz
     //   Bu n ve stringi Önce int sonra string olacak sekilde kullaninicidan aliniz.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Giriş yap: ");
        String str = scanner.nextLine();

        yazdirN(str,n);
    }

    public static void yazdirN(String str, int n){

        for (int i = 0; i <= n ; i++) {

            System.out.print(str + "\t");
        }
    }
}
