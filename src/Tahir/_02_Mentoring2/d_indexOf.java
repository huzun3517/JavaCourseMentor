package Tahir._02_Mentoring2;

public class d_indexOf {

    public static void main(String[] args) {
          //          0123456789
        String str = "aaacabaaabaab";
        System.out.println(str.indexOf('a')); // --> 0
        System.out.println(str.indexOf('a',1)); // ikinci a karakterinin indexi --> 1
        System.out.println(str.indexOf('a',2)); // üçüncü a karakterinin indexi --> 2

        System.out.println("**********************************************************************");

        System.out.println(str.indexOf('b')); // ilk b karakterinin indexi --> 5
        System.out.println(str.lastIndexOf('b')); // son b karakterinin indexi --> 12
        System.out.println(str.indexOf('b',9)); // ikinci b karakterinin indexi --> 9

        System.out.println("**********************************************************************");

                String s = "Benim ismim Tahir";
        String istenilen = "Benim ismym Tahir";

        System.out.println(s.replace("mim", "mym")  );











    }
}
