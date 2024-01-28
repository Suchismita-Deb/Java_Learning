package org.example.array;

import java.util.ArrayList;

public class PrintSubarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            // Making the first fixed.
            for(int j=i;j< arr.length;j++){
                // Changing the end.
                ArrayList<Integer> a = new ArrayList<>();
                for(int val=i;val<=j;val++){
                    // Getting the value in the range.
                    a.add(arr[val]);
                }
                res.add(a);
            }
        }
        System.out.println(res);
    }
}
