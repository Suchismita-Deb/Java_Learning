package org.example.course.array;

public class A1 {
    public static void main(String[] args) {
        // Maximum element from the right including the current element.
        int arr[] = {5,6,89,7,5};
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i] = Math.max(arr[i],arr[i+1]);
        }
        for (int i:arr){
            System.out.println(i);
        }
    }
}
