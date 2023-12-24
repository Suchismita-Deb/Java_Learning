package org.example.array.Matrix;

public class M1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,0,6},{7,8,9}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int[][] m1 = matrix;// Copying the matrix.
        System.out.println();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    for(int row = 0;row<matrix.length;row++){
                        m1[row][j] = -1;
                    }

                    for(int col = 0;col<matrix.length;col++){
                        m1[i][col] = -1;
                    }
                }
            }
        }

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.print(m1[i][j]);
            }
            System.out.println();
        }
    }
}
