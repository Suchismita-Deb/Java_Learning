package org.example.functionalProgramming;

import java.util.Comparator;
import java.util.List;

public class FP10 {
    public static void main(String[] args) {
        // Sorting in string default is alphabetical order.
        List<String> ll = List.of("API","Spring","Java");
        ll.stream()
            .sorted()
            .forEach(System.out::println);
        
        System.out.println();
        // Sorted in ascending order.
        ll.stream()
            .sorted(Comparator.naturalOrder())
            .forEach(System.out::println);
        // Default is naturalOrder().

        System.out.println();
        // Sorting in descending order.
        ll.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);

        System.out.println();
        // Sorting by the length of the word.
        ll.stream()
            .sorted(Comparator.comparing(str -> str.length()))
            .forEach(System.out::println);
        // The comparator will use the length of the string to compare.
    }
}
