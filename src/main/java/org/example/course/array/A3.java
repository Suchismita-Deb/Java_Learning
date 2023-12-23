package org.example.course.array;

import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {
        moveAllZeroEnd();
    }

    private static void moveAllZeroEnd() {
        int nums[] = {0,0,1,0,1,0,0,1,1};
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(nums[left] !=0 ){
                left++;
            }
            if(nums[right] == 0){
                right--;
            }
            else if(nums[left]==0 && nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
