package org.example.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FP11 {
    public static void main(String[] args) {
        // Collecting stream in the List.
        List<Integer> ll = List.of(12,13,14,15,16);
        // List to store the square of the element in the list.
        List <Integer> l1 = new ArrayList<>();
        l1 = ll.stream()
            .map(x -> x*x)
            .collect(Collectors.toList());
        System.out.println(l1);

        // List to store the length of the word in the list.
        List<String> ls = List.of("API","Spring","Java");
        List<Integer> lstr = new ArrayList<>();
        lstr = ls.stream()
                    .map(x -> x.length())
                    .collect(Collectors.toList());
        // To store any value we have to use map.
        System.out.println(lstr);
    }
}
