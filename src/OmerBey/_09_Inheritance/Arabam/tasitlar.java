package OmerBey._09_Inheritance.Arabam;

public class tasitlar {

    private String model;

    public tasitlar(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void bilgileriYaz() {

        System.out.println("Model: " + this.model);
    }


    public static void arabaKimlik(Object object) {

        if (object instanceof araba){
            araba araba = (araba) object;
            System.out.println("Taşıt: Araba");
            araba.bilgileriYaz();

        }
        else if (object instanceof kamyon) {
            kamyon kamyonet = (kamyon) object;
            System.out.println("Taşıt: Kamyonet");
            kamyonet.bilgileriYaz();
        }
    }
}
