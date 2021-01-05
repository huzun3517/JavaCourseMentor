package AhmetT._03_Method;

import java.util.Scanner;

public class e_Asal_proje {

    public static void main(String[] args) {

            long num;
            Scanner sc = new Scanner(System.in);

            // bu do loop ile girilen sayi 2'den büyük olana kadar sayi aliyoruz
            do {
                System.out.print("Asal Çarpanları Bulunacak Tamsayıyı Giriniz: ");
                num = sc.nextLong();
            } while (num < 2);    // num < 2 oldugu sürece devam et

            System.out.println(num + " = " + asalCarpanlariBul(num));
        }



    public static String asalCarpanlariBul(long num){
        int asalSayi = 2;
        String retStr="";
        while (num > 1) {
            int asalCarpanSayisi = kacTaneCarpanVar(num, asalSayi);
            if (asalCarpanSayisi > 0) {
                retStr += asalSayi + "^" + asalCarpanSayisi + " * ";
                num/=Math.pow(asalSayi,asalCarpanSayisi);
            }
            asalSayi = sonrakiAsal(asalSayi);
        }
        return retStr.substring(0, retStr.length()-2);
    }

    public static int sonrakiAsal(int n){
        boolean asal = false;
        int num = n+1;
        while (!asal){
            if (asalMi(num)) {
                asal = true;
                break;
            }else num++;
        }
        return num;
    }

    public static boolean asalMi(long n){
        boolean asal = true;
        for (int i=2; i<= n/2; i++)
            if (n % i == 0)
                asal = false;
        return asal;
    }

    public static int kacTaneCarpanVar(long num, int carpan){
        int count = 0;
        while (num>0) {
            if (num % carpan == 0){
                num/=carpan;
                count++;
            } else break;
        }
        return count;
    }
}
