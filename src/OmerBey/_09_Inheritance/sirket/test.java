package OmerBey._09_Inheritance.sirket;

public class test {

    public static void main(String[] args) {

        calisan sekreter = new calisan("Hakan","Bilişim",2000);
        sekreter.zam();
        sekreter.Bilgilerim();

        System.out.println("---------------------");

        calisan satisDanismani = new calisan("Hatice","Satış",1700);
        satisDanismani.Bilgilerim();

        System.out.println("---------------------");

        yonetici mudur = new yonetici("Ömer","Yönetim",3500,10);
        mudur.zam();
        mudur.Bilgilerim();



    }
}
