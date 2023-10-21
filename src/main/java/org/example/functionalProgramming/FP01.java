package org.example.functionalProgramming;

import java.util.List;

public class FP01 {
    public static void main(String[] args) {
        List<Integer> ll = List.of(1,2,23,32,8,9,98);
        printAllNumberInList(ll);
    }

    private static void printAllNumberInList(List<Integer> ll) {
//        ll.stream()
//                .forEach(FP01::printNum);// Calling static method. Method reference.

        FP01 p = new FP01();
        ll.stream()
                .forEach(p::printNumInstanceMethod);// Calling instance Method. Method Reference.
        // We have t0 define what do we want for the number. This is called Method Reference.
        // We are getting stream of the numbers.
        // For each of the number we will call the current class and the method.
        // This is called Method Reference. For each number the method is to be called.
    }

    private static void printNum(int num) {
        System.out.print(num+" ");
    }
    private void printNumInstanceMethod(int num) {
        System.out.print(num+" ");
    }
}
