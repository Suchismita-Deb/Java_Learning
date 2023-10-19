package org.example.functionalProgramming;
import java.util.List;

public class FP06 {
    public static void main(String[] args) {
        // Using Map in the Functional Programming.
        List<Integer> ll = List.of(12,13,6,7,8,9,98);
        ll.stream()
            .map(x -> x*x)
            .forEach(System.out::println);

        // Other example like print cubes of the number.
        // Print the number of charts in each course name.
        // Here we donot want to filter. For all the courses we want the length of the word.
        List<String> ls = List.of("Spring","Spring Boot","Api");
        ls.stream()
            .map(x->x.length())
            .forEach(System.out::println);
    }
    
}
