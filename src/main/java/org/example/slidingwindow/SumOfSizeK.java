package org.example.slidingwindow;

import java.util.HashSet;

public class SumOfSizeK {
    public static void main(String[] args) {
        maxSumOfKSize();
        countSubArraySizeKAvgGreaterOrEqualToT();
//        longestSubstringWithoutRepeatingCharacter();
    }

    private static void longestSubstringWithoutRepeatingCharacter() {
        String str = "pwwkew";
        int i=0, j=0;
        int count=0;
        HashSet<Character> hset = new HashSet<>();
        while(j<str.length()){
            if(hset.contains(str.charAt(j))){
                // Similar to the containsduplicate3
//                System.out.print(i+" "+j+" and the count ");
                // We donot go to the j value for i we move and check the place which can be changed.
                while(str.charAt(i)!=str.charAt(j) ){
                    i++;
                }
//                System.out.print(" i value "+i);

//                System.out.print(count);
                count = Math.max(count,j-i);
                hset.remove(str.charAt(i));
                hset.add(str.charAt(j));
//                System.out.println();
            }
            hset.add(str.charAt(j));
            j++;
        }
        System.out.println(count);
    }

    private static void countSubArraySizeKAvgGreaterOrEqualToT() {
        int arr[] = {2,2,2,2,5,5,5,8};
        int k=3;
        int t=4;
        int i=0,j=0;
        int sum=0;
        int count=0,avg=0;
        while(j< arr.length){
            sum+=arr[j];
            if(j-i+1==k){
                avg = sum/k;
                if(avg>=t){
                    count++;
                }
                sum-=arr[i];
                i++;
            }
            j++;
        }
        System.out.println(count);
    }

    private static void maxSumOfKSize() {
        int arr[] = {2,3,4,5,3,4,5,6};
        int k=3;
        int j=0,i=0;
        int sum=0,max=Integer.MIN_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
                // If window size not hit then add the j.
            } else if (j-i+1==k) {
                // When we get the window size we increase the j and reduce the i value.
                max = Math.max(max,sum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
