package org.example.course.sdeSheet;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,1},{4,3,6,7},{7,8,7,0}};
        printMatrix(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    for(int col=0;col<matrix[i].length;col++){
                        if(matrix[i][col]!=0)
                            matrix[i][col] = -1;
                    }
                    for(int row=0;row<matrix.length;row++){
                        if(matrix[row][j]!=0)
                            matrix[row][j] = -1;
                    }
                }
            }
        }
        System.out.println();
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
