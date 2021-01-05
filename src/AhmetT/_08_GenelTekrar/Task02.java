package AhmetT._08_GenelTekrar;

public class Task02 {
    //   TODO
    //    void yazdirNum(int min, int max, int maxEleman)
    //    alacagi min den max a kadar olan sayilari her satirda en fazla 20 tane olacak sekilde
    //    ekrana yazdiran method yaziniz

    public static void main(String[] args) {

        int min=4;
        int max=100;
        int maxEleman = 20;

        yazdirNum(min,max, maxEleman);
    }

    public static void yazdirNum(int min, int max, int maxEleman){

        int counter =0;

        for (int i = min; i <=max ; i++) {
            System.out.print(i + "\t");
            counter++;

            if (counter == 20){
                System.out.println();
                counter=0;
            }
        }
    }
}
