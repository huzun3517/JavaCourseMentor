package AhmetT._08_GenelTekrar;

public class Task03 {
   //  TODO
   //   void yazdirAscii(char start, char end)
   //   aldigi araliktaki char'lari ekrana her satirda 10 adet olacak sekilde yazdiriniz.
   //   satirdaki yazdirma islemi her yazdirma icin 10 space ve sola yasli olarak ekrana yazdiran
   //   method yaziniz.

    public static void main(String[] args) {

        char start = 97;
        char end = 300;

        yazdirAscii(start,end);
    }


    public static void yazdirAscii(char start, char end){

        int counter =0;

        for (char i = start; i <=end ; i++) {
            System.out.printf("%-10s", i + ":" + (int)i + "\t");
            counter++;

            if (counter == 10){
                System.out.println();
                counter=0;
            }
        }
    }
}
