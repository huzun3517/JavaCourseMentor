package A_KursOncesiHazirlik.Odevler;

public class
Odevler {


    public static void main(String[] args) {



        //TODO SORU 1

        /*

        a isminde bir String oluşturun.

        Bu Stringin değeri - "Yanlış bildiğin yolda hеrkеslе yürüyеcеğinе, doğru bildiğin yolda tеk başına yürü…"   - olsun.

       String a'nın karakter sayısını bulunuz.
       Konsola yazdırınız.

         */

    /*
        String a = "Yanlış bildiğin yolda hеrkеslе yürüyеcеğinе, doğru bildiğin yolda tеk başına yürü…";
        System.out.println(a.length());

     */




        //TODO SORU 2

        /*

        String b oluşturun.
        bu Stringin değeri "JAVA ÇOK KOLAY." olsun.
        Bu stringi "küçük harfli" hale getiriniz ve küçük harfli halini "String kucuk" e eşitleyiniz.

        String kucuk ' ü yazdırınız.

         */

    /*
        String b = "JAVA ÇOK KOLAY.";
        String kucuk = b.toLowerCase();
        System.out.println(kucuk);

     */


        //TODO SORU 3

        /*

        Bir string oluşturun ve ismi (lakabı) -ismim- olsun. (String ismim)
        Değeri de "Ahmet" olsun.

            Daha sonra bir integer  oluşturun ve ismi    yasim-  olsun.  (int yasim)
            Değeri de 32 olsun.

            Konsola şunu yazdırın.

            "Onun ismi Ahmet'tir ve o 32 yaşındadır.


            (Lütfen verilen değerleri kullanarak yazın. Hepsini bir tırnak içine yazmayınız;
          YANLIŞ CEVAP ---->>System.out.println("Onun ismi Ahmet'tir ve o 32 yaşındadır"); <<<<------

        */

    /*
        String ismim = "Ahmet";
        int yasim = 32;
        System.out.println("Onun ismi " + ismim + "'tir" + " ve o " + yasim + " yaşındadır.");

     */



        //TODO SORU 4

        /*

        int i oluşturun. değeri 35 olsun.

        int n oluşturun. değeri , int i 'nin 2 katı olsun. (Direkt int n =70; yazmayın. denklem kurarak devam edin.   Örneğin    int k = g *2;)

        int m oluşturun, değeri, int i ile int n 'nin toplamına eşit olsun.

       int toplam oluşturun ve tüm sonuçları buna eşitleyin.


        Konsola =  İşlemlerin sonucu = cevabı yazdırın.

       örneğin; -->  İşlemin sonucu = 500


        */
    /*
        int i = 35;
        int n = i * 2;
        int m = i + n;
        int toplam = i + n + m;
        System.out.println("İşlemin sonucu= " + toplam);

     */


        //TODO SORU 5


        /*

       int sayi1  oluşturun ve değeri 10 olsun.

       int sayi2 oluşturun ve değeri,  int sayi1 'in 3e BÖLÜMÜNDEN KALANA eşit olsun.

       int sayi3 oluşturun ve değeri, int sayi1 ile int sayı2 nin FARKINA eşit olsun.

       bu üç integeri toplayın ve int toplamsayi 'ya eşitleyin.

       int toplamsayi yi yazdırın.

         */

     /*
        int sayi1 = 10;
        int sayi2 = sayi1 % 3;
        int sayi3 = sayi1 - sayi2;

        int toplamsayi = sayi1 + sayi2 + sayi3;
        System.out.println(toplamsayi);

      */




        //TODO    *********BONUS SORU **********

        /*
        Direkt olarak bu soru ile alakalı örnek çözmedim, ancak bu soruyu çözebilmeniz için gereken her şeyi öğrendiniz..


        String myString oluşturun. ve değeri:      Kod, espri gibidir. Açıklamak zorundaysanız kötüdür.         olsun.
        myString deki KARAKTER SAYISINI bulun ve bir İNTEGER'e eşitleyin.

       Konsola örneğin:
            'Kod, espri gibidir. Açıklamak zorundaysanız kötüdür.' Cümlesinin karakter sayısı 60'tır.

            yazdırın.

         (Konsolda yazmasını istediğim cümlenin BİREBİR aynı olması gerekiyor. Cümlenin başındaki tırnak işaretleri, nokta ve boşluklar da birer karakterdir.!!)

         */

    /*
        String  myString = "Kod, espri gibidir. Açıklamak zorundaysanız kötüdür.";
        int karaktersayisi = myString.length();
        System.out.println("'" + myString + "'" + " Cümlesinin karakter sayısı " + karaktersayisi + "'dir.");

     */


           }
}
