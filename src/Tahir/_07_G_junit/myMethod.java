package Tahir._07_G_junit;

public class myMethod {

    // Stringin son karakterini veren method yaıyoruz.

    public char lastCharacter(String str){

        return str.charAt(str.length()-1);

    }

    // Arrayin max elemanını bulan methodu yazlım ve test edelim.

    public int maxNumberArray(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]> max)
                max = arr[i];
        }
        return max;
    }

    public  int factorial(int num) {

        int faktoriyel=1;

        while(num>0){
            faktoriyel=faktoriyel*num;
            num--;
        }
        return faktoriyel;
    }

}
