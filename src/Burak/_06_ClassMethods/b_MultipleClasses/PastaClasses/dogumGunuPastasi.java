package Burak._06_ClassMethods.b_MultipleClasses.PastaClasses;

public class dogumGunuPastasi {

    //todo           Methodlarla pasta siparişi

    public static void aroma(){

        System.out.println("Muz ve Çikolata");
    }

    public static void kacKatli(int kat){

        System.out.println("Pasta " + kat + " katlı.");
    }

    public static void kime(String isim){

        System.out.println("Bu pasta " + isim + " isimli kişiye yapılmıştır.");
    }

    public static void kacGram(double gram){

        System.out.println("Bu pasta " + gram + "'dır.");
    }
}
