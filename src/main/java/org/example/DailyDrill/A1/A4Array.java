package org.example.DailyDrill.A1;

import java.util.Arrays;
import java.util.Comparator;

public class A4Array {
    public static void main(String[] args) {
        int a[] = new int[3];//Primitive Array
        a[0] = 9;
        int[] b = {1,2,5,3,4,5};
        int matrix[][] = new int[3][3];
        int row = matrix.length; // no. of rows.
        int col = matrix[0].length; // no. of column for the first row.
        Arrays.sort(b);// Modifies the original array.
        System.out.println(b); //[I@4517d9a3
        System.out.println(Arrays.toString(b)); //[1, 2, 3, 4, 5]

        Integer integerArray[] = {4,5,3,8,2,71};
        Arrays.sort(integerArray, Comparator.reverseOrder());//Reverse sorting
        System.out.println(Arrays.toString(integerArray));// Only with Wrapper classes.
    }
}
