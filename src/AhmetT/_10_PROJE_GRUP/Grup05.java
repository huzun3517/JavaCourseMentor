package AhmetT._10_PROJE_GRUP;

import java.util.ArrayList;
import java.util.TreeSet;

public class Grup05 {

    public static void main(String[] args) {

        TreeSet<String> dersler = new TreeSet<>();
        dersEkle(dersler,"türk dili");
        System.out.println(dersler);

        System.out.println("-------------------------------------------------------------------");

         //     ArrayList<String>arrayList = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        //     ArrayList<String>arrayList = new ArrayList<>(Arrays.asList("$-13", "$0", "$0"));
        //     System.out.println( getSum(arrayList));

        System.out.println("-------------------------------------------------------------------");

    /*    Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        System.out.println(addDigits(num)); // Örnek1:		Girdi 38		Çıktı: 2

     */
        System.out.println("-------------------------------------------------------------------");

  /*      ArrayList<Integer>arrayList = new ArrayList<>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        int n1 = 20;
        int n2 = 30;

        System.out.println(rangeBtw(arrayList,n1,n2)); //min = 20 	max = 30 	return =  5    (20,22,25,28,30)

   */

        System.out.println("-------------------------------------------------------------------");

    //    int[] arr ={1, 2, 2};  //  sum67([1, 2, 2]) → 5
        int[] arr ={1, 1, 6, 7, 2};    //  sum67([1, 1, 6, 7, 2]) → 4
        System.out.println(sum67(arr));


        //  sum67([1, 2, 2, 6, 99, 99, 7]) → 5





    }

//---------------------------------------------------------------------------------------------------------------------------
  //TODO
 //  gelen eklenecekDers degiskenini kullanarak TreeSet'e ekleyen method
 //  Method - 6
 //  public static void dersEkle(TreeSet<String> dersler, String eklenecekDers) {

    public static void dersEkle(TreeSet<String> dersler, String eklenecekDers) {
        dersler.add((eklenecekDers));

    }


//---------------------------------------------------------------------------------------------------------------------------
//TODO
// getSum isminde bir method oluşturun.
// Parametresi ArrayList'tir.
// Dizideki tüm $ ları kaldır ve tüm sayıları topla
// return yaptğımız veri tipi 'int' olmalıdır.
// sonuç 0'dan küçükse, -1 yazdırın.
// Örnek1:		ArrayList = $13, $15, $20		Cevap = 48 olmalı
// Örnek 2 :	ArrayList= $-13, $0, $0			Cevap = -1 olmalı

    public static int getSum(ArrayList<String>arrayList) {

        int sum =0;

        for (String str : arrayList) {
            str =  str.replaceAll("[^0-9,-]","");
            sum += Integer.parseInt(str);
        }
        if (sum < 0)
        return -1;

        else return sum;
    }

//---------------------------------------------------------------------------------------------------------------------------
//TODO
// addDigits isminde bir method oluşturun.
// Parametresi int, Return tipi de int
// Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
// Tek basamaklı çıktığında, döndürün
// Örnek1:		Girdi 38		Çıktı: 2
// Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.	  2 , tek basamaklı olduğundan, bunu döndürün.

        public static int toplam(int num){

            String str = String.valueOf(num);
            String[] arr = str.trim().replaceAll("[^0-9]","").split( "");

            int sum =0;
            for (int i = 0; i < arr.length ; i++) {
                sum += Integer.parseInt(arr[i]);
            }
            return sum;
        }

        public static int addDigits(int n){
            for (int i = 0; i < 10 ; i++) {
                n = toplam(n);

                if (n < 10)
                    break;
            }
            return n;
        }

 //---------------------------------------------------------------------------------------------------------------------------
//TODO
// rangeBtw() isminde bir method oluşturun.
// Parametre olarak   bir Arraylist  ve iki ayrı int
// return tipi int
//  Arraylist'in iki int arasında kaç değeri olduğunu sayın.
// return  count       (sayacı (count) döndürün.)
// Example (Örnek):
// ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
// min = 20 	max = 30 	return =  5    (20,22,25,28,30)
// min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)

    public static int rangeBtw(ArrayList<Integer> arr, int n1, int n2){

        int count =0;

        for (int i = 0; i < arr.size() ; i++) {

            if (arr.get(i)>=n1 && arr.get(i)<=n2 ){
                count++;
            }

        }
        return count;
    }

 //---------------------------------------------------------------------------------------------------------------------------

   // TODO
   //  Return the sum of the numbers in the array, except ignore sections of numbers starting
   //  with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
   //  sum67([1, 2, 2]) → 5
   //  sum67([1, 2, 2, 6, 99, 99, 7]) → 5
   //  sum67([1, 1, 6, 7, 2]) → 4

 public static int sum67(int[] nums) {



    return 0;
 }

}

