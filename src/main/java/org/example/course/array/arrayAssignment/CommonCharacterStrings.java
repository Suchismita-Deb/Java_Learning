package org.example.course.array.arrayAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharacterStrings {
    public static void main(String[] args) {

        String[] str = {"bella","cello","label"};
        int[] res = new int[26];
        // Filling the array with Integer.MAX_VALUE as we need to find the minmum value.
        Arrays.fill(res,Integer.MAX_VALUE);
        List<String> s = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            int[] word = new int[26];
            Arrays.fill(word,0);
            for(int j=0;i<str[i].length();i++){
                char ch= str[i].charAt(j);
                word[ch-'a']++;
            }
            for(int pos=0;pos<26;pos++){
                res[pos] = Math.min(res[pos],word[pos]);
            }
        }

        for(int i=0;i<26;i++){
            for(int j=0;j<res[i];j++){
//                s.add()
            }
        }
        // for(char ch:str[i])  Why it is giving error?
    }
}
