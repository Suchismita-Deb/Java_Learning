package org.example.functionalProgramming;

import java.util.List;

public class FP02 {
    public static void main(String[] args) {
        List<Integer> ll = List.of(12,13,16,19,20);
        ll.stream()
                .forEach(System.out::println);
        // The static method is println.
        // System.out contains the static method called println.
    }
}
