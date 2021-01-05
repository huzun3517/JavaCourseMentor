package A_KursOncesiHazirlik.scannerOdevler;

import java.util.Scanner;

public class BedenKitleIndeksi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kilonuz: ");
        double kilo = sc.nextDouble();

        System.out.print("Boyunuz(Örnek 1,80): ");
        double boy = sc.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz: " + bki);
    }
}

        /*
                           //todo BEDEN KİTLE İNDEKSİ  HESAPLAMA --

                    İstenen adımları sırasıyla takip ediniz.


                   1. Sistem bizden Kilomuzu istemeli. (double)

                    2.Sistem bizden boyumuzu istemeli. (metre cinsinden - double)

                    3. Beden kitle indeksini bulmak için yapılacak işlem : -->    bedenKitleIndeksi (bki) = kilo / (boy * boy)

                    4. Verilecek cevaplar (girdiler), soruların karşısına yazılmalı.

                    4.Konsola  örn:   -->  Beden Kitle İndeksiniz : 25,67575634578    yazdırın.
         */



