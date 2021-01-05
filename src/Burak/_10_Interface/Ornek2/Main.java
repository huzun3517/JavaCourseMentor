package Burak._10_Interface.Ornek2;

class DataBaseManager {

    public void addDatabase(IDatabase database) {

        database.add();
    }

    public void deleteDatabase(IDatabase database) {

        database.delete();
    }

    public void getDatabase(IDatabase database) {

        database.get();
    }

    public void updateDatabase(IDatabase database) {

        database.update();
    }
}

    class DataManager {

        public void DataYonetim(IDatabase database) {

            if (database instanceof googleDateBase){
                database.add();
                database.delete();
                database.get();
                database.update();
            }
            else if (database instanceof microsoftDateBase){
                database.add();
                database.delete();
                database.get();
                database.update();
            }
            else if (database instanceof appleDateBase) {
                database.add();
                database.delete();
                database.get();
                database.update();
            }
        }

    }


public class Main {

    public static void main(String[] args) {

       DataBaseManager manager = new DataBaseManager();
       manager.addDatabase(new microsoftDateBase());
       manager.deleteDatabase(new microsoftDateBase());
       manager.getDatabase(new microsoftDateBase());
       manager.updateDatabase(new microsoftDateBase());

        System.out.println("--------------------------------");

        DataBaseManager manager2 = new DataBaseManager();
        manager.addDatabase(new googleDateBase());
        manager.deleteDatabase(new googleDateBase());
        manager.getDatabase(new googleDateBase());
        manager.updateDatabase(new googleDateBase());

        System.out.println("--------------------------------");

        DataBaseManager manager3 = new DataBaseManager();
        manager.addDatabase(new appleDateBase());
        manager.deleteDatabase(new appleDateBase());
        manager.getDatabase(new appleDateBase());
        manager.updateDatabase(new appleDateBase());

        System.out.println("--------------------------------");

        DataManager data = new DataManager();
        data.DataYonetim(new googleDateBase());
        data.DataYonetim(new microsoftDateBase());
        data.DataYonetim(new appleDateBase());
    }
}
