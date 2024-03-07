package org.example.practice;

import java.util.Arrays;

public class Check1 {
    public static void main(String[] args) {
//        contest();

        String s = "QWERTYASDFZXCV";
        int i=0,j=0;
        int count=0,max = Integer.MAX_VALUE;
        int a = s.indexOf('A');
        int z = s.lastIndexOf('Z');
        System.out.println(z-a+1);
        System.out.println(s.indexOf('A'));
        System.out.println(s.lastIndexOf('Z'));
    }

    private static void contest() {
        int arr[] = {8, 12, 40};
        System.out.println(checkOdd(arr));
        int count=0;
        while(checkOdd(arr)){
            count++;
            for(int i=0;i<arr.length;i++){
                arr[i] = arr[i]/2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

    private static boolean checkOdd(int arr[]){
        for(int i:arr){
            if(i%2!=0){
                return false;
            }
        }
        return true;
    }
}
