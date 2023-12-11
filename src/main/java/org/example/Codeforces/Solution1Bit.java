package org.example.Codeforces;

import java.util.Scanner;

public class Solution1Bit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans=0;
        while(n!=0){
            n--;
            String s= scn.next();
            if(s.charAt(0)=='+' || s.charAt(2)=='+'){
                ans++;
            }
            else{
                ans--;
            }
        }
        System.out.println(ans);
    }
}
