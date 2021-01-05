package Tahir._06_LinkedHaschMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class a_LinkedHaschMap1 {

    public static void main(String[] args) {

        //ToDo 5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
        //ToDo 5 tane ulke ismi ve nufusunu yazdırıyoruz. (country)
        //ToDo 5 tane ulke ismi yazdırıyoruz. (keyset())
        //ToDo 5 tane ulke nufusunu yazdırıyoruz. (values())
        //ToDo nüfusların toplamını yazdırın.
        //ToDo kaç tane 50 milyondan az nüfuslu ülke var?


        //ToDo 5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
        LinkedHashMap<String,Integer> country = new LinkedHashMap<>();

        country.put("RUSYA",145987803);
        country.put("ALMANYA",83694929);
        country.put("TURKIYE",83154997);
        country.put("FRANSA",65183386);
        country.put("ITALYA",60461826);

        //ToDo 5 tane ulke ismi ve nufusunu yazdırıyoruz. (country)
        System.out.println("country = " + country);

        System.out.println("----------------------------------------------");

        //ToDo 5 tane ulke ismi ve nufusunu yazdırıyoruz. (country)
        // Satır satır alt alta yazdırmak için bu metodu kullanıyoruz.

        for (Map.Entry<String, Integer> ulke : country.entrySet()) {
            System.out.println(ulke);
        }
        System.out.println("-----------------------------------------------");

        //ToDo 5 tane ulke ismi yazdırıyoruz. (keyset())
        //Burda sadece ülke isimlerini yazdırıyoruz.
        System.out.println(country.keySet());

        System.out.println("-----------------------------------------------");

        //ToDo 5 tane ulke nufusunu yazdırıyoruz. (values())
        //Burda sadece nüfusları yazdırıyoruz.
        System.out.println(country.values());

        System.out.println("---------------------------------------");

        //ToDo nüfusların toplamını yazdırın.

        int top = 0;
        for (Map.Entry<String,Integer> nufus : country.entrySet() ) {

            top+=nufus.getValue();

        }
        System.out.println("Toplam : " + top );


        System.out.println("-----------------------------------------");


        //ToDo kaç tane 80 milyondan az nüfuslu ülke var?

        int count =0;

        for (Map.Entry<String,Integer> nufus: country.entrySet()){

            if (  nufus.getValue()  <80000000 ){
                count++;
                System.out.println(nufus.getKey() + "--->" + nufus.getValue());
            }

        }
        System.out.println(count + " tane ülke");

    }
}
