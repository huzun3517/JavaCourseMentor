package A_KursOncesiHazirlik.Odevler;

public class Odevler2 {

    public static void main(String[] args) {


        //                TODO    -- ÖDEVLER --

                   /*     1.-----------
            En sevdiğiniz 3 meyveyi alt alta yazdırınız. */

        // Cevap 1:
     /* String meyve1 = "Elma";
        String meyve2 = "Çilek";
        String meyve3 = "Armut";
        System.out.println(meyve1 + "\n" + meyve2 + "\n" + meyve3); */



                    /*    2.--------------------
Yukarıda yazdırmış olduğunuz meyveleri, başında tırnak işareti ile yazdırınız.
    Örn:Konsolda şöyle olmalı:   "Elma"   "Armut"  "Limon" */

        // Cevap 2:
    /*  String meyve1 = "\"Elma\"";
        String meyve2 = "\"Çilek\"";
        String meyve3 = "\"Armut\"";
        System.out.println(meyve1 + "\n" + meyve2 + "\n" + meyve3); */




                   /* 3.-------------

                    Bir String oluşturun ve ismi    'marka' olsun.

                   String marka  nın değeri, kullandığınız telefonun markasın olsun.

                   String marka 'yı print edin. */

        // Cevap 3:
        /*   String marka = "Samsung";
             System.out.println("Telefonumun markası: " + marka); */




                  /* 4-------------

                   String ad        oluşturun. -- Değeri kendi isminiz olsun.
                   String soyad  oluşturun-- Değeri kendi soyisminiz olsun.
                  int yas              oluşturun. -- Değeri kendi yaşınız olsun.

                  Konsolda aynen şu yazmalı:             Benim adım Ömer Özdemir'dir ve ben 23 yaşındayım.

                not:  (Kendi bilgilerim ile örnek verdim, siz kendi bilgileriniz ile dolduracaksınız...
                                                Oluşturduğunuz String ve int değerlerini kullanın!.) */

        // Cevap 4:
     /* String ad = "Hüseyin";
        String soyad = "Uzun";
        int yas = 34;
        String sonuc = "Benim adım " + ad + " " + soyad + "'dur ve ben " + yas + " yaşındayım.";
        System.out.println(sonuc); */



            /*       5----------

                    int a  oluşturun. Değeri 25
                    int b oluşturun. Değeri  50

                    bu iki integeri toplayın ve sonucu yazdırın.
                    konsolda şöyle yazmalı: 25 + 50 = 75 */

        // Cevap 5:
    /*  int a = 25;
        int b = 50;
        int toplam = a + b;
        System.out.println(a + "+" + b + "=" + toplam); */





              /*      6-----------

                  short s oluşturun. Değeri 15 olsun.
                  short h oluşturun. değeri 30 olsun.

                  Bu iki short 'un toplamını  short toplam ' a eşitleyin.
                  short toplamı yazdırın. */

        // Cevap 6:
     /*   short s = 15;
          short h = 30;
          short toplam =(short)(s + h);
        System.out.println(toplam); */



             /*     7-----------

              double aylik oluşturun. -- Değeri 30.5 olsun.
              int  aySayisi oluşturun. -- değeri 9 olsun.

                    Aylık 30.5 Euro olan fitness salonuna 9  aylık kayıt yaptırıyorsunuz.

            double toplamFiyat   oluşturun ve sonucu yazdırın.     (Çarpma işlemi        *    ile yapılır. )

           Örn: Konsolda şöyle yazmalı:                    Toplam fiyat : 274.5 Euro  */


        // Cevap 7:
    /*  double aylik = 30.5;
        int aysayisi = 9;
        double toplamFiyat = aylik * aysayisi;
        System.out.println("Toplam fiyat : " + toplamFiyat + " Euro"); */




         /*       8---------------

   int number1 oluşturun ve değeri 100 olsun.
   double number2 oluşturun ve değeri 67.7  olsun.
   short number 3 oluşturun ve değeri 44 olsun.

   Bu 3 değişkeni birbiri ile toplayın ve double toplam2 ' ye eşitleyin.
   toplam2 yi Stringe dönüştürün.   String i yazdırın. */

        // Cevap 8:
     /*   int number1 = 100;
        double number2 = 67.7;
        short number3 = 44;

        double toplam2 = number1 + number2 + number3;
        String i = Double.toString(toplam2);
        System.out.println("i = " + i); */



    /*        9--------------------------------------

int k oluşturun ve değeri 40 olsun.
int l oluşturun ve değeri k'nın değerinin 2 katı olsun.         (Direkt 80 yazmayın, denklem kurarak yazın)  (Çarpma işlemi   *  simgesi ile yapılır)
int m oluşturun ve  değeri, int k ile int l ' nin toplamdan 35 eksik olsun.

int sonuc oluşturun ve bu üç değişkeni birbiri ile toplayın.
sonucu double s 'a döndürün ve double sonuc'u yazdırın. */

        // Cevap 9:
     /* int k = 40;
        int l = k * 2;
        int m = (k + l) - 35;
        double s = k + l + m;
        System.out.println("Sonuç = " + s); */




     /*  Not: Yapamadığınız soruları grup arkadaşlarınızla tartışarak çözmeye çalışınız.
         Hata yapmaktan korkmayın, doğruyu öğrenmenin en iyi yolu bol bol hata yapmaktır. Kolay gelsin :) */


    }
}
