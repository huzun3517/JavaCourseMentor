package OmerBey._07_Enum.KahveDukkani;

public enum bakiye {

    MUSTERI1(10);

    private double bakiyem;


    bakiye(double bakiyem) {

        this.bakiyem = bakiyem;
    }

    public double getBakiyem(){
        return this.bakiyem;
    }
}
