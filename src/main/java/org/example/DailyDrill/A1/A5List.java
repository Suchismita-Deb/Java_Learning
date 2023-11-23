package org.example.DailyDrill.A1;

import java.util.*;

public class A5List {
    public static void main(String[] args) {
        List<String> list = List.of("Hello","World","Java");
        Integer[] c = {1,2,3,4,5};
        List<Integer> intList = List.of(c);
        System.out.println(intList);

        List<Integer> integerListWithoutNull = Arrays.asList(5, 6, 71, 2, 3);
        integerListWithoutNull.sort(Comparator.naturalOrder());
        System.out.println(integerListWithoutNull);// null is giving error.

        // Using for loop we cannot remove the element and using iterator we can remove.
        // Getting error with iterator and null.

        // asList that converts Array into a List (or Arraylist)
        Integer[] wrapperIntArray = {4,3,1,2,85,85,65};
        System.out.println(Arrays.asList(wrapperIntArray));
        Collections.sort(Arrays.asList(wrapperIntArray));
        System.out.println(Arrays.asList(wrapperIntArray).toString());// Using tostring() and without using toString() has same result.

        Collections.sort(Arrays.asList(wrapperIntArray), Comparator.reverseOrder());
        System.out.println(Arrays.asList(wrapperIntArray));

        Set<Integer> integerSetWithoutNull = new TreeSet<>();//Sorting via Tree
        integerSetWithoutNull.addAll(Arrays.asList(5, 6, 71, 2, 3));

        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("One", 1);hashMap2.put("Three", 3);
    }
}
