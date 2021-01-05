package OmerBey._07_Enum.KahveDukkani;

public class main {

    public static void main(String[] args) {

        bakiye musteriler = bakiye.MUSTERI1;
        icecekler icecek = icecekler.GAZOZ;
        tatlilar tatli = tatlilar.CİLEKLİPASTA;

        double icecekFiyati = icecek.getFiyat();
        double tatliFiyati = tatli.getTatlifiyati();
        double bakiyem = musteriler.getBakiyem();
        double topTutar = icecekFiyati + tatliFiyati;
        double paraUstu = bakiyem-topTutar;



        if (topTutar > bakiyem){
            System.out.println("Bakiyeniz yetersiz. Bakiyeniz: " + musteriler.getBakiyem());
        }
        else {
            System.out.println("müşteri = " + musteriler.name());
            System.out.println("icecek = " + icecek + "-fiyatı: " + icecek.getFiyat());
            System.out.println("tatli = " + tatli + "-fiyatı: " + tatli.getTatlifiyati());
            System.out.println("topTutar = " + topTutar);
            System.out.println("paraUstu = " + paraUstu);
        }
    }
}