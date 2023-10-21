package org.example.streamLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class S2MapAndFlatMap {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        // Convert the list to the double of the element.
        // One operation. We will use map, Convert one list and get another list. Data Transformation.
        List<Integer> listDouble = list.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(listDouble);
        System.out.println();

        List<Integer> l = List.of(1,2,34);
        List<Integer> ll = List.of(12,1,89);
        List<Integer> lll = List.of(19,98);
        List<List<Integer>> list1 = new ArrayList<>();
        list1.add(l);list1.add(ll);list1.add(lll);
        //List<List<Integer>> listOfLists = List.of(
        //            List.of(1, 2, 3),
        //            List.of(4, 5, 6),
        //            List.of(7, 8, 9)
        //        );
        System.out.println(list1);
        //List<Integer> nestedList = list1.stream().map(x -> 2 * x).collect(Collectors.toList());
        //This will not work.
        // We have to work with flatMap. One list contains another list inside it.
        // One to many mapping.
        // Nested list ->flatMap. flatMap takes stream of Streams.

        // Solving this.
//        List<List<Integer>> nestedList = list.stream()
//                .flatMap(x->List.of(2*x).stream())
//                .collect(Collectors.toList());

//        List<List<Integer>> nestedList = list.stream()
//                .flatMap(x->x.(2*x).stream())
//                .collect(Collectors.toList());
    }

}
