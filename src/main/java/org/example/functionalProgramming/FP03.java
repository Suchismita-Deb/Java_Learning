package org.example.functionalProgramming;

import java.util.List;

public class FP03{
    public static void main(String[] args) {
        System.out.println("HELLO");
        List<Integer> ll = List.of(12,131,41,45,89,98);
        ll.stream()
        .filter(FP03::isEven)
        .forEach(System.out::println);
        
    }

    private static boolean isEven(int num) {
        return num%2==0;
    }
}