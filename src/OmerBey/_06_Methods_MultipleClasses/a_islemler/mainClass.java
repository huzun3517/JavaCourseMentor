package OmerBey._06_Methods_MultipleClasses.a_islemler;

public class mainClass {

public static void main(String[] args) {

    islemClass islem = new islemClass();

    int randomSayi1= (int) (Math.random()*15+1);
    int randomSayi2= (int) (Math.random()*15+1);


    System.out.println("---------İŞLEMLER ------------");


    System.out.println("random1 = " + randomSayi1);
    System.out.println("random2 = " + randomSayi2 + "\n");

    System.out.println("Toplama  :  " + islem.topla(randomSayi1,randomSayi2));
    System.out.println(" Çıkarma :  " + islem.cikar(randomSayi1,randomSayi2));
    System.out.println(" Bölme    :  " + islem.bolme(randomSayi1,randomSayi2));
    System.out.println(" Çarpma  :  " + islem.carp(randomSayi1,randomSayi2));
}
    }

