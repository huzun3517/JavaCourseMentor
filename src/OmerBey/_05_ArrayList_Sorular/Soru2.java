package OmerBey._05_ArrayList_Sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru2 {

    /*
String arrayList oluşturun. 5 elemandan oluşturun.

1.   elemanEkle isminde bir method oluşturun
 ve bana String Arraylist döndürsün. Parametre olarak String arraylist.
Scanner kullanarak  5 özel isim girin ve bu isimler bu methodda ArrayListe eklensin. (Hüseyin, Ömer,Nalan vb.)


2.    sil    isminde void bir method çağırın.
 Parametresi String ArrayList olsun.
ArrayListimin içindeki elemanlar "l" (en az bir eleman  "küçük L"  harfine sahip olması koşul için yeterlidir.) harfine sahipse, bütün arrayList temizlensin. (silinsin, boşaltılsın.)

3.    listeBosMu   adında void bir method oluşturun.
ve  parametresi    String  ArrayList olsun.
Listenin boş olup olmadıgını check etsin. Liste boş ise true,  boş değil ise false döndürsün.  (ArrayList methodu kullanın.)
Liste boş ise  listeyi yazdırıp check edin.


Konsoldaki görüntü bunun gibi olmalı(Kendi değerlerinizi girerek deneyin)

1. elemanı giriniz:  ömer
2. elemanı giriniz:  hüseyin
3. elemanı giriniz:  nalan
4. elemanı giriniz:  sevket
5. elemanı giriniz:  osman
[ömer, hüseyin, nalan, sevket, osman]

L harfi bulunanlar : nalan
Liste boşaltılmıştır...

ArrayList boş mu ? =    true
Arraylist'im boştur =   []

 */



    public static void main(String[] args) {

        ArrayList<String>arrayList = new ArrayList<>();

        sil(arrayList);

        listeBosMu(arrayList);

    }

    public static ArrayList<String> elemanEkle(ArrayList<String> arrayList) {

        Scanner scanner = new Scanner(System.in);

        String isim = "";
        for (int i = 0; i < 5 ; i++) {
            System.out.print(i+1 + (".ismi giriniz: "));
            isim = scanner.nextLine();
            arrayList.add(isim);
    }
        return arrayList;
    }

    public static void sil(ArrayList<String>arrayList) {

        elemanEkle(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).contains("l")) {
                arrayList.clear();
                System.out.println("Liste boşaltılmıştır...");
            }
        }
    }

    public static void listeBosMu(ArrayList<String>arrayList) {

        boolean bosdegil = false;

        if (arrayList.isEmpty() == true){
            bosdegil = true;
            System.out.println("ArrayList boş mu ? = " + bosdegil);
            System.out.println("Liste boştur...");
            System.out.println("Arraylist'im boştur = " + arrayList);
        }

        else {
            bosdegil = false;
            System.out.println("Liste boş değildir...");
            System.out.println(arrayList);
        }
    }
}