package AhmetT._03_Method;

public class l_Varmi_boolean {

    // Array de 1 ve 4 aynı anda varsa return olarak false göndersin.
    // Array de 1 yada 4 varsa return olarak true göndersin.

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};//true
        int[] arr2 = {1,2,3,4}; // false
        int[] arr3 = {2,3,4}; // true
        int[] arr4 = {}; // true

        boolean sonuc = varMi14(arr1);
        System.out.println(sonuc);

        boolean sonuc2 = varMi14(arr2);
        System.out.println(sonuc2);

        boolean sonuc3 = varMi14(arr3);
        System.out.println(sonuc3);

        boolean sonuc4 = varMi14(arr4);
        System.out.println(sonuc4);




    }
    public static boolean varMi14(int [] arr) {

        boolean var1 = false;
        boolean var4 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) var1 = true;
            if (arr[i] == 4) var4 = true;
        }

        if (var1 == true && var4 == true)
    //  if (var1  && var4 )
            return false;

        else
            return true;

    }
}
