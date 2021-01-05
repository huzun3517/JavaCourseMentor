package A_KursOncesiHazirlik.Ders3.KonuAnlatimi;

import java.util.Scanner;

public class scannerGiris {

    public static void main(String[] args) {

        //TODO SCANNER

            /*
            1.Kullanıcı ile etkileşim içerisinde olmaktır.
            2.İstedigimiz verileri kullanıcıdan almaktır.
            3.Bu aldıgımız degerleri işlemlerde kullanabilir, şartlara tabi tutabiliriz.

             */


        //TODO İMPORT NEDİR ?

    /*
           Java kütüphanemizde var olan bir sınıfı, bir fonksiyonu, class'ımıza dahil etmektir.
           Örneğin,Ekran paylaşmak için yönetici olmak gerekiyor. Yönetici bana izin verdiginde ekranı acabiliyorum.

            Java = Yönetici
           import = izin   */



        Scanner sc = new Scanner(System.in);

    /*   System.out.println("Bir isim giriniz: ");

        String mesaj = sc.nextLine();
        int yas = sc.nextInt();


        System.out.println("Yaşınızı giriniz: ");




        System.out.println("İsminiz: " + mesaj);
        System.out.println("Yaşınız: " + yas);  */



        //todo dikkat edilmesi gereken nokta --- BİR İNT DEĞERDEN SONRA BİR STRİNG DEĞER SCAN ETMEK İSTİYORSAM;


        //Buradaki olay, integer dan sonra String nextLine kısmını java enter olarak algılıyor.  Ve Stringi otomatik olarak atlıyor.
        //Kısacası NEXT.İNT TEN SONRA   BİR   NEXTLİNE ALAMIYORUZ
        //Yapmamız gereken şey;
        //herhangi bir deger atamadan bir girdi yazmam gerekiyor ki,
        // next intten sonra atlacağı, yok sayacağı boş bir değer olsun. onu atladıktan sonra String meyveyi görecektir.

        int rakam = sc.nextInt();
        sc.nextLine();  //dummy code
        String meyve = sc.nextLine();

        System.out.println("Rakam:" + rakam);
        System.out.println("Meyve:" + meyve);

    }
}
