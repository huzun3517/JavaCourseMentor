package OmerBey._07_Enum.KahveDukkani;

public enum tatlilar {

    CİLEKLİPASTA(4),
    MOZAIKPASTA(3.5),
    MUZLUPASTA(4.5);

    private double tatlifiyati;


    tatlilar(double tatlifiyati) {

        this.tatlifiyati = tatlifiyati;
    }

    public double getTatlifiyati(){
        return this.tatlifiyati;
    }

}
