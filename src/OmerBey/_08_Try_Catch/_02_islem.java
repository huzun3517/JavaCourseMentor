package OmerBey._08_Try_Catch;

public class _02_islem {
     /*
    randomSayi isminde static void bir method oluşturun.

    Bu method içerisinde iki int random sayı oluştusun. (0'dan 10 a kadar)

    Bu iki random sayının toplamını yazdırın.
    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak ("Sayı 12'den küçük ise hata verir") yazsın.

    Methodu main methodunda çağırın ve kodun düzgün çalışmasını sağlayın. (Aksaklığı giderin)
     */

    public static void main(String[] args) {

        try {
            randomSayi();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }

    public static void randomSayi() throws Exception {

        int ran1 = (int)(Math.random()*10 + 1);
        int ran2 = (int)(Math.random()*10 + 1);
        System.out.println(ran1 + ran2);

            if (ran1 + ran2 < 12){
                throw new  Exception("Sayi 12 den küçük ise hata verir.");
            }

    }
}
