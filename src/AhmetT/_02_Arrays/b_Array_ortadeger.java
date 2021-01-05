package AhmetT._02_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class b_Array_ortadeger {

    public static void main(String[] args) {

        // kullanici 1 2 5 43 23 67 seklinde string olan degerler giriyor. .nextLine()
        // bunlari int arraye cevir, sirala
        // max min ort deger { tek ise ortadaki, cift ise ortadaki ikisinin ortalamasi}
        //  1 2 3 4     {1, 2, 3, 4}  max=4, min=1 ort=(2+3)/2
        // 1 2 3 4 5 6    {1, 2, 3, 4, 5} max=5, min=1, ort = 3
        // 0 1 2 3 4 5
        // www.javatpoint.com,   www.tutorialspoint.com, www.w3schools.com

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strNum = str.split("[ ]+");
        int[] nums = new int[strNum.length];
        for (int i=0; i<strNum.length; i++)
            nums[i] = Integer.parseInt(strNum[i]);

        Arrays.sort(nums);

        int max = nums[nums.length-1];
        int min = nums[0];

        int ortDeger;
        if (nums.length % 2 == 0)
            ortDeger=( nums[nums.length/2] + nums[(nums.length-1)/2+1] ) /2;
        else
            ortDeger = nums[(nums.length-1)/2];




        System.out.println(Arrays.toString(strNum));
        System.out.println(Arrays.toString(nums));
        System.out.println(max);
        System.out.println(min);
        System.out.println(ortDeger);


    }
}
