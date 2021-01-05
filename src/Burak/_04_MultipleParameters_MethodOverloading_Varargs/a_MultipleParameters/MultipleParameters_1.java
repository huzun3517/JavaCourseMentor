package Burak._04_MultipleParameters_MethodOverloading_Varargs.a_MultipleParameters;
//todo ----- Method'ların çalışma mantığı
public class MultipleParameters_1 {

    public static void main(String[] args) {

        kahveMakinesi();



    }
    public static void kahveMakinesi(){

        System.out.println("Espresso");
        System.out.println("Cappuccino");
        System.out.println("Latte");
        System.out.println("Americano");
        System.out.println("Mocha");


    }
}
    //Methodların amacı yazdığımız bir kodu başka bir yerlerde
    //defalarca çağırabiliyoruz. Yeniden yazmıyoruz.

    //Başka insanların kodlarınızı daha rahat anlamasına yarar

    //Method isimlerini anlaşılabilir şeyler yapmakta yarar var.

    //Main methodu mutfak olarak düşünün.
    //Alttaki methodu da kahve makinesi olarak düşünün.
    //Mutfakta kahve makinesini kullanmazsak boş yere yere kaplar.
    //kahve makinesini kullanırsak da kahvelere ulaşabiliriz.