package AhmetT._03_Method;

public class d_Asal_long {

    public static void main(String[] args) {

    }

    // Gelen bir long degerinin asal olup olmaigini bulan eden method
    public static boolean asaliMi(long n){
        boolean asal = true;
        for (int i=2; i<= n/2; i++)
            if (n % i == 0)
                asal = false;
        return asal;
    }
}
