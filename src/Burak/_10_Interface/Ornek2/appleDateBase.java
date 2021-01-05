package Burak._10_Interface.Ornek2;

public class appleDateBase implements IDatabase {
    @Override
    public void add() {
        System.out.println("Apple' a çalışan ekleme...");
    }

    @Override
    public void delete() {
        System.out.println("Apple' dan çalışan çıkarma...");
    }

    @Override
    public void get() {
        System.out.println("Apple çalışan bilgisi alma...");
    }

    @Override
    public void update() {
        System.out.println("Apple çalışan bilgisi güncelleme...");
    }
}
