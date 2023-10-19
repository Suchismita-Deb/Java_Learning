package org.example.practice;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "(1+(2*3)+((8)/4))+1";
        int max=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                cnt=st.size();
                if(cnt>max){
                    max=cnt;
                }
            }
            else if(s.charAt(i)==')'){
                st.pop();
            }
        }
        System.out.println(max);
    }
}
