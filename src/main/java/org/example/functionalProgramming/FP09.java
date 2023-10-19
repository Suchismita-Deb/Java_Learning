package org.example.functionalProgramming;

import java.util.List;

public class FP09 {
    public static void main(String[] args) {
        // Distinct and sorted.

        //Getting the distinct value.
        List<Integer> ll = List.of(1,2,8,3,4,5);
        ll.stream()
            .distinct()
            .forEach(System.out::println);

        System.out.println();
        //Getting the sorted value.
        ll.stream()
            .sorted()
            .forEach(System.out::println);
        
        System.out.println();
        //Getting the distinct and sorted value.
        ll.stream()
            .distinct() 
            .sorted()
            .forEach(System.out::println);
    }    
}
