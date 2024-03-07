package org.example.slidingwindow;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int arr[] = {5,3,9,-3,5,3,6,7};
        int k=3;
        int i=0,j=0,max=Integer.MIN_VALUE,count=0;
        while(j<arr.length){
            count = Math.max(count,arr[j]);
            if(j-i+1==k){
                max = Math.max(max, count);
                count =0;

                i++;
                System.out.println(max);
                max =0;
            }
            j++;
        }
    }
}
