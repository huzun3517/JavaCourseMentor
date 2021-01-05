package Burak._04_MultipleParameters_MethodOverloading_Varargs.c_VarArgs;

public class VarArgs_2 {

    //todo -------------- Varargs mantığı ve şartları
    public static void main(String[] args) {

        ogrenciler("Uğur" , 55, 67, 34, 56, 68, 78, 96);
        ogrenciler("Nesibe" , 98, 100, 97, 90, 99, 92, 100);
        ogrenciler("Nuran" , 85, 89, 79, 91, 85, 85, 95);
        ogrenciler("Semih" , 66, 67, 79, 80, 85, 80, 90);
    }
    //Varargs en sonda olmalı ve bir kere kullanılabilir.
    public static void ogrenciler(String isim, int ...not){

        int sum = 0;

        for (int toplam : not) {
            sum += toplam;
        }
        System.out.println(isim + " isimli öğrencinin not ortalaması: " + (sum / not.length));
    }
}