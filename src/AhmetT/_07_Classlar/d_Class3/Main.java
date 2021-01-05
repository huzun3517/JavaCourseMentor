package AhmetT._07_Classlar.d_Class3;

public class Main {

    public static void main(String[] args) {

/*        Insan hakan = new Insan();
          hakan.name = "Hakan";
          hakan.age = 34;
          hakan.arkadaslar = new HashSet<>();
        // bu sekilde de tanimlanabilir
  */

        Insan ali = Insan.insanOlustur("Ali", 25);
        Insan hakan = Insan.insanOlustur("Hakan", 27);
        Insan veli = Insan.insanOlustur("Veli", 21, ali, hakan);

        System.out.println("Alinin adi : " + ali.name);
        System.out.println("Hakanin arkadas sayisi : " + hakan.arkadaslar.size());
        System.out.println("Velinin arkadas sayisi : " + veli.arkadaslar.size());

        ali.arkadasEkle(hakan, veli);
        System.out.println("Ali Arkadas-----");
        ali.arkadaslarinKimler();
        System.out.println("Veli arkadas-------");
        veli.arkadaslarinKimler();
        System.out.println("Hakan arkadas-------");
        hakan.arkadaslarinKimler();

        ali.arkadasSil(veli);
        System.out.println("Ali arkadas-------");
        ali.arkadaslarinKimler();

        ali.dostum = veli;
        System.out.println(ali.dostum.name);

        veli.dostAta(hakan);
        System.out.println(veli.dostum.name);
        System.out.println(veli.dostunVarMi());

        //System.out.println(ali.dostum.dostum.dostum.arkadaslar.size());
        System.out.println("Veli Alinin arkadasi mi :" + ali.arkadasinMi(veli));
        System.out.println("Hakan Alinin arkadasi mi :" + ali.arkadasinMi(hakan));

        System.out.println("Ali dostunun  adi " + ali.dostunKim().name);
        System.out.println("Ali dostunun  adi " + ali.dostum.name);
        // ali.dostunKim() == ali.dostum

    }
}

