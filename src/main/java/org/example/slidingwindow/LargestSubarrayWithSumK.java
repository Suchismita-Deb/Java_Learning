package org.example.slidingwindow;

public class LargestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[]= {4,2,1,1,1,2,5};
        int k=5;
        int i=0,j=0;
        int sum=0,max = Integer.MIN_VALUE;
        while (j<arr.length){
            sum+=arr[j];
            if(sum==k){
                max=Math.max(max,j-i+1);
            }
            else if(sum>k){
                while(sum>k){
                    sum-=arr[i];
                    i++;
                }
            }
            j++;
        }
        System.out.println(max);
    }
}
