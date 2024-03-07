package org.example.practice;

public class charArray {
    public static void main(String[] args) {
        char ch[] = new char[256];
        System.out.println(ch[0]-'0');
        System.out.println((char)46);
        System.out.println('\u0000');
        for(int i=0;i<256;i++){
            ch[i] = (char)i;
        }
        char ch1 = ch['a']++;
        System.out.println(ch1);
//        System.out.println(Arrays.toString(ch));
    }
}
