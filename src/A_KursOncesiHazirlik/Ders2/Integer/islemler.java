package A_KursOncesiHazirlik.Ders2.Integer;

public class islemler {

    public static void main(String[] args) {
        System.out.println("TOPLAMA ----------------------------/////");
        int x = 5;
        int y = 20;
        int z = 30;

        System.out.println(x + y + z );

        int toplam = x + y + z; ;

        System.out.println(toplam);


        System.out.println("Toplamları=" + x + y + z ); //52030
        System.out.println("Toplamları=" + (x + y + z)); //55



        //TODO SORU 1

        /*
        int q ve int w değerlerini oluşturun.
        Değerleri sırayla  110, 20
        toplamlarını int t a eşitleyin.
        int t yi yazdırın.
        Toplamları = toplamlarını yazdırın.
         */

        int q = 110;
        int w = 20;
        int t = q + w;

        System.out.println("Toplamları=" + t);



        //TODO TOPLAMA - ÇIKARMA - ÇARPMA - BÖLME - KALAN HESAPLAMA

        //TODO Çıkarma

        System.out.println(q-w);
        System.out.println("Farkları =" + (q-w));




        int fark = q-w;
        System.out.println("Farkları =" + fark);





        //TODO SORU 1

        //int q dan int w yu çıkarın.
        //sonucu int l ile toplayın. (50)
        //int sonuc'a esitleyin.
        //sonucu bastırın.

        int l = 50;

        int sonuc =q-w + l;

        System.out.println(sonuc);





        //TODO Çarpma - - -- - -- - - - -

        int sayı1 =5;
        int sayı2 =10;
        int sayı3 =20;

        System.out.println( "Sonuç: " + (sayı1 * sayı2 * sayı3)); //Sonuç: 1000


        System.out.println(sayı1 + sayı2 * sayı3);





        //TODO BÖLME --- - - - - - - --

        System.out.println("sonuç=" + (sayı3 / sayı1));

        int bolmeSonuc=sayı3 / sayı1;

        System.out.println("20 / 5 = " + bolmeSonuc+"'tür.");





        //TODO KALAN HESAPLAMA-----------------

        System.out.println(10 % 4);

        int kalan1 = 100;
        int kalan2 =24;

        System.out.println(kalan1 % kalan2);




                //TODO KONU SONU SORUSU -----
            /*

            int deger1, int deger2 ve int deger3 isminde 3 int olusturun.
            sırasıyla  20, 40, 10.

            değer 1 ile değer 2 yi çarpın, sonucu değer 3 e bölün.
            int sonucum 'a değerleri eşitleyin.
            5 e bölümünden kalanını yazdırın.

                    Kalan =  sonucu yazdırın.
             */


                //TODO CEVAPLAR


        int deger1=20;
        int deger2=40;
        int deger3=10;


        //1. yol
        int sonucum = deger1 * deger2 / deger3;

        System.out.println("Kalan=" + sonucum % 5);


        //2. yol
        int besebol= sonucum%5;
        System.out.println("Kalan=" + besebol);



        //Daha da kısaltmak için (Buna gerek yok, sadece göstermelik)

        String kln = "Kalan=";

        System.out.println(kln + besebol);


    }
}
