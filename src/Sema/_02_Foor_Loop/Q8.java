package Sema._02_Foor_Loop;

public class Q8 {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}
/*
0-10 arasi tek numaralar print edilecek
0-10 arasi cift numaralar print edilecek
kod compile olmayacak
hicbiri
 */