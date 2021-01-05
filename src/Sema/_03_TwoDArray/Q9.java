package Sema._03_TwoDArray;

public class Q9 {
    public static void main(String[] args) {
        int a[][] = {{1, 3, 4}, {2, 3}, {4, 1}, {2}, {3}};
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                sum += a[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }
}

/*
sum=23
sum=13
sum=18
Throws ArrayIndexOutOfBoundException
 */