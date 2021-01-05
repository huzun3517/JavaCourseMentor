package AhmetT._05_ArrayList_ve_Methods;

public class Methods_04 {
    public static void main(String[] args) {

        String[] strArr = {"a", "b", "c", "d"};

        method1("a", "b", "c", "d");
        System.out.println();
        method2(strArr);

        method1();

    }

    // main method da overload edilebilir
    public static void main(String args){

    }


//     c:\>java -version
//     c:\>javac ilkProg.java, ikinci.java, a.java

    public static void method1(String... args){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }

    public static void method2(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
