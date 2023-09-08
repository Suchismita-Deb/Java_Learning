package array;

public class A2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0;i<3;i++){
            arr[i]=i;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        //When size given as 5 and we put value for 3 then the rest will be 0.
    }
}
