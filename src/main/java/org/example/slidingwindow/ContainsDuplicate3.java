package org.example.slidingwindow;

import java.util.HashSet;

public class ContainsDuplicate3 {
    public static void main(String[] args) {
//        extracted();

        containsDuplicate3Hard();
    }

    private static void containsDuplicate3Hard() {
        int arr[] = {0,1,2,3,4,1};
        int indexDiff=5;
        int valueDiff = 0;
        int j=0,i=0;
        int c=0;
        while(j<arr.length){
            if(i!=j && Math.abs(arr[j]-arr[i])<=valueDiff){
                System.out.println("True");
            }
            if(j-i+1>indexDiff){
                i++;
            }
            if(c!=j && Math.abs(arr[j]-arr[c++])<=valueDiff){
                System.out.println("True");
            }
            j++;
        }
    }

    private static void extracted() {
        int arr[] = {1,2,3,1};
        int k=3;
        int i=0,j=0;
        HashSet<Integer> hset = new HashSet<>();
        while(j<arr.length)
        {
            if(hset.contains(arr[j])) {System.out.println("YES");break;}
            hset.add(arr[j]);
            if(hset.size()>k){
                hset.remove(arr[j-k]);
            }
            j++;
        }
        System.out.println("NO");
    }
}
