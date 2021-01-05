package Sema._02_Foor_Loop;

public class Q7 {
    public static void main(String[] args){
        int i = 1;
        for(; i < 10; i++){
            break;
        }
        System.out.println(i);
    }

}
/*
0
1
10
Compilation Fail
 */