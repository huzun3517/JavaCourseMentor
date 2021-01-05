package Burak._04_MultipleParameters_MethodOverloading_Varargs.a_MultipleParameters;

public class MultipleParameters_2 {
    public static void main(String[] args) {

        //todo ----- Method'ların kullanım mantığı
        //Daha okunaklı ve anlaşılır.
        //Anlaşılabilir ve okunaklı olması için isimleri iyi koymak gerekiyor.
        //Method ismine Ctrl + Sol Click ile method kodlarına gidebiliyoruz. Ya da tam tersi.


        selamlama();
        soruBasliklari(1);
        cizgiler();
        soru1();
        soruBasliklari(2);
        cizgiler();
        soru2();


    }
    public static void selamlama(){
        System.out.println("Kahve dükkanımıza hoşgeldiniz:  ");
    }
    public static void cizgiler(){
        System.out.println("-------------------------------------");
    }
    public static void soruBasliklari(int sayi){
        System.out.println("\nSoru " + sayi  + ": ");
    }
    public static void soru1(){
        System.out.println("Kahveniz nasıl olsun?");
    }
    public static void soru2(){
        System.out.println("Burada mı içmek istersiniz yoksa to go mu?");
    }
}
