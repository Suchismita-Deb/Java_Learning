package org.example.map;

import java.util.*;
public class M1 {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();
        mp.put("a","candy");
        mp.put("b","ball");
        mp.put("c","chocolate");
        System.out.println(mp);
        System.out.println(mp.get('a'));
        //if(mp.containsKey("a"))
    }
}
