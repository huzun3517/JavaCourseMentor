package OmerBey._02_Switch_Case;

import java.util.Scanner;

public class c_NestedIfElse3_Menu_Projesi {

    public static void main(String[] args) {

         /*
        Büfeden sipariş vereceksiniz.
        Double cuzdanim  oluşturun ve içerisinde 20 euro para olsun.
        Ve double toplamTutar oluşturun, her işlem sonrası artsın. (her siparişten sonra belirtilen fiyatı toplamtutara ekleyin!!

        ilk olarak konsolda;
        1.Hamburger : 3 Euro
        2.CheeseBurger: 4 Euro
        3.Döner : 2.5 Euro

        yazsın.   Kullanıcı int değeri girerek seçeneklerden birini seçsin.

                todo Eğer 1'i seçerse,
          (toplamTutara hamburgerin fiyatını eklemeyi unutmayın!!)
        Sistem bize "Ekstra Köfte İster misiniz ? (+1 Euro fark ile) :   (büyük küçük harf duyarlı olmaması için method kullanın)

        evet derse "2. köfte ekleniyor" mesajı gelsin.Altında da "Çift köfteli hamburgeriniz hazır !" yazsın.

        Hayır derse "Hamburgeriniz hazırdır !" yazsın.

        todo Eğer 2 yi seçerse,

         Sistem bize "Ekstra peynir ister misiniz? (+ 0,50 cent fark ile)  sorusunu sorsun.

         Evet derse, "2. peynir ekleniyor" mesajı, ve altına da "Çift peynirli Cheeseburgeriniz hazır! yazsın.

         Hayır derse, " ekstra peynirsiniz CheeseBurgeriniz hazır !"    yazsın.

        todo Eğer 3 'ü seçerse,

        Ekstra Sos ister misiniz ? (Barbekü sos ve Acı sos) :     sorusunu sorsun.
        evet


        Eğer Barbekü sos seçilirse "Barbekü soslu döneriniz hazır ! ",
        Eğer Acı sos seçilirse "Acı soslu döneriniz hazır !

        hayır derse,
     Döneriniz sossuz hazırlanıyor..


todo    İçecek ister misiniz ? (Mevcut içeceğimiz: Coca Cola = 1,5 Euro)

Eğer evet derse, "Normal ya da Zero ?  (normal veya zero olarak cevaplayınız ): "  sorusunu sorsun.

 Eğer normal derse, Coca Cola hazırlanıyor..
 Eğer  zero derse, Coca Cola Zero hazırlanıyor.


 Bu aşamaya kadar hep harcalamalar yaptık.
 Her harcama yaptıgımızda double toplamTutar'a bunu eklememiz gerekiyor.

 Önce cüzdanımı görmek istiyorum. (cüzdanım = 100 euro)
 Toplam tutarı yazdırın.. (45 euro )
 double paraUstu oluşturun ve paraüstünü yazdırın. (para üstü = 55 euro)



 -TODO İPUCU -  Dummy kod eklemeniz gereken yerleri tespit edin ve boş Line ekleyin. (String bosLine = sc.nextLine();)

                 */

        double cuzdanim = 20;
        double toplamTutar = 0;

        String islemler = "1.Hamburger: 3 Euro\n" + "2.CheeseBurger: 4 Euro\n" + "3.Döner: 2.5 Euro";

        System.out.println(islemler);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Seçmek istediğinin işlem numarasını giriniz: ");
        int islem = scanner.nextInt();
        scanner.nextLine();

        if (islem == 1){
            toplamTutar += 3;
            System.out.print("Ekstra Köfte İster misiniz ? (+1 Euro fark ile) : ");
            String str = scanner.nextLine();

            if (str.equalsIgnoreCase("Evet")){
                toplamTutar += 1;
                System.out.println("2. köfte ekleniyor");
                System.out.println("Çift köfteli hamburgeriniz hazır !" );
            }

            else if (str.equalsIgnoreCase("Hayır")){
                System.out.println( "Hamburgeriniz hazırdır !");
            }

            else {
                System.out.println("Hatalı giriş yaptınız...");
            }
        }

        if (islem == 2){
            toplamTutar += 3;
            System.out.print("Ekstra peynir ister misinz ? (+0.5 cent fark ile) : ");
            String str = scanner.nextLine();

            if (str.equalsIgnoreCase("Evet")){
                toplamTutar += 0.5;
                System.out.println("2. peynir ekleniyor");
                System.out.println("Çift peynirli Cheeseburgeriniz hazır!" );

            }
            else if (str.equalsIgnoreCase("Hayır")) {
                System.out.println( " ekstra peynirsiniz CheeseBurgeriniz hazır !");
            }
            else {
                System.out.println("Hatalı giriş yaptınız...");
            }
        }

        if (islem == 3){
            toplamTutar += 2.5;
            System.out.print(" Ekstra Sos ister misiniz ? +0.5 cent fark ile: ");
            String str = scanner.nextLine();

            if (str.equalsIgnoreCase("Evet")){
                toplamTutar += 0.5;
                System.out.println("Acı sos veya Barbekü sos: ");
                String cev = scanner.nextLine();

                if (cev.equalsIgnoreCase("Barbekü sos")){
                    System.out.println("Barbekü soslu döneriniz hazır ! ");
                }
                else if (cev.equalsIgnoreCase("Acı sos")){
                    System.out.println("Acı soslu döneriniz hazır !" );
                }
                else {
                    System.out.println("Hatalı giriş yaptınız...");
                }

            }
            else if (str.equalsIgnoreCase("Hayır")){
                System.out.println( " Döneriniz sossuz hazırlanıyor..");
            }
            else {
                System.out.println("Hatalı giriş yaptınız...");
            }
        }

        System.out.print("İçecek ister misiniz ? (Mevcut içeceğimiz: Coca Cola = 1,5 Euro) : ");
        String cev = scanner.nextLine();

        if (cev.equalsIgnoreCase("Evet")){
            toplamTutar += 1.5;
            System.out.println("Normal ya da Zero ?  (normal veya zero olarak cevaplayınız ): ");
            String cev2 = scanner.nextLine();

            if (cev2.equalsIgnoreCase("Normal")){
                System.out.println("Coca Cola hazırlanıyor..");
            }
            else {
                System.out.println("Coca Cola Zero hazırlanıyor.");
            }

        }
        else if (cev.equalsIgnoreCase("Hayır")){
            System.out.println("İçeceksiz.");
        }

        else {
            System.out.println("Hatalı giriş yaptınız...");
        }

        System.out.println("Cüzdanım = " + cuzdanim);
        System.out.println("Toplam Tutar = " + toplamTutar);
        double paraUstu = cuzdanim - toplamTutar;
        System.out.println("Paraüstü = " + paraUstu);






    }
}
