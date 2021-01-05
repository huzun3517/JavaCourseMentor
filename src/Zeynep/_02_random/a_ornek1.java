package Zeynep._02_random;

public class a_ornek1 {

    public static void main(String[] args) {

        Math.random(); // 0,0 ve 1.0 arasında bir deger veriyor.
        double random = Math.random();

        // eger tamsayı olarak bir deger istiyorsak * 10 gibi bir sayı ile çarpabiliriz.

        // egerki bir deger aralığında olacak şekilde bir random rakam istiyorsak o zaman bize
        // verilen formulu kullanabiliriz.

        // (int) (Math.random() * (max - min) + 1)) + min;

        // (int) (Math.random() * (max - min) + 1));

        // todo ornek

        int min = 0;
        int max = 15;

        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(randomNumber);


    }
}
