package org.example.slidingwindow;

public class MaxConsecutive1WithKFlip {
    public static void main(String[] args) {
        withCount0Value();
        withoutCount0Value();
    }

    private static void withoutCount0Value() {
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int i=0,j=0;
        int k=2;
        int max = Integer.MIN_VALUE;
        int count=0;
        while(j<arr.length){
            if(arr[j]==0)
            {
                k--;
            }
            while(k<0){
                if(arr[i]==0) k++;
                i++;
            }
            j++;
            max = Integer.max(j-i,max);
        }
        System.out.println(max);
    }
    private static void withCount0Value() {
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int i=0,j=0;
        int k=2;
        int max = Integer.MIN_VALUE;
        int count=0;
        while(j<arr.length){
            if(arr[j]==0)
            {
                count++;
            }
            while(count>k){
                if(arr[i]==0) count--;
                i++;
            }
            j++;
            max = Integer.max(j-i,max);
        }
        System.out.println(max);
    }
}
