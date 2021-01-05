package A_KursOncesiHazirlik.Ders0;

public class D_DegiskenDonusturme {
    public static void main(String[] args) {
        // byte-->short-->int-->long

        System.out.println(23);

        byte b1=2;
        int i1= 399;
        byte b2=(byte)i1;   // 399
        System.out.println(b2);
        byte toplam1=(byte)(b1+i1);  // 401
        System.out.println(toplam1);






//        int toplam2=b1+i1;
//        System.out.println(toplam2);


        short s1=23;
        long l1=24;
        long toplam=s1+l1;
        System.out.println(toplam);

        long sayi4= 258;
        byte b4=(byte)sayi4;
        System.out.println(b4);


    }
}
