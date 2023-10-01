package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A2 {
    //Converting the 2D array(arr2D) to 2D arrayList(list2D)

    public static List<Integer> arrayToArrayList(int[][] arr){
        List<Integer> ar = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                ar.add(arr[i][j]);
            }
        }
        return ar;
    }

    public static List<List<Integer>> arrayTo2DArrayList(int[][] arr){
        List<List<Integer>> ar = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            List<Integer> a1 = new ArrayList<>();
            for(int j=0; j<arr[i].length; j++){
                a1.add(arr[i][j]);
            }
            ar.add(a1);
        }

        return ar;
    }

    public static void main(String[] args) {
        int[][] arr2D = { {1,2,3}, {4,5,6}, {7,8,9} };

        System.out.println("Printing the 2D array");
        for(int i=0;i< arr2D.length;i++){
            for(int j=0;j< arr2D[i].length;j++)
                System.out.print(arr2D[i][j] + " ");
            System.out.println();
        }
        List<Integer> ar = arrayToArrayList(arr2D);
        System.out.println(ar);

        List<List<Integer>> arr = arrayTo2DArrayList(arr2D);
        System.out.println(arr);
    }

}
