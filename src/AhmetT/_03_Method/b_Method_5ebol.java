package AhmetT._03_Method;

import java.util.Scanner;

public class b_Method_5ebol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        long sayi = scanner.nextLong();
        System.out.println(returnsWhat(sayi));



    }
    public static int returnsWhat(long num){
        int count = 0;
        while (num>0) {
            if (num % 5 == 0){
                num/=5;
                count++;
            } else break;
        }
        return count;
    }
}

