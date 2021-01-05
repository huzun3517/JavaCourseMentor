package Tahir._02_Mentoring2;

public class c_length {

    public static void main(String[] args) {

        String str ="We are learning Java";

        System.out.println("length = " + str.length());

        if (str.length() > 10) {
            System.out.println("too long string");
        }

        if (str.length() == 10) {
            System.out.println("length of string is 10");
        }

        if (str.length() < 10) {
            System.out.println("too short string");
        }

        if (str.length() < 30) {
            System.out.println("too short string");
        }


    }
}
