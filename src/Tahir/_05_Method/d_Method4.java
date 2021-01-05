package Tahir._05_Method;

import java.util.Scanner;

public class d_Method4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int not = scanner.nextInt();

        System.out.println(grades(not));




    }


    public static String grades(int grade){
        if (grade >= 85) {
            return "Perfect";
        }
        else if (grade >= 70) {
            return "Good";
        }
        else if (grade >= 60) {
            return "Normal";
        }
        else if (grade >= 45) {
            return "Not bad";
        }
        else {
            return "Bad";
        }

    }
}
