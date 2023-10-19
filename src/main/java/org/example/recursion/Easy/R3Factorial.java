package org.example.recursion.Easy;

public class R3Factorial {
    public static int fibonacci(int n) {
        //Base Condition
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
