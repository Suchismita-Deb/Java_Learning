package org.example.course.Neetcode;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
//        groupAnagram();
//        groupAnagramHashMapofHashMap();
    }

    public static String sortString(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        // we need to convert to the string.
        return new String(ch);
    }

    private static void groupAnagramHashMapofHashMap() {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        String strs[] = {"eat","tan","tea","ate","nat","bat"};
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++) {
                char ch = strs[i].charAt(j);
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            }
            for (Map.Entry<Character,Integer> entry : mp.entrySet())
                System.out.print("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            System.out.println();
            if(map.containsKey(mp) == false){
                ArrayList<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                map.put(mp,arr);
            }
            else{
                ArrayList<String> arr = map.get(mp);
                arr.add(strs[i]);
                System.out.println(arr);
                map.put(mp,arr);
            }
        }
        for(ArrayList<String>val:map.values()){
            res.add(val);
        }

        System.out.println(res);
    }

    private static void groupAnagram() {
        String strs[] = {"eat","tan","tea","ate","nat","bat"};
        String helper[] = new String[strs.length];
        for(int i=0;i< strs.length;i++){
            helper[i] = sortString(strs[i]);
        }
        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(helper));
        // [aet, ant, aet, aet, ant, abt]
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> a = new ArrayList<>();
            a.add(strs[i]);
            for(int j=i+1;j< strs.length;j++){
                if(helper[i].equals(helper[j]) && i!=j){
                    a.add(strs[j]);
                    helper[j] = String.valueOf(Math.random());
                    // Giving some issue.
                }
            }
            System.out.println(Arrays.toString(helper));
            res.add(a);
        }
        System.out.println(Arrays.toString(helper));
        System.out.println(res);
    }
}
