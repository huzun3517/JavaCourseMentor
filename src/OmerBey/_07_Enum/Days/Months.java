package OmerBey._07_Enum.Days;

public enum Months {


    OCAK(1),
    SUBAT(2),
    MART(3),
    NISAN(4),
    MAYIS(5),
    HAZIRAN(6),
    TEMMUZ(7),
    AGUSTOS(8),
    EYLUL(9),
    EKIM(10),
    KASIM(11),
    ARALIK(12);

    private int months;

    Months(int months){
        this.months = months;
    }

    public int getMonths(){

        return this.months;
    }
}
