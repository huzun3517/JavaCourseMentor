package AhmetT._03_Method;

public class a_Method_ozet {

    public static void main(String[] args) {
        int[] arr = {6,12,3,7,5};

        sayiYaz(arr); // 6 12 3 7 5
        System.out.println();

        minArr(arr); // --> normalde return ile gönderildi. Ama direkt yazdırılmaz. Önce değişkene atamam lazım
        int min = minArr(arr);
        System.out.println(min); // --> 3

        int toplam = seriToplami(10);
        System.out.println(toplam);




    }
    // void --> değer döndürmez
    // type --> deger döndürür

    public static void sayiYaz(int[] arr){ // 1.sıra

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int minArr(int[] arr) { // 2.sıra
        int min = arr[0];
        for (int n : arr)
            if (min > n) min = n;
            return min;
    }

    public static int seriToplami(int n) {
        int sum = 0;
        for (int i = 0; i <=n ; i++)
            sum += i;
        return sum;

    }




}
