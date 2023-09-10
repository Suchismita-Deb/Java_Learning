package functionalProgramming.FunctionalInterface.Assignment;

import java.util.*;
import java.util.stream.Collectors;

public class A2 {
    //Part 2 - Filtering with Lambda Expressions.

    //Create a list of integers containing random numbers (at least 10 elements).

    //Use lambda expressions and the `Stream` API to filter the list and create two new lists:
    //A list containing even numbers.
    //A list containing odd numbers.

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(8,6,8,9,6,8,9,7,6,8);
        List<Integer> evenList = l1.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());

        List<Integer> oddList = l1.stream()
                .filter(num -> num%2!=0)
                .collect(Collectors.toList());

        System.out.println(evenList);
        System.out.println(oddList);

        //Output
        //[8, 6, 8, 6, 8, 6, 8]
        //[9, 9, 7]
    }
}
