package org.example.practice;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0){
            int n = scn.nextInt();
            int b = scn.nextInt();
            int arr[] = new int[n];
            int prod = 1;
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
                prod*=arr[i];
            }
            System.out.println(prod);
            // 4 2
            // 1 289 1 1
            if(prod!=7 || prod!=17 || prod!=119 || prod!=1 || prod!=289 || prod!=2023){
                System.out.println("No");
            }
            else {
                if(b==1 && (prod==2023||prod==289||prod==119))
                    System.out.println("Yes");
                else if(b==2 && (prod==2023||prod==289||prod==119||prod==7||prod==17))
                    System.out.println("Yes");
                else if(b==3 && (prod==2023||prod==289||prod==119||prod==1||prod==7||prod==17))
                    System.out.println("Yes");
                else if(b>3)
                    System.out.println("Yes");
            }
        }
    }
}
