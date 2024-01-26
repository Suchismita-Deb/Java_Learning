package org.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        initializingArray();
        userInput();
    }

    private static void userInput() {
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        System.out.println(userinput);
    }

    private static void initializingArray() {
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = i+1;
        }
        for(int i:arr)
            System.out.print(i+" ");

        System.out.println();

        // Initializing the array.
        int[] ar  = {1,2,3,4,5};
        // Printing array element.
        System.out.println(Arrays.toString(ar));

        // When size given as 5 and we put value for 3 then the rest will be 0.
        int[] arr1 = new int[5];
        for(int i=0;i<3;i++){
            arr1[i]=i+1;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
