package Burak._09_Inheritance.Ornek2;

public class main {
    public static void main(String[] args) {

       dagBisikleti bianca = new dagBisikleti("Beyaz", 2, 32.5, false, 24, true);
        System.out.println("-----------------------------------");
        System.out.println("Dağ bisikletinin bilgileri yazdırılıyor...");
        bianca.bisikletInfo();
        bianca.dagBisikletiInfo();

        elektrikliBisiklet tesla = new elektrikliBisiklet("Siyah", 2, 26, true, 750, true);
        System.out.println("-----------------------------------");
        System.out.println("Elektrikli bisikletin bilgileri yazdırılıyor...");
        tesla.bisikletInfo();
        tesla.eBisikletInfo();
    }
}
