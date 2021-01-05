package Burak._04_MultipleParameters_MethodOverloading_Varargs.c_VarArgs;

import java.util.Arrays;

public class VarArgs_1 {

    //todo -------------- Varargs mantığı

    public static void main(String[] args) {

        varargsDeneme(1, 3, 4, 5, 6, 7, 8, 9, 0,1, 3, 4, 5, 6, 7, 8, 9, 0,1, 3, 4, 5, 6, 7, 8, 9, 0);
        //Her seferinde int tanıtmamız gerekmiyor.
    }
    public static void varargsDeneme(int ...a){ //olay 3 noktada.
        System.out.println("VarArgs denemesi: " + Arrays.toString(a));
    }

}
