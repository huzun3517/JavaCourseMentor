package Tahir._02_Mentoring2;

public class soru {

    public static void main(String[] args) {

        String s = "Benim ismim Tahir";
        String istenilen = "Benim ismym Tahir";


        String s1 = s.substring(0,9); // Benim ism
        String s2 = s.substring(9); //   im Tahir
        String s3 = s2.replaceFirst("i","y");
        System.out.println(s1.concat(s3)); // Benim ismym Tahir
    }
}
