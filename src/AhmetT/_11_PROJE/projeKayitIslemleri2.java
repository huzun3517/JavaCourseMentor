package AhmetT._11_PROJE;

import java.util.*;

public class projeKayitIslemleri2 {


    public static void main(String[] args) {
        TreeSet<String> dersler = fillData.fillDersler();   // new TreeSet<>();
        TreeMap<Integer, String> ogrenciler = fillData.fillOgrenciler(); // new TreeMap<>();
        HashMap<Integer, HashMap<String, Integer>> dersNotlari = fillData.fillDersNotlari();    // new HashMap<>();

        anaMenu(dersNotlari, ogrenciler, dersler);

    }

    public static String kelimeDuzenle(String str) {

        str = str.trim();

        String duzenliKelime = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return duzenliKelime;

    }

    public static String isimDuzenle(String str) {

        str = str.trim();

//        while (str != str.replace("  ", " ") )
//            str = str.replace("  ", " ");
//       String [] name=str.split(" ");


        String[] name = str.trim().replaceAll("[ ]+", " ").split(" ");

        for (int i = 0; i < name.length; i++) {
            name[i] = kelimeDuzenle(name[i]);
        }


        name[name.length - 1] = name[name.length - 1].toUpperCase();

        String duzenlisim = "";
        for (int i = 0; i < name.length; i++) {

            duzenlisim = duzenlisim + " " + name[i];
        }
        duzenlisim = duzenlisim.trim();
        return duzenlisim;

    }

    public static String isimDuzenleDers(String str) {

        String[] dersduzenli = isimDuzenle(str).split(" ");

        dersduzenli[dersduzenli.length - 1] = dersduzenli[dersduzenli.length - 1].toLowerCase();
        dersduzenli[dersduzenli.length - 1] = dersduzenli[dersduzenli.length - 1].substring(0, 1).toUpperCase()
                + dersduzenli[dersduzenli.length - 1].substring(1);

        String dersduzenliisim = "";

        for (int i = 0; i < dersduzenli.length; i++) {

            dersduzenliisim = dersduzenliisim + " " + dersduzenli[i];
        }
        dersduzenliisim = dersduzenliisim.trim();

        return dersduzenliisim;
    }


    public static int numaraVer(int min, int max) {

        int randomsayi = (int) (Math.random() * ((max - min) + 1) + min);
        return randomsayi;

    }

    public static String kullanicidanVeriAl(String ekranYazisi) {

        Scanner scr = new Scanner(System.in);
        System.out.print(ekranYazisi);
        String veri = scr.nextLine();

        return isimDuzenleDers(veri);

    }

    public static void dersEkle(TreeSet<String> dersler, String eklenecekDers) {
        dersler.add(eklenecekDers);

    }

    public static void listeDersler(TreeSet<String> dersler) {

        System.out.println(dersler);

    }

    public static void dersEkleForm(TreeSet<String> dersler) {

        dersEkle(dersler, isimDuzenleDers(kullanicidanVeriAl("ders giriniz:")));

    }

    public static boolean dersSil(TreeSet<String> dersler, String silinecekDers) {

        int count = 0;

        for (String n : dersler) {
            if (n.equals(isimDuzenleDers(silinecekDers))) {
                dersler.remove(n);
                count++;
            }
        }

        if (count == 0)
            return true;
        else
            return false;

    }

    public static boolean dersGuncelle(TreeSet<String> dersler, String eskiDersAdi, String yeniDersAdi) {

        int count = 0;
        for (String n : dersler) {
            if (n.equals(isimDuzenleDers(eskiDersAdi))) {
                dersler.remove(n);
                dersler.remove(yeniDersAdi);
                count++;
            }
        }
        if (count == 0)
            return true;
        else
            return false;


    }

    public static boolean girdiSayiMi(String str) {

        str = str.trim();
        str = str.replaceAll("[0-9]", "");
        if (str.isEmpty())
            return true;
        else
            return false;

    }

    public static void dersGuncelleForm(TreeSet<String> dersler) {

        Scanner scr = new Scanner(System.in);
        System.out.println("guncellencek ders adini giriniz=");
        String eksidersadi = scr.nextLine();
        eksidersadi = isimDuzenleDers(eksidersadi);

        System.out.println("guncel ders adini giriniz=");
        String yenidersadi = scr.nextLine();
        yenidersadi = isimDuzenleDers(yenidersadi);

        dersGuncelle(dersler, eksidersadi, yenidersadi);

    }

    public static void listeDerslerArama(TreeSet<String> dersler) {

        Scanner scr = new Scanner(System.in);
        System.out.println("aranacak kelimeyi giriniz=");
        String aranacak = scr.nextLine();
        aranacak = isimDuzenleDers(aranacak);

        TreeSet<String> arananakelimeliste = new TreeSet<>();

        for (String n : dersler) {


            if (n.contains(aranacak))

                arananakelimeliste.add(n);
        }

        System.out.println("arananakelimeliste = " + arananakelimeliste);

    }

    public static void listeleOgrenciForm(TreeMap<Integer, String> ogrenciler) {

        Scanner scr = new Scanner(System.in);
        System.out.println("ogrenci aramak icin ogrenci no veya isiim giriniz=");
        String aranacak = scr.nextLine();

        if (girdiSayiMi(aranacak)) {
            int no = Integer.parseInt(aranacak);
            listeleOgrenci(ogrenciler, no);
        } else if (!girdiSayiMi(aranacak)) {
            listeleOgrenci(ogrenciler, aranacak);
        } else
            listeleOgrenci(ogrenciler);

    }

    public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler) {

        for (Map.Entry<Integer, String> n : ogrenciler.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());
        }

    }

    public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler, String arananKelime) {
        arananKelime = isimDuzenle(arananKelime);

        for (Map.Entry<Integer, String> n : ogrenciler.entrySet()) {
            if (n.getValue().contains(arananKelime))
                System.out.println(n.getKey() + " " + n.getValue());
        }

    }

    public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler, int arananNo) {
        for (Map.Entry<Integer, String> n : ogrenciler.entrySet()) {
            if (n.getKey() == arananNo)
                System.out.println(n.getKey() + " " + n.getValue());
        }
    }

    public static int yeniOgrenciNosuAl(TreeMap<Integer, String> ogrenciler) {
        int yenino = 0;
        boolean control = false;
        int count = 0;

        do {

            int max = 1000;
            int min = 0;
            int randomno = numaraVer(min, max);

            for (Map.Entry<Integer, String> n : ogrenciler.entrySet()) {

                if (n.getKey() == randomno) {
                    count++;
                }

            }

            if (count == 0) {
                yenino = randomno;
                break;
            } else
                control = true;

        } while (control);

        return yenino;

    }
//        do{
//            int max = 1000;
//            int min = 0;
//            int randomno = numaraVer(min, max);
//            yenino=randomno;
//        }while(!ogrenciler.containsKey(yenino))
//

//        public static int yeniOgrenciNosuAl(TreeMap<Integer, String> ogrenciler){
//            int yeniNo = numaraVer(1000, 9000);
//            if (ogrenciler.containsKey(yeniNo))
//                return yeniOgrenciNosuAl(ogrenciler);
//            else
//                return yeniNo;
//        }


    public static void ogrenciEkle(TreeMap<Integer, String> ogrenciler) {

        Scanner scr = new Scanner(System.in);
        System.out.println("yeni ogrenci ismi giriniz=");
        String yeniogrrenciisim = scr.nextLine();

        yeniogrrenciisim = isimDuzenle(yeniogrrenciisim);

        int yeniogrencino = yeniOgrenciNosuAl(ogrenciler);

        ogrenciler.put(yeniogrencino, yeniogrrenciisim);

        listeleOgrenci(ogrenciler, yeniogrencino);

    }

    public static void ogrenciGuncelleForm(TreeMap<Integer, String> ogrenciler) {

        Scanner scr = new Scanner(System.in);
        System.out.println("guncellenecek ogrenci no giriniz=");
        Integer aranacakno = scr.nextInt();

        System.out.println("yeni ogrenci ismi giriniz=");
        String yeniogrrenciisim = scr.nextLine();

        ogrenciGuncelle(ogrenciler, aranacakno, yeniogrrenciisim);

        //
    }

    public static void ogrenciGuncelle(TreeMap<Integer, String> ogrenciler, Integer ogrenciNo, String yeniOgrenciAdi) {

        if (ogrenciler.containsKey(ogrenciNo))
            ogrenciler.put(ogrenciNo, yeniOgrenciAdi);
        else
            System.out.println("boyle bir ogrenci bulunamadi");

    }

    public static void ogrenciSilForm(TreeMap<Integer, String> ogrenciler) {

        String silincekogrencino = kullanicidanVeriAl("silinecek ogrenci no giriniz");

        if (girdiSayiMi(silincekogrencino))

            ogrenciler.remove(Integer.parseInt(silincekogrencino));
        else
            kullanicidanVeriAl("yanlis giris yaptiniz tekrar silinecek ogrenci no giriniz");

    }

    public static boolean menuGirisKontrol(String str, String[] menuSecimListesi) {

        ArrayList<String> menu = new ArrayList<>(Arrays.asList(menuSecimListesi));

        return menu.contains(str);
    }

    public static void anaMenu(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {
        System.out.println();
        String menuSecim = "";
        do {
            System.out.println("___ ANA MENÜ ___");
            System.out.println("1 - Ders Islemleri");
            System.out.println("2 - Ogrenci Islemleri");
            System.out.println("3 - Not Islemleri");
            System.out.println("4 - Raporlar");
            System.out.println("0 - Çıkış");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz:");
            if (!menuGirisKontrol(menuSecim, "12340".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim) {
                case "1":
                    System.out.println();
                    menuDersIslem(dersler);
                    break;
                case "2":
                    System.out.println();
                    menuOgrenciIslem(ogrenciler);
                    break;
                case "3":
                    System.out.println();
                    menuNotIslem(dersNotlari, ogrenciler, dersler);
                    break;

                case "4":
                    System.out.println();
                    menuRaporIslem(dersNotlari, ogrenciler, dersler);
                    break;


            }
        } while (!menuSecim.equals("0"));
        System.out.println();
        System.out.println("Program Sonlandiriliyor.......");
    }


    public static void menuDersIslem( TreeSet<String> dersler) {
        String menuSecim = "";
        do {
            System.out.println("___ DERS ISLEM MENUSU ___");
            System.out.println("1 - Ders Ekleme");
            System.out.println("2 - Ders Düzeltme");
            System.out.println("3 - Ders Silme");
            System.out.println("4 - Ders Liste");
            System.out.println("0 - Ana Menü");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim) {
                case "1":
                    System.out.println("DERS ISLEM MENUSU --> Ders Ekleme");
                    dersEkleForm(dersler);
                    System.out.println();

                    break;
                case "2":
                    System.out.println("DERS ISLEM MENUSU --> Ders Düzeltme");
                    dersGuncelleForm(dersler);
                    System.out.println();

                    break;
                case "3":
                    System.out.println("DERS ISLEM MENUSU --> Ders Silme");
                    dersSil(dersler,kullanicidanVeriAl("Silinecek dersin adini giriniz"));
                    System.out.println();
                    break;

                case "4":
                    System.out.println("DERS ISLEM MENUSU --> Ders Liste");
                    listeDersler(dersler);
                    System.out.println();
                    break;


            }
        } while (!menuSecim.equals("0"));
        System.out.println();
    }


    public static void menuOgrenciIslem(TreeMap<Integer, String> ogrenciler) {
        String menuSecim = "";
        do {
            System.out.println("___ ÖGRENCI ISLEMLERI ___");
            System.out.println("1 - Ögrenci Ekleme");
            System.out.println("2 - Ögrenci Düzeltme");
            System.out.println("3 - Ögrenci Silme");
            System.out.println("4 - Ögrenci Liste");
            System.out.println("0 - Ana Menü");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim) {
                case "1":
                    System.out.println("ÖGRENCI ISLEMLERI --> Ögrenci Ekleme");
                    ogrenciEkle(ogrenciler);
                    System.out.println();
                    break;
                case "2":
                    System.out.println("ÖGRENCI ISLEMLERI --> Ögrenci Düzeltme");
                    ogrenciGuncelleForm(ogrenciler);
                    System.out.println();
                    break;
                case "3":
                    System.out.println("ÖGRENCI ISLEMLERI --> Ögrenci Silme");
                    ogrenciSilForm(ogrenciler);
                    System.out.println();
                    break;
                case "4":
                    System.out.println("ÖGRENCI ISLEMLERI --> Ögrenci Liste");
                    listeleOgrenciForm(ogrenciler);
                    System.out.println();
                    break;

            }
        } while (!menuSecim.equals("0"));
        System.out.println();
    }


    public static void menuNotIslem(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {
        String menuSecim = "";
        do {
            System.out.println("___ NOT ISLEMLERI ___");
            System.out.println("1 - Ders Notu Girisi");
            System.out.println("2 - Ders Not Düzeltme");

            System.out.println("0- Ana Menü");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim) {
                case "1":
                    System.out.println("NOT ISLEMLERI --> Ders Notu Girisi");
                    dersNotuGirisi(dersNotlari, ogrenciler, dersler);
                    System.out.println();
                    break;
                case "2":
                    System.out.println("NOT ISLEMLERI --> Ders Not Düzeltme");
                    dersNotuGirisi(dersNotlari, ogrenciler, dersler);
                    System.out.println();
                    break;

            }
        } while (!menuSecim.equals("0"));

        System.out.println();
    }


    public static void menuRaporIslem(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {
        String menuSecim = "";
        do {
            System.out.println("___ RAPOR ISLEMLERI ___");
            System.out.println("1 -  Bir Öğrenci Not Listesi");
            System.out.println("2 -  Ders Ortalamaları");
            System.out.println("3 -  Öğrenci Ortalamaları");
            System.out.println("4 -  Öğrenci Başarı Durumu");
            System.out.println("5 -  Öğrencilerin Genel Not Dökümü");
            System.out.println("0- Ana Menü");

            menuSecim = kullanicidanVeriAl("Seciminizi Yapiniz");
            if (!menuGirisKontrol(menuSecim, "1230".split("")))
                System.out.println("Menüden Secim Yapiniz...");
            switch (menuSecim) {
                case "1":
                    System.out.println("RAPOR ISLEMLERI --> Bir Öğrenci Not Listesi");
                    ogrenciDersNotlari(dersNotlari,ogrenciler,dersler);
                    System.out.println();
                    break;
                case "2":
                    System.out.println("RAPOR ISLEMLERI --> Ders Ortalamaları");
                    dersOrtalamalari(dersNotlari,ogrenciler,dersler);
                    System.out.println();
                    break;
                case "3":
                    System.out.println("RAPOR ISLEMLERI --> Öğrenci Ortalamaları");
                    ogrenciNotOrtalamalari(dersNotlari,ogrenciler,dersler);
                    System.out.println();
                    break;

                case "4":
                    System.out.println("RAPOR ISLEMLERI--> Öğrenci Başarı Durumu");
                    ogrenciBasariDurumu(dersNotlari,ogrenciler,dersler);
                    System.out.println();
                    break;

                case "5":
                    System.out.println("RAPOR ISLEMLERI --> Öğrencilerin Genel Not Dökümü");
                    ogrencilerinNotDokumu(dersNotlari, ogrenciler, dersler);
                    System.out.println();
                    break;

            }
        } while (!menuSecim.equals("0"));

        System.out.println();
    }


    public static void ogrenciDersNotlari(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {

        String ogrno = kullanicidanVeriAl("Notlarini listelmek istediginiz ogrencinin numarasini giriniz ");

        if (girdiSayiMi(ogrno)) {
            for (Map.Entry<String, Integer> n : dersNotlari.get(ogrno).entrySet())
                System.out.println(ogrno + "nolu ogrencinin " + n.getKey() + " notu: " + n.getValue());

        } else
        { System.out.println("yanlis ogrenci no girisi yaptiniz");}
        menuRaporIslem(dersNotlari,ogrenciler, dersler);
    }


    public static double dersOrtalamasi(HashMap<Integer, HashMap<String, Integer>> dersNotlari, String ders) {

        int toplam = 0;
        int count = 0;


        for (Integer ogrno : dersNotlari.keySet()) {
            for (Map.Entry<String, Integer> m : dersNotlari.get(ogrno).entrySet()) {


                if (m.getKey().equals(ders)) {
                    toplam += m.getValue();
                    count++;
                }
            }

        }

        return toplam / count;
    }


    public static void dersOrtalamalari(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {

        HashMap<String, Double> dersort = new HashMap<>();

        for (Map.Entry<Integer, HashMap<String, Integer>> n : dersNotlari.entrySet()) {

            for (Map.Entry<String, Integer> m : n.getValue().entrySet()) {
                dersort.put(m.getKey(), dersOrtalamasi(dersNotlari, m.getKey()));


            }
        }

        for (Map.Entry<String, Double> n : dersort.entrySet())
        {  System.out.println(n.getKey() + " dersi ortalamasi: " + n.getValue());}

        menuRaporIslem(dersNotlari,ogrenciler,dersler);
    }

    public static double ogrenciNotOrtalamasi(HashMap<Integer, HashMap<String, Integer>> dersNotlari, int ogrenciNo) {


        int toplam = 0;
        int count = 0;

        for (Map.Entry<Integer, HashMap<String, Integer>> n : dersNotlari.entrySet()) {
            if (n.getKey() == ogrenciNo)
                for (Map.Entry<String, Integer> m : n.getValue().entrySet()) {

                    toplam += m.getValue();
                    count++;
                }
        }

        return toplam / count;
    }


    public static void ogrenciNotOrtalamalari(HashMap<Integer, HashMap<String, Integer>> dersNotlari,TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {
        int i = 0;
        System.out.println("SN\tNo\t\tNot Ortalamasi");
        for (Integer ogrNo : dersNotlari.keySet())
        { System.out.printf("%d.\t%d\t\t%.2f%n", ++i, ogrNo, ogrenciNotOrtalamasi(dersNotlari, ogrNo));}

        menuRaporIslem(dersNotlari,ogrenciler,dersler);
    }


    public static int ogrenciZayifSayisi(HashMap<Integer, HashMap<String, Integer>> dersNotlari, int ogrenciNo) {


        int count = 0;
        for (Map.Entry<Integer, HashMap<String, Integer>> n : dersNotlari.entrySet()) {

            HashMap<String, Integer> dersnot = new HashMap<>(n.getValue());

            for (Map.Entry<String, Integer> dersnotlari : dersnot.entrySet()) {
                if (n.getKey().equals(ogrenciNo)) {

                    if (dersnotlari.getValue() < 45)
                        count++;
                }
            }
        }
        return count;
    }

    public static void ogrenciBasariDurumu(HashMap<Integer, HashMap<String, Integer>> dersNotlari,TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {
        for (Integer ogrNo : dersNotlari.keySet()) {
            System.out.println("OKul no: " + ogrNo + "\tZayif Sayisi:" + ogrenciZayifSayisi(dersNotlari, ogrNo) + "\tNotOrtalaması:" + ogrenciNotOrtalamasi(dersNotlari, ogrNo));
            System.out.println();
        }
        menuRaporIslem(dersNotlari,ogrenciler,dersler);
    }

    public static void ogrencilerinNotDokumu(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {


        for (Map.Entry<Integer, String> n : ogrenciler.entrySet()) {

            System.out.println(n.getKey() + "nolu" + n.getValue() + "notlari");

            for (String ders : dersler) {

                for (Map.Entry<Integer, HashMap<String, Integer>> m : dersNotlari.entrySet()) {
                    if ((int) m.getKey() == (int) n.getKey()) {
                        HashMap<String, Integer> k = new HashMap<>(m.getValue());
                        for (Map.Entry<String, Integer> x : k.entrySet()) {
                            System.out.print(x.getKey() + " : " + x.getValue() + ", ");
                        }

                        System.out.println(" ");
                    }
                }
                break;
            }
        }
        menuRaporIslem(dersNotlari,ogrenciler,dersler);

    }
    public static void dersNotuGirisi(HashMap<Integer, HashMap<String, Integer>> dersNotlari, TreeMap<Integer, String> ogrenciler, TreeSet<String> dersler) {
        int arananNo = 0;
        String arananKelime = kullanicidanVeriAl("Notu Girilecek veya Düzeltilecek Ögrencinin Numarasini Giriniz");
        if (arananKelime.equals("")) {
            listeleOgrenci(ogrenciler);
            System.out.println("Lütfen Listeden Bir Secim Yapiniz ");
            dersNotuGirisi(dersNotlari, ogrenciler, dersler);
        } else if (girdiSayiMi(arananKelime)) {
            arananNo = Integer.parseInt(arananKelime);
            listeleOgrenci(ogrenciler, arananNo);
        }
        System.out.println("Mevcut Derslerin Listesi Asagidadir:");
        listeDersler(dersler);
        String notuGirilecekDers = kullanicidanVeriAl(" Notlarini Girmek/Düzeltmek Istediginiz Dersin Adini Yukaridaki Listeden Secerek Giriniz");
        for (Map.Entry<Integer, HashMap<String, Integer>> mp1 : dersNotlari.entrySet()) {
            if ((int) mp1.getKey() == arananNo) {
                for (Map.Entry<String, Integer> notgiris : mp1.getValue().entrySet()) {
                    String not = kullanicidanVeriAl(notgiris.getKey() + " Dersine Ait Notu Giriniz: ");
                    if (girdiSayiMi(not)) notgiris.setValue(Integer.parseInt(not));
                    else System.out.println("Bu Ders Icin Gecerli Bir Sayi Girmediniz");
                }
            }
        }menuRaporIslem(dersNotlari,ogrenciler,dersler);
    }
    public static class fillData {

        public static TreeSet<String> fillDersler(){
            TreeSet<String> dersler = new TreeSet<>();
            dersler.add("Mat");
            dersler.add("Fiz");
            dersler.add("Kim");
            dersler.add("Biy");
            dersler.add("Tar");
            dersler.add("Cog");
            return dersler;
        }


        public static TreeMap<Integer, String> fillOgrenciler(){
            TreeMap<Integer, String> ogrenciler = new TreeMap<>();
            ogrenciler.put(100, "Ali DEMIR");
            ogrenciler.put(101, "Hasan CELIK");
            ogrenciler.put(102, "Hüseyin GÜMÜS");

            return ogrenciler;
        }

        public static HashMap<Integer, HashMap<String, Integer>> fillDersNotlari(){

            HashMap<Integer, HashMap<String, Integer>> dersNotlari = new HashMap<>();
            HashMap<String, Integer> notlar1 = new HashMap<>()
            {
                {
                    put("Mat", 60);put("Fiz", 60);put("Kim", 60);put("Tar", 60);
                }
            };

            HashMap<String, Integer> notlar2 = new HashMap<>() {
                {
                    put("Mat", 60);put("Biy", 67);put("Kim", 36);put("Tar", 25);
                }
            };

            HashMap<String, Integer> notlar3 = new HashMap<>() {
                {
                    put("Mat", 60);put("Fiz", 97);put("Kim", 76);put("Tar", 43);
                }
            };

            dersNotlari.put(100, notlar1);
            dersNotlari.put(101, notlar2);
            dersNotlari.put(102, notlar3);

            return dersNotlari;
        }
    }


}







