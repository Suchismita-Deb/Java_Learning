package org.example.practice;

import java.util.HashMap;
import java.util.Map;

public class string1 {
    public static void main(String[] args) {

//        String s = "Heello";
//        String res="";
//        for(int i=0;i<s.length()-1;i++){
//            int j;
//            for(j=1+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    break;
//                }
//            }
//            if(j==s.length())
//            res+=s.charAt(i);
//        }
//        System.out.println(res);

//        Map<Character,Integer> mp = new HashMap<>();
//        String s ="Hello";
//        for(int i=0;i<s.length();i++){
//            char ch= s.charAt(i);
//            mp.put(ch,mp.getOrDefault(ch,0)+1);
//        }
//        System.out.println(mp);
//        String res="";
//
//        for(int i=0;i<s.length();i++){
//            if(mp.get(s.charAt(i))!=0){
//                res+=s.charAt(i);
//                mp.put(s.charAt(i),0);
//            }
//        }
//        System.out.println(res);
//        System.out.println(mp);
//        if(mp.containsKey('e')){
//            System.out.println("It shows contains for teh value 0.");
//        }

        String s = "Hello World What is up?";
        int pos=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '||i==s.length()-1){
                for(int j=i;j>=pos;j--){
                    res+=s.charAt(j);
                }
//                res+=" ";
                pos=i;
            }
        }
        System.out.println(res);
    }
}
