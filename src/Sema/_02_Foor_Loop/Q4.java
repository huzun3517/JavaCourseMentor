package Sema._02_Foor_Loop;

public class Q4 {
    public static void main(String[] args) {
        int count = 5;
        for (int i = 3; i < 7; i = i + 2) {
            count += i;
        }
        System.out.println(count);
    }
}

/*
5
7
9
13

 */
