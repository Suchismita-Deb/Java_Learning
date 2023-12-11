package org.example.Codeforces;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int ans=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>=arr[k]){
                ans++;
            }
        }
        if(arr[k]<=0)
            ans=0;
        System.out.println(ans);
    }
}
