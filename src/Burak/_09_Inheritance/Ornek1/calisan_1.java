package Burak._09_Inheritance.Ornek1;

public class calisan_1 {
    
    //Her bir çalışanımızın ortak özellikleri bunlar olabilir.

    //field'ları seçip generate, cons.

    private String isim;
    private String alan;
    private int maas;


    public calisan_1(String isim, String alan, int maas) {

        this.isim = isim;
        this.alan = alan;
        this.maas = maas;
    }
    public void bilgiler(){
        System.out.println("Bilgiler yazdırılıyor...");

        System.out.println("İsim: " + this.isim);
        System.out.println("İş alanı: " + this.alan);
        System.out.println("Maas: " + this.maas);

    }
}
