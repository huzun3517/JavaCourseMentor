package Tahir._05_Method;

import java.util.Scanner;

public class c_Method3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int not = scanner.nextInt();

        grades(not);




    }

    public static void grades(int grade){
        if (grade >= 85) {
            System.out.println("Perfect");
        }
        else if (grade >= 70) {
            System.out.println("Good");
        }
        else if (grade >= 60) {
            System.out.println("Normal");
        }
        else if (grade >= 45) {
            System.out.println("Not bad");
        }
        else {
            System.out.println("Bad");
        }
    }
}
