package org.example.string;

public class S1 {
    public static void main(String[] args) {

        String s="Hello";

        //Java create a string in the string pool in the heap memory.
        //When create same string using String str then it creates a memory for one string and point two string in the same memory location.
        //When create a string using String str = new String ("Hello") then it will create a separate memory in the heap.
        //Even if the two string is same still it will create a new memory location when we create string using new keyword.

        String str1=new String("Hello");
        System.out.println(s);
        System.out.println(str1);

        String str = "Hello World";
        System.out.println("The character at index 6 is "+str.charAt(6));

        //ASCII encodes symbols, digits, letters, etc., whereas Unicode encodes special texts from different languages, letters, symbols, etc
        char ch = str.charAt(6);
        int ascii = ch;
        int ascii1 = (int) ch;
        System.out.println("The ascii value of a character is "+ascii);
        System.out.println("The ascii value of a character is "+ascii1);

        //Compare two strings lexicographically.
        //They are equal if they have the same length and contain the same characters in the same positions
        String compareString1 = "Hello";
        String compareString2 = "Hello1";
        int res = compareString1.compareTo(compareString2);
        System.out.println(res);
        //The compareTo method returns an integer value that indicates the relationship between the two strings.
        //Negative integer: If the current string (compareString1) is lexicographically less than the anotherString(compareString2).
        //Zero: If the current string is lexicographically equal to the anotherString.
        //Positive integer: If the current string is lexicographically greater than the anotherString.

        //(difference of character value)
        //if s1 > s2, it returns positive number
        //if s1 < s2, it returns negative number
        //if s1 == s2, it returns 0
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="flag";
        System.out.println(s1);
        System.out.println(s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"

        //If first string is an empty string, the method returns a negative
        //If second string is an empty string, the method returns a positive number that is the length of the first string.
        String s6="hello";
        String s7="";
        String s8="me";
        System.out.println(s6.compareTo(s7)); //5
        System.out.println(s7.compareTo(s8));//-2

        String ss = "HELLO";
        String ss1 = "hello";
        int result = ss.compareTo(ss1); // Case sensitive.
        int result1 = ss.compareToIgnoreCase(ss1); // To ignore case sensitive.
        System.out.println(result);
        System.out.println(result1);

        //To check without case-sensitive.
        //we can convert the string to lowercase or uppercase.
        ss = ss.toLowerCase();//the string ss is changed. it is not in place if we do ss.toLowercase() it will not change ss.
        System.out.println(ss);
        int result3 = ss.compareTo(ss1);
        System.out.println(result3);
    }
}
