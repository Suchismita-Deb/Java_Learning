package org.example.course.array.arrayAssignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeSortedArray {
    public static void main(String[] args) {
//        mergeSortedArrayExtraSpace();
        int arr[] = {8,1,2,2,4};
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ar[] = {8,1,2,2,4};
        int res[] = new int[arr.length];
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++) {
            if (!mp.containsKey(ar[i])){
                mp.put(ar[i],i);
            }
        }
        for (Map.Entry<Integer,Integer> entry : mp.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        int p=0;
        for(int i=0;i<arr.length;i++){
            res[p++] = mp.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(res));
    }

    private static void mergeSortedArrayExtraSpace() {
        int[] num1 = {1,4,5,0,0,0};
        int[] num2 = {2,3,6};
        int m = 3;
        int n = 3;
        int num1Copy[] = new int[m];
        for(int i=0;i<m;i++){
            num1Copy[i] = num1[i];
        }
        int n1 = 0;
        int n2 = 0;
        for(int i=0;i<m+n;i++){
            if(n2>n||(n1<m&&num1Copy[n1]<num2[n2])){
                num1[i] = num1Copy[n1];
                n1++;
            }
            else {
                num1[i] = num2[n2];
                n2++;
            }
        }
        System.out.println(Arrays.toString(num1));
    }
}
