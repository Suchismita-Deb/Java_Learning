package org.example.practice;

public class Matrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("Approach to print the main diagonal.");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Approach to print main diagonal.");
        for(int i=0;i<arr.length;i++){
            if(i==i){
                System.out.print(arr[i][i]+" ");
            }
        }
        System.out.println();
        System.out.println("Approach to print the secondary diagonal.");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i][arr.length-i-1]+" ");
        }
        System.out.println();
        System.out.println("Approach to interchange the diagonal.");
        for(int i=0;i< arr.length;i++){
            int temp = arr[i][i];
            arr[i][i] = arr[i][arr.length-i-1];
            arr[i][arr.length-i-1] = temp;
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        matrixMultiple();
    }

    private static void matrixMultiple() {
        int matrix1[][] = {
                {1,2,3},
                {2,1,2}
        };
        int matrix2[][] = {
                {4,1,3,2},
                {0,1,0,2},
                {5,0,3,1}
        };
        int res[][] = new int[2][4];//int[matrix1.length][matrix2[0].length];

        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                int sum = 0;
                for(int n = 0;n<matrix1[0].length;n++){
                    sum += matrix1[i][n] * matrix2[n][j];
                }
//                System.out.print(sum+" ");
                res[i][j] = sum;
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
