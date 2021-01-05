package OmerBey._02_Switch_Case;

import java.util.Scanner;

public class b_NestedIfElse2 {

    public static void main(String[] args) {

        /*
            hava durumu ile ilgili sistem size "derece giriniz" sorusunu sorsun.

        int derece oluşturarak bir değer giriniz.

        havanın güneşli olup olmadıgını belirlemek için de         boolean sunny               oluşturunuz.

        eğer derece 40 tan fazla ise    "dışarısı çok sıcak!" yazsın ve eğer güneşli ise  (boolean=true ise)  ,   " ayn ı zamanda güneşli ! " yazsın.

        güneşli değil ise (boolean? false ise)       ,      "ve bulutlu "  yazsın.


        40 dereceden düşük ise dışarısı sıcak değil yazsın.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Derece giriniz: ");
        int derece = scanner.nextInt();



        if (derece > 40) {
            System.out.print("Hava güneşli mi: ");
            boolean gunes = scanner.nextBoolean();

            System.out.println("Dışarısı çok sıcak");
            if (gunes == true) {
                System.out.println("Aynı zamanda güneşli");
            }
            else {
                System.out.println("Bulutlu");
            }
        }
        else {
            System.out.println("Dışarısı sıcak değil");
        }
    }
}
