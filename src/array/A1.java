package array;

public class A1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i] = i+1;
        }
        for(int i:arr)
            System.out.println(i);

        System.out.println();

        // Initializing the array.
        int[] ar  = {1,2,3,4,5};
        for(int i:ar)
            System.out.println(i);
    }
}
