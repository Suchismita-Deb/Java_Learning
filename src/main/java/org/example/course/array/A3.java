package org.example.course.array;

import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {
//        moveAllZeroEnd();
//        check3ConsecutiveOdds();
//        productPrevNextEleUsingExtraSpace();
//        productPrevNextElementWithoutExtraSpace();
        
//        int arr[] = {0,1,0,1,1,0,0,1};
//        int n = 5;
//        System.out.println(Arrays.toString(callArray(n, arr)));

//        trappingRainWaterProblem();

    }

    private static void trappingRainWaterProblem() {
        int arr[] = {1,3,0,1,2,0,4,1,2};
        int prefixLarge[] = new int[arr.length];
        prefixLarge[0] = 0;
        int suffixLarge[] = new int[arr.length];
        suffixLarge[arr.length-1] = 0;
        int l = arr[0];
        int l1 = arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>l)
                l=arr[i-1];
            prefixLarge[i] = l;
        }
        for(int j=arr.length-2;j>=0;j--){
            if(arr[j+1]>l1)
                l1 = arr[j+1];
            suffixLarge[j] = l1;
        }
        int num[] = new int[arr.length];
        num[0] = 0;
        num[arr.length-1] = 0;
        for(int i=1;i<arr.length-1;i++){
            if(Math.min(prefixLarge[i],suffixLarge[i])-arr[i]>0){
                num[i] = Math.min(prefixLarge[i],suffixLarge[i])-arr[i];
            }
            else
                num[i] = 0;
        }
        System.out.println(Arrays.toString(num));
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }


    private static int[] callArray(int n, int[] arr) {
        if(n ==0) return arr;
        int current = 0;
        int left = arr[0];
        arr[0] = 0;
        for(int i=1;i<7;i++){
            current = arr[i];
            if(arr[i+1]==left)
                arr[i] = 1;
            else
                arr[i] = 0;
            left = current;
        }
        arr[7] = 0;
//        System.out.print(n);
//        System.out.println(Arrays.toString(arr));
        return callArray(n-1,arr);
    }

    private static void productPrevNextElementWithoutExtraSpace() {
        // Product of previous element and next element without using extra space.
        int arr[] = {2,3,4,5,6};
        int left=arr[0];
        arr[0] = arr[0]*arr[1];
        int current = 0;
        for(int i=1;i<arr.length-1;i++){
            current = arr[i];
            arr[i] = left*arr[i+1];
            left = current;
        }
        arr[arr.length-1] = arr[arr.length-1]*left;
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
