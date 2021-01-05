package Tahir._01_Scanner;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name,surname,gender;

        // Benim adim Tahir soyadim Ata. Yasim 37, boyum 1,75 ve cinsiyeyim erkek.
        int age;
        double boy;

        System.out.print("Adınızı girin: ");
        name = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        surname = scanner.nextLine();

        System.out.print("Yaşınızı girin: ");
        age = scanner.nextInt();

        System.out.print("Boyunuzu girin: ");
        boy = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Cinsiyetiniz: ");
        gender = scanner.nextLine();

        System.out.println("Benim adım " + name + " " + surname + ".Yaşım " + age + ", boyum " + boy + " ve cinsiyetim " + gender );

    }
}
