package org.example.functionalProgramming.FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class BehaviourParameterization01 {
    public static void main(String[] args) {
        List<Integer> ll = List.of(1,8,98,2,3,4,6);
        Predicate<Integer> evenPredicate = x -> x%2==0;
        extractedPredicate(ll, evenPredicate);

        System.out.println();
        Predicate<Integer> oddPredicate = x -> x%2!=0; //= x -> x%2==0 This is the bahaviour we are passing.
        extractedPredicate(ll, oddPredicate);
        
        //ll.stream()
        //    .filter(Predicate)
        //    .forEach(System.out::println);

        // Many repeatative work we are doing for the even and odd numbers.
        // We can make a method and pass the logic as a parameter.

        extractedPredicate(ll, x->x%3==0);
        // We are passing the logic and we are not making the method again.
        // We are passing the behaviour of the method as an argument. This is called Behaviour Parameterization.
    }

    private static void extractedPredicate(List<Integer> ll, Predicate<Integer> Predicate) {
        
        // We are passing Predicate as an argument and when calling we are passing oddPredicate and evenPredicate.
        ll.stream()
            .filter(Predicate)
            .forEach(System.out::println);
    }
}
