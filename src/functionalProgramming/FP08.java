package functionalProgramming;

import java.util.List;

public class FP08 {
    public static void main(String[] args) {
        
        // Square every number in the list and find the sum of the square.
        List<Integer> ll = List.of(1,2,3,4,5);
        int val = ll.stream()
                    .map(x -> x*x)
                    .reduce(0, (x,y) -> x+y);
        System.out.println(val);

        // Sum of odd numbers in the list.
        int odd = ll.stream()
                        .filter(x->x%2!=0)
                        .reduce(0,(x,y) -> x+y);
        System.out.println(odd);
    }
}
