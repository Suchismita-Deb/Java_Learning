package org.example.array;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int a=5;// Primitive datatype.
        Integer b=8; // Wrapper class. We can access method.

        System.out.println(a);;
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        System.out.println(userinput);
    }
}
