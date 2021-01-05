package Zeynep._02_random;

import java.util.Scanner;

public class c_ornek3 {

    public static void main(String[] args) {
        //Console uzerinden maximum ve minimum degeri saglayiniz
        // ve buradan gelen rakamlari Math.random() da olmasini istediginiz araliga getiriniz.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Min : ");
        int max = scanner.nextInt();
        System.out.print("Max : ");
        int min = scanner.nextInt();

        int random = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(random);


    }
}
