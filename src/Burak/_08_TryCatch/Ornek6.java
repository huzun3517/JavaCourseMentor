package Burak._08_TryCatch;

public class Ornek6 {
    public static void main(String[] args) {

        System.out.println("Başlatılıyor....");

        int a = 0;

        try{
            a = 2/0;
        }catch (Exception hata){
            hata.printStackTrace();
        }
        System.out.println("Bitiriliyor..."); //Hata kodunu ayrıntılı şekilde gösteriyor.

    }
}
