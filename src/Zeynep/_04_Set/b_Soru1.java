package Zeynep._04_Set;

import java.util.Arrays;
import java.util.HashSet;

public class b_Soru1 {

    /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.

    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.

    Çıktı--> sonuc = 44.69
     */

    public static void main(String[] args) {


        System.out.println(setOlustur());

        double sonuc = settoplam(setOlustur());

        System.out.println(sonuc);

    }

    public static HashSet<Double>setOlustur(){

        HashSet<Double>hs = new HashSet<>(Arrays.asList(3.23,3.10,5.12,10.12,23.12));

        return hs;
    }


    public static double settoplam(HashSet<Double>hs){

        double top =0;

        for (Double num: hs) {
            top+=num;
        }
        return top;
    }
}


