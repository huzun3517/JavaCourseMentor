package Zeynep._01_Stringmethods;

import java.util.Scanner;

public class B_Orneklerim {
    public static void main(String[] args) {


        //TODO ORNEK1

        //1.kisim metindeki r karakterini ^ karakteri ile degistiriniz

        //2.kisim ilk kisma ek olarak  l ve p karakterlini de degistiriniz. hepsini tek bir replace ya da replaceAll kullanarak yapabilirsiniz

        //ornegin;

        //String cumle = "Buralardan gelip gecen pek coktur.";

        //System.out.println(cumle.replace('r','^').replace('l','!').replace('n', 'W'));


        //TODO ORNEK2

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //ikinci ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Stringstr1 : ");
        String str1 = scanner.nextLine();  //mavi

        System.out.print("Stringstr2 : "); //gokyuzu
        String str2 = scanner.nextLine();

        String al1 = str1.substring(1);
        String al2 = str2.substring(1);
        System.out.println("Stringlerin ilk birleşimi: " + str1 + " " + str2);
        System.out.println("Stringlerin islemden sonraki birlesimi: " + al1 + " " + al2);





        //TODO ORNEK3

        //1.kisim>>> icerisinde renk gecen bir metin yaziniz ve bu rengin metin icinde olup olmadigini kontrol edin.

        //2.kisim>>> rengin oldugu kismi baska bir renk ile degistiriniz

    /*  String str = "Mavi deniz ne de guzel gorunuyor.";
        System.out.println(str.contains("Mavi"));  //1.kisim
        System.out.println(str.replace("Mavi","Yesil")); // 2.kisim  */

    }
}