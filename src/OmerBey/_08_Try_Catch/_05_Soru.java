package OmerBey._08_Try_Catch;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _05_Soru {

    public static void main(String[] args) {

        int arrNo = 0, eleman = 0, index = 0;
        boolean islemTamam = false;
        int donguSayisi = 2;

        String[][] arr = {
                {"javayi", "nasil", "ogrenebilirim"},
                {"merhaba", "dünya", "java", "calismak", "lazim"}
        };

        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println(i + ". Deneme ---------------------------");
            System.out.println("1. Array = " + Arrays.toString(arr[0]));
            System.out.println("2. Array = " + Arrays.toString(arr[1]));
            System.out.println("Kacinci arrayin elemaninin kacici harfini istersiniz?");

            try {
                System.out.print("Kacinci Array : ");
                arrNo = sc.nextInt();
                System.out.print("Kacinci Eleman : ");
                eleman = sc.nextInt();
                System.out.print("Kacinci karakter : ");
                index = sc.nextInt();
                System.out.println(arr[arrNo - 1][eleman - 1].charAt(index));
                islemTamam = true;
                i++;
            } catch (InputMismatchException e) {

                System.out.println("Array seciminde rakam giriniz.");

            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Array ya da Arrayin bir elemanini secmediniz");

            } catch (StringIndexOutOfBoundsException e) {

                System.out.println("Sectiginiz kelimenin icinden bir karakter seciniz");

            } catch (Exception e) {

                System.out.println("Siradisi Hata!\n" + e.toString());


            } finally {

                sc.nextLine();
            }
        } while (!(islemTamam && i > donguSayisi));

        System.out.println("Islem tamamlandi......");

    }

}