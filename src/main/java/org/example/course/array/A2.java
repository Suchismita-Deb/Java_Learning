package org.example.course.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class A2 {
    public static void main(String[] args) {
        // stringHashSet();
        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList("Hello","World"));
        System.out.println(listOfLists);
    }

    private static void stringHashSet() {
        String s = "aAAaAAbBBNn";
        HashSet<Character> hset = new HashSet<>();
        char[] ch = s.toCharArray();
        for(char c:ch){
            System.out.print(c);
        }

        for(char c : s.toCharArray()){
            hset.add(c);
        }
        System.out.println();
        for(char c:hset){
            System.out.print(c);
        }
    }
}
