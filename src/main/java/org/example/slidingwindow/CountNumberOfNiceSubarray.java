package org.example.slidingwindow;

import java.util.HashSet;

// TODO
public class CountNumberOfNiceSubarray {
    public static void main(String[] args) {
        CountNumberOfNiceSubarray();

        Kdifferentelement();
    }

    private static void Kdifferentelement() {
        int arr[] = {1,2,1,2,3};
        int k=2;
        int j=0,i=0;
        int count=0;
        HashSet<Integer> hset = new HashSet<>();
        while(j<arr.length){
            if(hset.contains(arr[j])){
                hset.remove(arr[i]);
                i++;
            }
            if(j-i+1==k) {
                count++;
                hset.remove(arr[i]);
                i++;
            }
            hset.add(arr[j]);
            j++;
        }
        System.out.println(count);
    }

    private static void CountNumberOfNiceSubarray() {
        int arr[] = {2,2,2,1,2,2,1,2,2,2};
        int k=2;
        int i=0,j=0;
        int count=0,subarray=0;
        while(j< arr.length){
            if(arr[j]%2!=0){
                count++;
            }
            if(count==k){
                subarray++;
                if(arr[i]%2!=0){
                    count--;
                }
                i++;
            }
            j++;
        }
        System.out.println(subarray);
    }
}
