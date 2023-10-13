package functionalProgramming;

import java.util.List;

public class FP04 {
    public static void main(String[] args) {
        List<Integer> ll = List.of(12,13,14,15,16);
        //Using Lambda in Functional Programming.
        ll.stream()
            .filter(x -> x%2==0)
            .forEach(System.out::println);

    }
}
