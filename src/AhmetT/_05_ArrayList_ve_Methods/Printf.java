package AhmetT._05_ArrayList_ve_Methods;

public class Printf {
    public static void main(String[] args) {

        int iNum = 12;
        double dNum  = 12345.12345678919D;

        System.out.println("int be double degerleri oldugu gibi yazdiriyoruz: ");
        System.out.printf("iNum = %d   dNum = %f\n", iNum, dNum);

        System.out.println();
        System.out.println("int degeri 10 hane icerisine saga dayali yazdiriyoruz: ");
        System.out.printf("iNum = %10d   dNum = %f\n", iNum, dNum);

        System.out.println();
        System.out.println("int degeri 10 hane icerisine sola dayali yazdiriyoruz: ");
        System.out.printf("iNum = %-10d   dNum = %f\n", iNum, dNum);

        System.out.println();
        System.out.println("double degeri virgülden sonra 5 haneli yazdiriyoruz: ");
        System.out.printf("iNum = %d   dNum = %.2f\n", iNum, dNum);

        System.out.println("double degeri toplam 5 haneli virgülden sonra 2 hane olacak sekilde yazdiriyoruz: ");
        // burada tam degerlerde degisiklik olmaz,
        System.out.printf("iNum = %d   dNum = %5.2f\n", iNum, dNum);

    }

}
