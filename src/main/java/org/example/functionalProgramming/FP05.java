package org.example.functionalProgramming;

import java.util.List;

public class FP05 {
    
    public static void main(String[] args) {
        //Some example of lambda and other as practice.

        // Print the odd numbers in the list.
        List<Integer> ll = List.of(12,13,14,22,2,3,24,25);
        ll.stream()
            .filter(x -> x%2!=0)
            .forEach(System.out::println);

        System.out.println();
        //Print all the courses individually.
        List<String> ls = List.of("Spring","Spring Boot","API","Microservice");
        ls.stream()
        .forEach(System.out::println);

        System.out.println();
        //print the word that contains "Spring" in it.
        ls.stream()
            .filter(x -> x.contains("Spring"))
            .forEach(System.out::println);

        System.out.println();
        // Print the word in the list which has 12 letter.
        ls.stream()
            .filter(x -> x.length()==12)
            .forEach(System.out::println);
    }
}
