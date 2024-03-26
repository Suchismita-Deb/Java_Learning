package org.example.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class S {
    public static void main(String[] args) {
//        firstNonRepeatingCharacterInString();

        greedy();
    }

    private static void firstNonRepeatingCharacterInString() {
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

    public static void greedy(){
        Integer arr[] = {1,2,3};//{1,1,1,1};//{1,20,39,2,3,4,5};
        int k=2;
        Arrays.sort(arr, Collections.reverseOrder());
        int sum=0;
        int i=0;
        System.out.println(Arrays.toString(arr));
        while(k!=0){
            if(i!=0)arr[i]=arr[i]-1;
            if(arr[i]==0)break;
            sum+=arr[i++];
            System.out.println(arr[i]+" "+sum);
            k--;
        }
        System.out.println(sum);
    }
}
