package Zeynep._03_nestedLoop;

public class c_Task2 {
    public static void main(String[] args) {

        //todo 1.
        // A
        // A B
        // A B C
        // A B C D
        // A B C D E
        // A B C D E F

        int alphabet = 65;

        for (int i = 0; i <= 5 ; i++) {

            for (int j = 0; j <= i ; j++) {

                System.out.print((char)(alphabet +j) + " ");
            }
            System.out.println();
        }

        //todo 2.
        // A
        // B B
        // C C C
        // D D D D
        // E E E E E
        // F F F F F F


        System.out.println("------------");


        for (int i = 0; i <= 5 ; i++) {

            for (int j = 0; j <= i ; j++) {
                System.out.print((char)(alphabet) + " ");
            }
            alphabet++;
            System.out.println();
        }

    }
}
