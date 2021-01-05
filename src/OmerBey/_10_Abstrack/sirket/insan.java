package OmerBey._10_Abstrack.sirket;

public abstract class insan {

    private String isim,soyisim;

    public insan(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }

    public abstract void calis();

    public void bilgilendirme(){

        System.out.println("İsim: " + this.isim);
        System.out.println("Soyisim: " + this.soyisim);
    }

    public void isimDegistir(String yeniIsim, String yeniSoyisim) {
        this.isim = yeniIsim;
        this.soyisim = yeniSoyisim;

        System.out.println("İsim: " + this.isim);
        System.out.println("Soyisim: " + this.soyisim);
    }

}