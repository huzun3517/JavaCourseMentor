package Burak._11_Abstraction.DataBaseOrnek;

public abstract class abstractDatabase {

    public void add() {
        System.out.println("Eklendi...");
    }

    public void delete() {
        System.out.println("Silindi...");
    }

    abstract void get();

    abstract void update();


}
