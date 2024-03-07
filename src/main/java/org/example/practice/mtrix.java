package org.example.practice;

public class mtrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Prefix sum of the matrix.
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==0 && j==0){
                    continue;
                }
                else if(i==0){
                    arr[i][j] += arr[i][j-1];
                }
                else if(j==0){
                    arr[i][j] += arr[i-1][j];
                }
                else{
                    arr[i][j] += arr[i][j-1] +arr[i-1][j] - arr[i-1][j-1];
                }
            }
        }
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        int count=0;
        for(int i[]:arr) {
            for (int j : i) {
                if(j<=18){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
