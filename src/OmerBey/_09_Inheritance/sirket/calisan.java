package OmerBey._09_Inheritance.sirket;

public class calisan {

    private String isim;
    private String departman;
    private int maas;

    public calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }

    public int zam(){

        return maas+= 500;
    }

    public void Bilgilerim() {
        System.out.println("Sistem yükleniyor...");
        System.out.println("İsim: " + this.isim);
        System.out.println("Departman: " + this.departman);
        System.out.println("Maaş: " + this.maas);
    }




}
