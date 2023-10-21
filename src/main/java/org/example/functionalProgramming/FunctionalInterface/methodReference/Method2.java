package org.example.functionalProgramming.FunctionalInterface.methodReference;

@FunctionalInterface
interface StringConverter{
    String convert(String input);
}
public class Method2 {
    public static String toUpperCase(String input){
        StringConverter s = String::toUpperCase;
        return s.convert(input);
    }

    public static String toLowerCase(String input){
        StringConverter s = String::toLowerCase;
        return s.convert(input);
    }

//    public static String reverseString(String input){
//        StringConverter s = StringBuilder::reverse;
//        return s.convert(input);
//    }

    public static void main(String[] args) {
        System.out.println(toUpperCase("Hello"));
        System.out.println(toLowerCase("World"));
    }
}
