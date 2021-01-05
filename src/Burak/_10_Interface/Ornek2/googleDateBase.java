package Burak._10_Interface.Ornek2;

public class googleDateBase implements IDatabase {

    @Override
    public void add() {
        System.out.println("Google' a çalışan ekleme...");

    }

    @Override
    public void delete() {
        System.out.println("Google' dan çalışan çıkarma...");
    }

    @Override
    public void get() {
        System.out.println("Google çalışan bilgisi alma...");
    }

    @Override
    public void update() {
        System.out.println("Google çalışan bilgisi güncelleme...");
    }
}
