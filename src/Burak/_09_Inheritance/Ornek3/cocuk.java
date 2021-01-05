package Burak._09_Inheritance.Ornek3;

public class cocuk extends insan {


    @Override
    void yemek(){
        kilo = kilo + 2;
    }
    @Override
    void spor(){
        kilo = kilo + 1;
    }
    @Override
    void buyume(){
        boy = boy + 3;
    }

}
