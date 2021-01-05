package OmerBey._09_Inheritance.ornek1;

public class Super_class {

    int num = 20;

    public static void goster() {
        System.out.println("Bu method süper classın görüntülenme metodudur..");
    }

    static class Sub_class extends Super_class{

        int num = 10;

        public static void goster() {

            System.out.println("Bu method sub classın görüntülenme metodudur..");

        }

        public void my_method() {

            Sub_class sb = new Sub_class();

            Sub_class.goster();
            Super_class.goster();

            System.out.println("Sub classtaki eleman: " + sb.num);
            System.out.println("Super classtaki eleman: " + super.num);


        }

        public static void main(String[] args) {

            Sub_class sb = new Sub_class();
            sb.my_method();
        }
    }



}

