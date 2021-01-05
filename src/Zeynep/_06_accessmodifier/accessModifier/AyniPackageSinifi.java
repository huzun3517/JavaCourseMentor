package Zeynep._06_accessmodifier.accessModifier;

public class AyniPackageSinifi {

    public static void main(String[] args) {

        NeNedir erisim = new NeNedir();

        erisim.yas = 5;
        erisim.numara = 4.0;
        erisim.isim = "Ayse";

        erisim.yiliYazdir();

        erisim.eyaletVergisi("$100,00");

    }
}
