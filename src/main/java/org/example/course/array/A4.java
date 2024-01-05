package org.example.course.array;

public class A4 {
    public static void main(String[] args) {
        maxConsequtive1FlippingOneZero();
    }

    private static void maxConsequtive1FlippingOneZero() {
        int arr[] = {1,0,1,1,0,0,1};
        int count=0;
        int j=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) {
                count++;
            }
            if(count>3){
                j=i+1;
                count=0;
            }
            if(i-j+1>max){
                max=i-j+1;
            }
        }
        System.out.println(max);
    }
}
