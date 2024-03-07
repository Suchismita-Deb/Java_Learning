package org.example.practice;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
//        countArray();
//        System.out.println(0^12^13^12);

        System.out.println(2^3);
    }

    private static void countArray() {
        int nums[] = {1,2,2,2,2};
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                System.out.println("Count value:" + count);
//                for(int j=i+1; j<nums.length-1; j++){
//                    System.out.println("HI");
//                    if(nums[j]!=nums[j+1]){
//                        i=j+1;
//                        System.out.println("I value: " + i);
//                        break;
//                    }
//                }
                while(nums[i]!=nums[i+1])
                    i++;
            }
            System.out.println(i);
            System.out.println();
        }
        System.out.println(count);
    }
}
