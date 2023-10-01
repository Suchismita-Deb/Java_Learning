package Assignment.Assignment;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class A3 {
    public static void main(String[] args) {
        //Sorting with Lambda Expressions.

        //Create a list of strings with various names (at least 5 names).

        //Use lambda expressions and the `Collections.sort` method to sort the list in ascending order based on the names' lengths.

        List<String> l1 = Arrays.asList("Joma", "Alex", "Roger", "Brad", "Techie");
        List<String> sortedList = l1.stream()
                .sorted((len1,len2) -> Integer.compare(len1.length(), len2.length()))
                .collect(Collectors.toList());

        System.out.println(sortedList);
        //The output [Joma, Alex, Brad, Roger, Techie].
    }
}
