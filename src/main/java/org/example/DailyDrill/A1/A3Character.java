package org.example.DailyDrill.A1;

import java.util.Arrays;
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

        System.out.println("".isBlank());//True for blank or space it is true.
        System.out.println(" ".isEmpty());//true for blank and false for space.

        String s = null;
        if(s==null) // put the variable first then check with null.
            System.out.println("s==null");

        String movie = new String("Harry Potter");
        String drama = new String("Harry Potter");
        // Strings created using the new keyword explicitly create a new string object in the heap memory, even if an equivalent string already exists in the pool. This means that even if the string value is the same, it creates a new object in memory.
        System.out.println(movie == drama); // same content but points to diff objects(reference or address) so returning false
        System.out.println(movie .equals(drama)); // same content and pointing to same object(reference or address) so returning true

        String food = "Indian cuisine";
        String foods = "Indian cuisine";
        //String created without using new keyword is stored in the string pool. When you create a string using literals, Java first checks the string pool. If the string already exists in the pool, it reuses it rather than creating a new instance. This is known as string interning, which helps save memory by reusing common string values.

        // without obj creation both  returns true
        System.out.println(food == foods);
        System.out.println(food.equals(foods));

        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" "); // Splits based on space
        System.out.println(Arrays.toString(words));
        // split() is used to split a string into an array of substrings based on a delimiter.
        String text = "apple,orange,banana,grape";
        String[] fruits = text.split(",");
        System.out.println(Arrays.toString(fruits));

        String padded = "   Hello, World!   ";
        String trimmed = padded.trim();
        System.out.println(trimmed);
        // trim() removes leading and trailing whitespace (spaces, tabs, etc.) from a string.

        System.out.println("Hello ".repeat(5));

        String str11 = "Replace Strings";
        String str12 = str11.replaceAll(" ", "" );
        System.out.println(str12);

        // StringBuilder is non synchronised so more efficient. String Buffer is synchronised means thread safe two threads can call the methods of the object simultaneously. Thus less efficient.
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append(" ");
        System.out.println(sb.toString());
    }
}
