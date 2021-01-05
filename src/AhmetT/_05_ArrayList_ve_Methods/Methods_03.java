package AhmetT._05_ArrayList_ve_Methods;

public class Methods_03 {

    public static void main(String[] args) {

        System.out.println(topla(2,5));


        System.out.println(topla("a", "b"));

        String s = "a";

    }


    // overloading
    public static int topla(int a, int b, int c){
        return a+b+c;
    }

    public static String topla(int x, int y){
        return (x + y) + "";            // int + string  --> string  == Integer.toString(x+y)
    }

    public static String topla(String a, String b){
        return a+ " " + b;
    }
}
