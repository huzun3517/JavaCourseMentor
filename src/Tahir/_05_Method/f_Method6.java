package Tahir._05_Method;

public class f_Method6 {

    public static void main(String[] args) {

        /*
            int [] arr={1,34,5,678,34,56,7,8,};
            int search=78;
            -78 sayisi verilen arrayde var mi?
            2 parametreli method kullanın
     */

        int [] arr={1,34,5,6,78,34,56,7,8,};
        int search=78;
        boolean sonuc = searchNumber(arr,search);
        System.out.println(searchNumber(arr,search));





    }
    public static boolean searchNumber(int[]arr, int search){

        boolean varMi=false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search){
                varMi = true;
                break;
            }

        }
        return varMi;
    }
}
