package org.example.map;

import java.util.*;
public class M1 {
    public static void main(String[] args) {
        Map<String,String> mp1 = new HashMap<>();
        mp1.put("a","candy");
        mp1.put("b","ball");
        mp1.put("c","chocolate");
        System.out.println(mp1);
        System.out.println(mp1.get('b'));
        //if(mp.containsKey("a"))

        String s = "abcadce";
        // The output should be 1.
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : mp.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        putIfAbsentMap();
    }

    private static void putIfAbsentMap() {
        int ar[] = {8,1,2,2,4};
        HashMap<Integer,Integer> mp = new HashMap<>();
        // Storing index of the first occurrence of the number.
        for(int i=0;i<ar.length;i++) {
            if (!mp.containsKey(ar[i])){
                mp.put(ar[i],i);
            }
        }
        for (Map.Entry<Integer,Integer> entry : mp.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        // This can be also done with the method putIfAbsent
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            map.putIfAbsent(ar[i], i);
        }
    }
}
