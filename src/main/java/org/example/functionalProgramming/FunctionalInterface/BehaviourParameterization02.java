package org.example.functionalProgramming.FunctionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviourParameterization02 {
    public static void main(String[] args) {
        // Practice on Behavior Parameterization.
        List<Integer> ll = List.of(1,8,98,2,3,4,6);   
        // We have a list of number and the square of the number and collect in the list.
        // Do the program using Behavior Parameterization.

        Function<Integer,Integer> mapper = x -> x*x;
        List<Integer> squareList = getList(ll, mapper);
        System.out.println(squareList);  

        List<Integer> cubeList = getList(ll, x->x*x*x);
        System.out.println(cubeList);
        
    }

    private static List<Integer> getList(List<Integer> ll, Function<Integer,Integer> mapper) {
        return ll.stream()
                    .map(mapper)
                    .collect(Collectors.toList());
    }        
}

