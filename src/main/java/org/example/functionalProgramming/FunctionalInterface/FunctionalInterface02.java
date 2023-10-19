package org.example.functionalProgramming.FunctionalInterface;

import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionalInterface02 {
    public static void main(String[] args) {
        List<Integer> ll = List.of(1,8,98,2,3,4,6);
        BinaryOperator<Integer> accumulator = (x,y) -> x+y;

        BinaryOperator<Integer> accumulator1 = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t, Integer u) {
                return t+u;
            }
            
        };

        Integer sum = ll.stream()
                            .reduce(0, accumulator1);
        System.out.println(sum);
   }
}
