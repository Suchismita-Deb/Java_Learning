package recursion.Patterns;
import java.util.*;

public class PrintSubsequence {
    public static void printSubsequence(int ind, ArrayList<Integer> ar, int arr[],int n){
        if(ind>=n){
            System.out.println(ar);
            return;
        }
        ar.add(arr[ind]); // Take the value.
        printSubsequence(ind+1,ar,arr,n);// Call and see all the option by taking the value.
        ar.remove(ar.size()-1);//Not take.
        printSubsequence(ind+1,ar,arr,n);//Call and see all the option by not taking.
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2};
        int n=arr.length;
        ArrayList<Integer> ar = new ArrayList<>();
        printSubsequence(0,ar,arr,n);
    }
}
