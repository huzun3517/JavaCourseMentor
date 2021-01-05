package AhmetT._08_GenelTekrar;

public class Task04 {
    //   TODO
    //    int kacTaneVar(String str, char c)
    //    aldigi str icinde kac tane c harfi oldugunu bulan method yaziniz

    public static void main(String[] args) {

       int counter = kacTaneVar("Bugun hava guzel arkadaslar",'a');
        System.out.println(counter);
    }

    public static int kacTaneVar(String str, char c){

        int counter =0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) ==c){
                counter++;
            }
        }
        return counter;
    }
}
