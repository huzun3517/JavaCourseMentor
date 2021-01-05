package Burak._04_MultipleParameters_MethodOverloading_Varargs.b_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {

        //todo Method Overloading ---- Method'a Aşırı Yükleme
            toplama(2345, 3, 5, 7, 9, 32465325);
            toplama(1, 3, 23456, 7, 9, 5, 6);
            toplama(1, 3, 5, 7);
            toplama(1, 3, 324523);
            toplama(4587, 3);

            //değişkenleri istediğimiz gibi değiştirebiliyoruz.

    }
    public static void toplama(int a, int b, int c, int d, int e, int f){
        System.out.println("Toplama işleminin sonucu: " + (a + b + c + d + e + f));
    }
    public static void toplama(int a, int b, int c, int d, int e, int f, int g){
        System.out.println("Toplama işleminin sonucu: " + (a + b + c + d + e + f + g));
    }
    public static void toplama(int a, int b, int c, int d){
        System.out.println("Toplama işleminin sonucu: " + (a + b + c + d));
    }
    public static void toplama(int a, int b, int c){
        System.out.println("Toplama işleminin sonucu: " + (a + b + c));
    }
    public static void toplama(int a, int b){
        System.out.println("Toplama işleminin sonucu: " + (a + b));
    }
}
