package org.example.streamLearning;

import java.util.List;

public class S1StreamParallelStream {
    public static void main(String[] args) {
        List<String> l = List.of("a","b","c","d","e");
        //For sequential execution
        l.stream().forEach(System.out::print);
        System.out.println();

        // Not considering the sequential execution
        l.parallelStream().forEach(System.out::print);

        //Output
        //abcde
        //cedba
    }
}
