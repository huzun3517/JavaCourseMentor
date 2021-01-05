package AhmetT._07_Classlar.g_KutuphaneProjesi;

public class MainKitap {


    public static void main(String[] args) {
        Uye uye1 = Uye.uyeOlustur("Ali");
        Uye uye2 = Uye.uyeOlustur("Veli");
        Uye uye3 = Uye.uyeOlustur("Hasan");

        Kutuphane kutup1 = Kutuphane.kutuphaneOlustur("Topkapi", 4);

        Kitap kitap1 = Kitap.kitapOlustur("Mobidik", 1934);
        Kitap kitap2 = Kitap.kitapOlustur("Denizler Altinda 20000 Fersat", 1970, false);
        Kitap kitap3 = Kitap.kitapOlustur("Nasrettin Hoca", 1980);

        kutup1.uyeEkle(uye1, uye2, uye3);
        kutup1.kitapEkle(kitap1, kitap2, kitap3);
        kutup1.listeUyeler();
        System.out.println();
        kutup1.listeKitaplar();

        //System.out.println(kutup1.name);



    }

}
