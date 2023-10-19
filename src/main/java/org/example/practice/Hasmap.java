package org.example.practice;

import java.util.HashMap;
import java.util.Map;

public class Hasmap {
    public static void main(String[] args) {
        Map<Character,Integer> mp = new HashMap<>();
        Map<Character,Integer> mp1 = new HashMap<>();
        String s = "Helllo";
        String str = "Hellllo";
        for(int i=0; i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else
                mp.put(s.charAt(i),1);
        }
        for(int i=0; i<str.length();i++){
            if(mp1.containsKey(str.charAt(i))){
                mp1.put(str.charAt(i),mp1.get(str.charAt(i))+1);
            }
            else
                mp1.put(str.charAt(i),1);
        }
        char r='a';
        for(Map.Entry<Character,Integer> m: mp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        for(Map.Entry<Character,Integer> m: mp1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
//        for(Map.Entry<Character,Integer> m: mp1.entrySet()){
////            System.out.println(m.getKey()+" "+m.getValue());
//            for(Map.Entry<Character,Integer> m1: mp.entrySet()){
//                if(m.getKey()==m1.getKey()) {
//                    System.out.println(m.getKey());
//                    if (m.getValue() != m1.getValue()) {
////                        System.out.println(m1.getKey() + " " + m1.getValue());
//                        r = m.getKey();
//                        break;
//                    }
//                }
////                r = m.getKey();
////                break;
//            }
//            if(r=='a'){
//                r = m.getKey();
//                break;
//            }
//        }
//        System.out.println(r);

        for(Map.Entry<Character,Integer> m: mp1.entrySet()){
            if(m.getValue()!=mp.get(m.getKey())){
                System.out.println(m.getKey());
            }
        }
    }

}
