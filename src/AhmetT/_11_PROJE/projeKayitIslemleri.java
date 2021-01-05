package AhmetT._11_PROJE;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class projeKayitIslemleri {

    public static void main(String[] args) {

        TreeSet<String> dersler = new TreeSet<>();

        //Örnek: str: " meRhaBA   "  -->  return : "Merhaba"
        System.out.println(kelimeDuzenle("meRhaBA"));

        //Örnek: str : "  hasaN aLi     demir   "  -->  return : "Hasan Ali DEMIR"
        System.out.println(isimDuzenle("  hasaN aLi     demir   "));

        //Örnek: str : "     türK    diLi   "  -->  return : "Türk Dili"
        System.out.println(isimDuzenleDers("     türK    diLi   "));

        System.out.println(numaraVer(10, 100)); // Örnek: numaraVer(10, 100);  -->  67

        System.out.println(kullanicidanVeriAl("ekranYazisi")); // Scanner ile giriş yaptık.

        dersEkle(dersler, "türk dili");

        listeDersler(dersler);

        dersEkleForm(dersler);
        dersEkleForm(dersler);

        listeDersler(dersler);

        dersSil(dersler, kullanicidanVeriAl("Silinecek ders adı: "));

        listeDersler(dersler);

        System.out.println("************************************");

        dersGuncelle(dersler, kullanicidanVeriAl("Eski ders adı: "), kullanicidanVeriAl("Yeni ders adı: "));

        listeDersler(dersler);

        //    Örnek: "123a"  -->  false,     "1002"  --> True
        System.out.println(girdiSayiMi("123a"));


    }

    public static String kelimeDuzenle(String str) {
        //TODO METHOD 1 -
        // gelen str degiskenini trim edip ilk harfini büyük diger harflerini kücük yapacak ve return edecek.
        // Örnek: str: " meRhaBA   "  -->  return : "Merhaba"

        str = str.trim();
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    public static String isimDuzenle(String str) {
        //TODO METHOD 2 -
        // gelen stryi .trim() edecek, .replaceAll("[ ]+", " "); ile kelimeler arasinda birden fazla bosluk varsa fazla boşlukları bir bosluga dönüstürecek,
        // .split(" "); ile String[] arraye atacak, cümlenin son kelimesinin tüm harfleri büyük
        // öncekileri kelimeDuzenle() methodu'nu kullanarak düzenleyip, önde ve sonda bosluk olmadan return edecek.
        // Örnek: str : "  hasaN aLi     demir   "  -->  return : "Hasan Ali DEMIR"

        String[] arrStr = str.trim().replaceAll("[ ]+", " ").split(" ");

        String[] arrStr2 = new String[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
            arrStr2[i] = kelimeDuzenle(arrStr[i]);
        }

        arrStr2[arrStr2.length - 1] = arrStr2[arrStr2.length - 1].toUpperCase();

        String str2 = "";

        for (String str3 : arrStr2) {
            str2 += str3 + " ";
        }

        return str2.trim();

    }


    public static String isimDuzenleDers(String str) {
        // TODO Method-3
        //  public static String isimDuzenleDers(String str)
        //  Açıklaması: Method -2 ile benzer sadece tüm kelimeler kelimeDuzenle() methodu'nu kullanarak düzenlenecek.
        //   Örnek: str : "     türK    diLi   "  -->  return : "Türk Dili"


        String[] arrStr = str.trim().replaceAll("[ ]+", " ").split(" ");

        String[] arrStr2 = new String[arrStr.length];

        String str2 = "";

        for (int i = 0; i < arrStr.length; i++) {
            arrStr2[i] = kelimeDuzenle(arrStr[i]);

            str2 += arrStr2[i] + " ";
        }
        return str2.trim();
    }

    public static int numaraVer(int min, int max) {
        // TODO Method-4
        //  public static int numaraVer(int min, int max)
        //   Açıklaması: aldigi min ve max değerleri arasında random sayi üretip return edecek
        //   Örnek: numaraVer(10, 100);  -->  67


        int randomnum = (int) (Math.random() * (max - min) + 1) + min;
        return randomnum;

    }

    public static String kullanicidanVeriAl(String ekranYazisi) {
        //TODO Method-5
        // public static String kullanicidanVeriAl(String ekranYazisi)
        //  Açıklaması: Scanner kullanarak kullanicidan bir kelime ya da cümle alacak.
        //  Örnek: nextLine(); kullanınız


        Scanner scanner = new Scanner(System.in);
        System.out.println(ekranYazisi + " : ");
        return scanner.nextLine();
    }

    public static void dersEkle(TreeSet<String> dersler, String eklenecekDers) {
        // TODO Method-6
        //  public static void dersEkle(TreeSet<String> dersler, String eklenecekDers)
        //  Açıklaması: gelen eklenecekDers degiskenini kullanarak main de oluşturulacak TreeSet'e ekleyen method


        dersler.add(kelimeDuzenle(eklenecekDers));


    }

    public static void listeDersler(TreeSet<String> dersler) {
        // TODO Method-7
        //  public static void listeDersler(TreeSet<String> dersler)
        //  Açıklaması: gelen TreeSet'deki tüm verileri ekrana yazdıran method


        for (String ders : dersler) {
            System.out.println(ders);
        }
    }

    public static void dersEkleForm(TreeSet<String> dersler) {
        // TODO Method-8
        //  public static void dersEkleForm(TreeSet<String> dersler)
        //  Açıklaması: bu method icinde dersEkle cagrilacak ve kullanicidan kullanicidanVeriAl() methodu ile
        //  ders adi alinacak isimDuzenleDers() ile düzenlenen isim dersEkle() methodu ile TreeSet e eklenecek

        System.out.print("Mevcut ders listesi : ");
        listeDersler(dersler);
        String yeniders = kullanicidanVeriAl("Eklenecek dersin adını giriniz: ");

        dersEkle(dersler, isimDuzenle(yeniders));

    }

    public static boolean dersSil(TreeSet<String> dersler, String silinecekDers) {
        // TODO Method-9
        //  public static boolean dersSil(TreeSet<String> dersler, String silinecekDers)
        //  Açıklaması: silinecekDers adindaki dersi gelen TreeSetden silen method

        return dersler.remove(silinecekDers);

    }

    public static boolean dersGuncelle(TreeSet<String> dersler, String eskiDersAdi, String yeniDersAdi) {
        // TODO Method-10
        //  public static boolean dersGuncelle(TreeSet<String> dersler, String eskiDersAdi, String yeniDersAdi)
        //  Açıklaması: TreeSet içerisinde bulacağı eskiDersAdi adli dersi yeniDersAdi adına çeviren method

        if (dersler.contains(eskiDersAdi)) {
            dersler.remove(eskiDersAdi);
        }
        return dersler.add(yeniDersAdi);
    }

    public static boolean girdiSayiMi(String str) {
        // TODO Method-11
        //  public static boolean girdiSayiMi(String str)
        //  Açıklaması: aldigi stringin sayi olup olmadigini döndüren method yaziniz
        //  Örnek: "123a"  -->  false,     "1002"  --> True

        String sayiMi = str.replaceAll("[0-9]", "");
        if (sayiMi.length() == 0)
            return true;
        else
            return false;

            /*
            public static boolean girdiSayiMi(String str){
        char[] ch=str.toCharArray();
        boolean sayimi=true;
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]<48 || ch[i]>57)  sayimi=false;
        }
        return sayimi;
        }

             */
    }

    public static void dersGuncelleForm(TreeSet<String> dersler) {
        // TODO Method-12
        //  Method-12 public static void dersGuncelleForm(TreeSet<String> dersler)
        //  Açıklama: Kullanicidan guncellenecekDers ders adini ve yeni adnini alip
        //  dersGuncelle() methoduna göndererek guncelleyen method

        String strEski = kullanicidanVeriAl("Ders adı: ");
        String strYeni = kullanicidanVeriAl("Yeni ders adı: ");
        dersGuncelle(dersler, strEski, strYeni);
    }

    public static void listeDerslerArama(TreeSet<String> dersler) {
        // TODO Method-13
        //  public static void listeDerslerArama(TreeSet<String> dersler)
        //  Açıklama: Kayit edilen derslerden arananKelime icerenlerin listesini ekrana yazdiran method

        String str = kullanicidanVeriAl("Aranan kelime: ");

        if (dersler.contains(str)) {
            System.out.println(dersler);
        }
    }

    public static void listeleOgrenciForm(TreeMap<Integer, String> ogrenciler) {
        //TODO Method-14
        // public static void listeleOgrenciForm(TreeMap<Integer, String> ogrenciler)
        // Açıklama: Bu method ogrenciler TreeMap'ini alacak ve aranan kelime'nin numara olup olmadigini
        // girdiSayimi() ile kotrol edip eger sayi ise ögrenciyi numarasi ile,
        // eger sayi degilse aranan kelime isim de varsa isme göre arama bos girilmis ise tüm listeyi yazdiriniz.
        // Bu islemler overload methodlar ile yapilacaktir. Farkli degiskenli ayni isimli 3 method




    }

    public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler) {
        // TODO Method-15
        //  public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler)
        //  Açıklama: Kayit edilen tüm ögrencilerin listesini ekrana yazdiran method


    }

    public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler, String arananKelime){
    // TODO Method-16
    //  public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler, String arananKelime)
    //  Açıklama: (overload) Kayit edilen ögrencilerden adi soyadi icinde arananKelime icerenlerin listesini
    //  ekrana yazdiran method



    }
    public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler, int arananNo) {
        //TODO Method-17
        // public static void listeleOgrenci(TreeMap<Integer, String> ogrenciler, int arananNo)
        // Açıklama: (overload) Kayit edilen ögrencilerden numarasina göre arama yapan yapan ve ekrana yazdiran method


    }

    public static int yeniOgrenciNosuAl(TreeMap<Integer, String> ogrenciler) {
        //TODO Method-18
        // public static int yeniOgrenciNosuAl(TreeMap<Integer, String> ogrenciler)
        // Açıklama: yeni kayıt olacak öğrenci için verilen aralıkta ancak önceden verilmemiş random sayı üreten method


    return 0;
    }

    public static void ogrenciEkle(TreeMap<Integer, String> ogrenciler) {
        //TODO Method-19
        // public static void ogrenciEkle(TreeMap<Integer, String> ogrenciler)
        // Açıklamas: Kullanicidan yeni kaydı yapılacak öğrenci adı alınacak
        // yeniOgrenciNosuAl() ile alınan numara ile öğrenci kaydı yapılacak
        // ve kaydedilen öğrenci listeleOgrenci() ile ekrana yazdırılacak


    }
    public static void ogrenciGuncelleForm(TreeMap<Integer, String> ogrenciler) {
        //TODO Method-20
        // public static void ogrenciGuncelleForm(TreeMap<Integer, String> ogrenciler)
        // Açıklama: Kullanicidan adı guncellenecek ogrenci Nosunu alacak
        // ve yeni ismini alip ogrenciGuncelle() methoduna göndererek guncel



    }
    public static void ogrenciGuncelle(TreeMap<Integer, String> ogrenciler, Integer ogrenciNo, String yeniOgrenciAdi) {
        //TODO Method-21
        // public static void ogrenciGuncelle(TreeMap<Integer, String> ogrenciler, Integer ogrenciNo, String yeniOgrenciAdi)
        // Açıklama: ogrenciNo su verilen ögrencinin ismini güncelleyen method method



    }
    public static void ogrenciSilForm(TreeMap<Integer, String> ogrenciler) {
        //TODO Method-22
        // public static void ogrenciSilForm(TreeMap<Integer, String> ogrenciler)
        // Açıklama: Kullanicidan silinecek öğrenci numarasını alıp silen method,
        // numara  kullanicidanVeriAl() methodu cagrilarak alinmali
        // ve sayı olup olmadığı girdiSayiMi() ile kontrol edilmeli



    }
    public static boolean menuGirisKontrol(String str, String[] menuSecimListesi) {
        //TODO Method-23
        // public static boolean menuGirisKontrol(String str, String[] menuSecimListesi)
        // Açıklama: gelen str ifadesinin menuSecimListesi arrayi icinde olup olmadigini kontrol eden
        // ve sonucu boolean (true ya da false)


        return true;
    }
}