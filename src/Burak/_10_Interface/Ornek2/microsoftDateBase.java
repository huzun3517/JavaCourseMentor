package Burak._10_Interface.Ornek2;

public class microsoftDateBase implements IDatabase {

    @Override
    public void add() {
        System.out.println("Microsoft' a çalışan ekleme...");
    }

    @Override
    public void delete() {
        System.out.println("Microsoft' dan çalışan çıkarma...");
    }

    @Override
    public void get() {
        System.out.println("Microsoft çalışan bilgisi alma...");
    }

    @Override
    public void update() {
        System.out.println("Microsoft çalışan bilgisi güncelleme...");
    }
}
