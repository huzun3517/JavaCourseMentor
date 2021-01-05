package OmerBey._10_Abstrack.sirket;

public class calisan extends insan {

    private int calisanId;

    public calisan(String isim, String soyisim, int calisanId) {
        super(isim, soyisim);
        this.calisanId = calisanId;
    }

    @Override
    public void calis() {

        if (calisanId == 0){
            System.out.println("Çalışan değil...");
            System.out.println("id: " + calisanId);

        }

        else {
            System.out.println("Sirkette calisiyor");
            System.out.println("id: " + calisanId);
        }
    }
}
