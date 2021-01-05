package Sema._06_Constructor_Mentoring.Q7;

class Chain
{
    Chain()
    {
        this(5);
        System.out.print(" the default constructor");
    }

    Chain(int x){

        this(5,10);
        System.out.print(x);
    }

    Chain(int x, int y){

        System.out.print(x*y);
    }


    public static void main(String[] args) {

        Chain x=new Chain();
    }
}


