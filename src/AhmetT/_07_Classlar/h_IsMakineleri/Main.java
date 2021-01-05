package AhmetT._07_Classlar.h_IsMakineleri;

public class Main {
    public static void main(String[] args) {
        Personel p1 = Personel.personelKayit("Ali", "E", "Kosar", "Yüzer");
        Personel p2 = Personel.personelKayit("Veli", "B", "Kosar");
        Personel p3 = Personel.personelKayit("Hasan", "E", "Yüzer");

        IsYeri i1 = IsYeri.isyeriTanimla("Fabrika", 3, p1, p2, p3);
        IsMakinesi a1 = IsMakinesi.isMakinesiOlustur("Kamyon", "E", "E2");
        IsMakinesi a2 = IsMakinesi.isMakinesiOlustur("Minivan","B", "C", "E");

        i1.isMakinesiEkle(a1, a2);

        a1.soforEkle(p1, p2, p3);
        a2.soforEkle(p1, p2, p3);

        a1.soforBin(p3);

    }
}
