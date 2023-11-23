package org.example.DailyDrill.A1;

import java.util.List;
import java.util.stream.Collectors;

public class A3Character {

    public static void main(String[] args) {
        char c = '9';
        Character.isDigit(c);//True
        c = 'S';
        System.out.println(Character.isLetter(c));
        System.out.println(Character.toLowerCase(c));
        System.out.println(Character.toTitleCase(c));
        String str = "SDEB06";
        System.out.println(Character.isLetterOrDigit(str.charAt(5)));//true

        // From string to char array.
        String str1 = "Ramdom String";
        char[] charArr = str1.toCharArray();

        // From char to string.
        char c11[] = {'T','e','s','t'};
        String newStr = String.valueOf(c11);

        char c1 = 'C';
        int d = 5;
        Integer i = 5;
        String newStr1 = String.valueOf(i);

        // String to int
        int digit = 0;
        int x = str.charAt(i) - '0';//Subtracting '0' char is important

        //12345 = 1*10^4 + 2*10^3 + 3*10^2 + 4*10^1 + 5*10^0;
        digit = (int) (digit + (x* Math.pow(10,str.length()-1-i)));

        //12345 = 1 -> 10+2 -> 120+3 -> 1230+4 -> 12340+5
        digit = digit*10 + x;

        int i1 = Integer.parseInt("12345");// ParseInt is for the primitive type.
        Integer x1 = Integer.valueOf("67");//value of for the wrapper class.
        int j = Integer.valueOf("1234").intValue();//using value of then converting to primitive type.

        //String concatenation.
        String s1 ="Hello",s2 ="World", s3 = s1+" "+s2;
        System.out.println(s3);

        List<String> list =List.of("Hello","World","Java");
        String combinedString = String.join(", ", list);
        System.out.println(combinedString);

        String combinedString1 = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" && "));
        System.out.println(combinedString1);

        System.out.println(str.startsWith("SD"));//true.
        System.out.println(Math.max(23.34,34));
        System.out.println(Math.min(1,2));
    }
}
