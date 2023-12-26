package org.example.course.array;

import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {
        moveAllZeroEnd();
        check3ConsecutiveOdds();
        productPrevNextEleUsingExtraSpace();

        // Product of previous element and next element without using extra space.
        int arr[] = {2,3,4,5,6};
        int nums[] = new int[arr.length];
        int j=1;
//        arr[0] = arr[0]*arr[1];
        nums[arr.length-1] = arr[arr.length-1]*arr[arr.length-2];
        for(int i=1;i<arr.length-1;i++){

            if(i==0) arr[0] = arr[0]*arr[1];
            int temp = arr[i-1];
            if(i!=0) arr[j++] = temp*arr[i+1];

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void productPrevNextEleUsingExtraSpace() {
        // Array for every element it will be the product of the previous element and the next element.
        int arr[] = {2,3,4,5,6};
        int nums[] = new int[arr.length];
        int j=1;
        nums[0] = arr[0]*arr[1];
        nums[arr.length-1] = arr[arr.length-1]*arr[arr.length-2];
        for(int i=1;i<arr.length-1;i++){
            nums[j++] = arr[i-1]*arr[i+1];
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void check3ConsecutiveOdds() {
        int nums[] = {1,2,3,2,3,5,6,7,8,9,8,9,89,9};
        // 3 consecutives odd.
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0){
                System.out.println("true");
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count=0;
            }
            else{
                count++;
                if(count==3){
                    System.out.println("true");
                }
            }
        }
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
