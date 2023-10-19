package org.example.functionalProgramming.FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        List<Integer> ll = List.of(1,1,2,3,4,468,469);

        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer,Integer> mapper = x->x*x;
        Consumer<Integer> action = System.out::println;

        // Predicate inside it shows as a functional interface.
        Predicate<Integer> predicate1 = new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                return t%2==0;
            }
            
        };

        ll.stream()
            .filter(predicate1)// When we extract the lambda in the local variable we get the Predicate, Function, Consumer.
            .map(mapper)
            .forEach(action);
    }
}


