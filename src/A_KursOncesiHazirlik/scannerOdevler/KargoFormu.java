package A_KursOncesiHazirlik.scannerOdevler;

import java.util.Scanner;

public class KargoFormu {

    public static void main(String[] args) {


        /*

       Kargo Formu oluşturun. Kullanıcıdan istenen bilgiler

       1.İsim Soyisim
       2. Adres         (abc Straße, no:22 Frankfurt)
       3.Telefon numarası - String olmalı
       4. Gönderilecek adres
       5. kilo başı fiyat 3 euro olsun.
       6. 15,5 kg luk bir paket gönderiyorsunuz. double
       7. Ek olarak hizmet bedeli, 1,5 euro ekleyiniz.
       8.Toplam fiyatı yazdırınız.
       9.En son tüm bilgileri yazdırınız.
         */


        /*        todo ÇIKTI KISMI BÖYLE OLMALI (birebir böyle olmalı. (büyük küçük harf, başlıklar vs. dikkat edilmeli.)
        -               DHL Kargo Formu             -

isim soyisim: Ömer özdemir
Adres bilgileri: Ricarda Huch weg 22 63526 Erlensee
Telefon numarası: 01573334455
Gönderilecek Adres: GoetheStraße  22 Frankfurt
Gönderilecek ürün ağırlığı: 15,5
-       BİLGİLER       -
İSİM: Ömer özdemir
ADRES: Ricarda Huch weg 22 63526 Erlensee
TELEFON NUMARASI: 01573334455
GÖNDERİLEN ARDES: GoetheStraße  22 Frankfurt
PAKET AĞIRLIĞI: 15.5
TOPLAM FİYAT (+1,5€ HİZMET BEDELİ ): 32.5€
         */




    }

    public static class DHL_Kargo_Formu {

        public static void main(String[] args) {
            /*

           Kargo Formu oluşturun. Kullanıcıdan istenen bilgiler

           1.İsim Soyisim
           2. Adres         (abc Straße, no:22 Frankfurt)
           3.Telefon numarası - String olmalı
           4. Gönderilecek adres
           5. kilo başı fiyat 3 euro olsun.
           6. 15,5 kg luk bir paket gönderiyorsunuz. double
           7. Ek olarak hizmet bedeli, 1,5 euro ekleyiniz.
           8.Toplam fiyatı yazdırınız.
           9.En son tüm bilgileri yazdırınız.
             */


            /*        todo ÇIKTI KISMI BÖYLE OLMALI (birebir böyle olmalı. (büyük küçük harf, başlıklar vs. dikkat edilmeli.)
            -               DHL Kargo Formu             -

    isim soyisim: Ömer özdemir
    Adres bilgileri: Ricarda Huch weg 22 63526 Erlensee
    Telefon numarası: 01573334455
    Gönderilecek Adres: GoetheStraße  22 Frankfurt
    Gönderilecek ürün ağırlığı: 15,5
    -       BİLGİLER       -
    İSİM: Ömer özdemir
    ADRES: Ricarda Huch weg 22 63526 Erlensee
    TELEFON NUMARASI: 01573334455
    GÖNDERİLEN ARDES: GoetheStraße  22 Frankfurt
    PAKET AĞIRLIĞI: 15.5
    TOPLAM FİYAT (+1,5€ HİZMET BEDELİ ): 32.5€
             */

            Scanner scanner = new Scanner(System.in);

            System.out.println("-                  DHL Kargo Formu                  -");
            System.out.print("İsim soyisim: ");
            String isim = scanner.nextLine();

            System.out.print("Adres bilgileri: ");
            String adres_bilgi = scanner.nextLine();

            System.out.print("Telefon numarası: ");
            String telefon = scanner.nextLine();

            System.out.print("Gönderilecek adres: ");
            String adres_gonder = scanner.nextLine();

            System.out.print("Gönderilecek ürün ağırlığı: ");
            double agirlik = scanner.nextDouble();

            System.out.println("-       BİLGİLER       ");
            System.out.println("İSİM: " + isim);
            System.out.println("ADRES: " + adres_bilgi );
            System.out.println("TELEFON NUMARASI: " + telefon);
            System.out.println("GÖNDERİLEN ADRES: " + adres_gonder);
            System.out.println("PAKET AĞIRLIĞI: " + agirlik);

            char euro = '\u20AC';
            double  hizmet_bedeli = 1.5d;
            double toplam = (agirlik * 2) + hizmet_bedeli;

            System.out.println("TOPLAM FİYAT(+1,5€ HİZMET BEDELİ ): " + toplam + euro );
        }
    }
}
