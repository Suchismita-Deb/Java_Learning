package org.example.map;

import java.util.*;

public class M2 {
    public static void main(String[] args) {
        // TreeMap, LinkedHashMap and HashMap
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int arr[] = {1,1,3,2,2,4,5,6,6,67,5,4,3,3,3};

        System.out.println("Array elements are.");
        System.out.println(Arrays.toString(arr));
        System.out.println("Hashmap does not maintain any order for insertion.");
        for(int i=0;i<arr.length;i++){
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("LinkedHashMap maintain insertion order.");
        LinkedHashMap<Integer,Integer> lmap = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            lmap.put(arr[i],lmap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: lmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("TreeMap sorted order of key.");
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            tmap.put(arr[i],tmap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: tmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
