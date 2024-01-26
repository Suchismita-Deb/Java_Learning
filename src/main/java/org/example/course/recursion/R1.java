package org.example.course.recursion;

public class R1 {
    public static void main(String[] args) {
        // printfun(5);
        // fun(21);
        fun1(5);
    }

    private static void fun1(int n) {
        if(n==0) return;
        fun1(n-1);
        System.out.println(n);
    }

    private static void fun(int n) {
        if(n==0) return;
        fun(n/2);
        System.out.println(n%2);
    }

    private static void printfun(int n) {
        if(n<1) return;
        else{
            System.out.println(n);
            printfun(n-1);
            System.out.println(n);
            return;
        }
    }
}
