package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        String str = """
                     Hello
                     World""";

        final char ch='A';
        switch(65)
        {
            case ch:
                System.out.println("65"); //65
            case 66:
                System.out.println("66"); //66
        }

        float f= 1.00f/0.00f;
        System.out.println(f);
        System.out.println(10.0f/0.0f);
    }
}
