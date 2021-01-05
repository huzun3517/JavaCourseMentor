package A_KursOncesiHazirlik.Ders2.StringMethodlari;

public class StringLength {

    public static void main(String[] args) {


        //TODO LENGTH METHODU

        //Bu method sayesinde, Stringte kaç karakter oldugunu bulabiliriz.

        String a = "Techno Study";      //12
        System.out.println(a.length());

        String b = "Techno Study almanya sınıfı 25 mayıs tarihinde başlıyor.";

        System.out.println(b.length());


        //TODO SORU 1


        System.out.println("<------------------SORU 1 ---------------------------------");

        /*
          Değeri    -Techno Study Avrupa Sınıfı-    olan bir String oluşturun. İsmi myString olsun.
          Bu stringde kaç karakter olduğunu konsola yazdırın.     */

                String myString = "Techno Study Avrupa Sınıfı";

        System.out.println(myString.length());



        //todo SORU 2

        //myString i kullanın.

        //Techno Study Avrupa Sınıfı cümlesinde 26 karakter vardır.

        System.out.println(myString + " cümlesinde " + myString.length()+" karakter vardır.");



    }


}
