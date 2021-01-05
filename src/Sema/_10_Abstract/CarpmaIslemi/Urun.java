package Sema._10_Abstract.CarpmaIslemi;

public abstract class Urun {
    int carpma;
    public Urun(int carpma){
        this.carpma=carpma;
    }
    public int carp(int deger){
        return carpma*deger;
    }
}
