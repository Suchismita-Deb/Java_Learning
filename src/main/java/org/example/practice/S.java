package org.example.practice;

import java.util.HashMap;
import java.util.Map;

public class S {
    public static void main(String[] args) {
        //First non-repeating char in string. Return the index.
        String s = "acdebcadce";
        // The output should be 1.
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : mp.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.get(ch)==1){
                System.out.println(i);
                break;
            }
        }
    }
}
