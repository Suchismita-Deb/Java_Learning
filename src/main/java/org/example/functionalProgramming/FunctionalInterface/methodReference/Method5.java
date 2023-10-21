package org.example.functionalProgramming.FunctionalInterface.methodReference;

import java.util.List;

public class Method5 {
    public static void main(String[] args) {
        List<String> s = List.of("Alice","Bob","Rohan");
        s.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
