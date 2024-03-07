package org.example.slidingwindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "autayau";
        int i=0,j=0;
        int max = Integer.MIN_VALUE;
        HashSet<Character>hset = new HashSet<>();
        while(j<s.length()){
            if(hset.contains(s.charAt(j))){

                while(hset.contains(s.charAt(j))) {
                    hset.remove(s.charAt(i));
                    i++;
                }
            }
            max = Math.max(max,j-i+1);
            hset.add(s.charAt(j));
            j++;
        }
        System.out.println(max);
    }
}
