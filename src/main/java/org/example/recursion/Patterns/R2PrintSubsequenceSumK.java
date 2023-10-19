package org.example.recursion.Patterns;
import java.util.*;
public class R2PrintSubsequenceSumK {
    public static void printSubsequenceK(int ind, ArrayList<Integer> arr, int ar[],int n,int sum,int s){
        if(ind==n){
            if(sum==s){
                System.out.println(arr);
            }
            return;
        }
        arr.add(ar[ind]);
        s=s+ar[ind];
        printSubsequenceK(ind+1,arr,ar,n,sum,s);

        arr.remove(arr.size()-1);
        //s=s-arr[arr.size()-1];
        printSubsequenceK(ind+1,arr,ar,n,sum,s);
    }

    public static void main(String[] args) {
        int ar[] = {1,1,2};
        int n=ar.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int sum=2;
        int s=0;
        printSubsequenceK(0,arr,ar,n,sum,s);
    }
}
