package AhmetT._03_Method;

public class asalSayi {

    public static void main(String[] args) {

        int n = 20;

        int sayac = 0;
        for(int sayi=2;sayi<=n;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
           //     System.out.print(sayi+"\n");
                  sayac++;

            }
        }
        System.out.println(sayac);
    }
}