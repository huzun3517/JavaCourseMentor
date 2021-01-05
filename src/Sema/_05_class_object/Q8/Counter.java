package Sema._05_class_object.Q8;

public class Counter {

    int count = 0;

    Counter() {

        count++;
}

    public static void main(String srt[]) {

        Counter c1 = new Counter();
        Counter c3 = new Counter();
        Counter c2 = new Counter();

        System.out.print(c1.count + ", ");
        System.out.print(c2.count + ", ");
        System.out.print(c3.count);
    }
}
/*
0,0,0
0,1,2
1,1,1
1,2,3
 */