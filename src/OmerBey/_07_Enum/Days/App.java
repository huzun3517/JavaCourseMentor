package OmerBey._07_Enum.Days;

/*
  //TODO
     days isminde enum class oluşturun ve haftanın günlerini yazınız.
     Months isminde enum class oluşturun ve ayları yazınız. Parametre olarak ta kaçıncı ay oldugunu yazınız.
     örn: OCAK(1)
     1-)main class ta ise günlerden salıyı seçip yazdırınız.
     2-)  Herhangi bir ayı seçip konsola şunu yazdırınız:
     Nisan yılın 4. ayıdır.
     */

public class App {

    public static void main(String[] args) {

        Days gun = Days.CARSAMBA;
        System.out.println("gun = " + gun);

        Months ay = Months.NISAN;
        System.out.println(ay + " yılın " + ay.getMonths() + ".ayıdır");


    }
}
