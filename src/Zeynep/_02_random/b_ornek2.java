package Zeynep._02_random;

public class b_ornek2 {

    public static void main(String[] args) {

        /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" yazisini yazdirin,
     aksi takdirde "Tekrar deneyiniz" yazisi yazmali
     */

        int min = 1;
        int max = 6;

        int ilkatis = (int) (Math.random() * ((max - min) + 1)) + min;

        int ikinciatis = (int) (Math.random() * ((max - min) + 1)) + min;

        int toplam = ilkatis +ikinciatis;
        System.out.println( ilkatis + " + " + ikinciatis + " = " + toplam);

        if (toplam == 9) {
            System.out.println("Kazandınız");

        }
        else {
            System.out.println("Tekrar deneyiniz");
        }


    }
}
