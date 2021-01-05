package Sema._03_TwoDArray;

public class Q1 {
    public static void main(String[] args) {
        double[][] values =
                { {1.2, 9.0, 3.2},
                  {9.2, 0.5, 1.5, -1.2},
                  {7.3, 7.9, 4.8} } ;
        System.out.println(values[2][1]);
    }
}

/*
7.3
7.9
9.2
ArrayIndexOutOfBoundsException
 */