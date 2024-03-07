package org.example.slidingwindow;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int arr[] = {10,5,2,6};
        int k = 100;
        int i=0,j=0,count=0;
        int p=1;
        while(j<arr.length){
            p*=arr[j];
            while(p>=k){
                p/=arr[i];
                i++;
            }
            count += j-i+1;
            j++;
        }
        System.out.println(count);
    }
}
