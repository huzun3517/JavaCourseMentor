package A_KursOncesiHazirlik.Ders2.StringMethodlari;

public class UpperLowerCase {


    public static void main(String[] args) {




        //TODO KARAKTERİ BÜYÜK - KÜÇÜK YAZDIRMA

        String a = "Techno Study";



        System.out.println(a.toUpperCase()); //TECHNO STUDY

       String upperA =a.toUpperCase();
       System.out.println(upperA);


        String b = "ALMANYA sıNıFı";

        System.out.println(b);
        System.out.println(b.toLowerCase());


        String lowerb = b.toLowerCase();

        System.out.println(lowerb);


        //TODO SORU 1

        /*
        String a olusturun.
        "HAYIRLI RAMAZANLAR"
        String a nın küçük harfli halini,  String h eşitleyin.
        String b yi yazdırın.

*/

        String str = "HAYIRLI RAMAZANLAR";
        String h = str.toLowerCase();
        System.out.println(h);



        //TODO SORU2

      /*  String s olusturun.
         hayırlı ramazanlar
        String s'in büyük harfli halini, String upper ' a eşitleyin.
        String upper 'ı yazdırın. */



        String s = "hayırlı ramazanlar";
        String upper = s.toUpperCase();

        System.out.println(upper);
    }

}
