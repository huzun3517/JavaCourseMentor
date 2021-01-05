package AhmetT._03_Method;

public class c_AsalMi {

    public static void main(String[] args) {


    }

    // Gelen bir degerin asal olup olmaigini bulan eden method
    public static boolean asaliMi(long n){
        boolean asal = true;
        for (int i=2; i<= n/2; i++)
            if (n % i == 0)
                asal = false;
        return asal;
    }

    // Gelen num degeri icinde kac adet carpan var
    // ya da carpan'a bölünme sayisini buulan method
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

    // Girilen n'den sonraki ilk asal sayiyi bulan method
    // bu methoddan asalMi(long n); methodu cagriliyor
    public static int sonrakiAsal(int n){
        boolean asal = false;
        int num = n+1;
        while (!asal){
            if (asaliMi(num)) {
                asal = true;
                break;
            }else num++;
        }
        return num;
    }




}
