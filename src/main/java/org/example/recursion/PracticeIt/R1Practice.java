package org.example.recursion.PracticeIt;

public class R1Practice {
    public static void main(String[] args) {
        // System.out.println(sumTo(2));
        System.out.println(multipleEvens(4));
    }
    public static double sumTo(int n){
        double val=0.0;
        if(n<=0) return 0.0;
        if(n==1) return 1;
        return (1.0/n)+sumTo(n-1);
    }
    public static int multipleEvens(int n){
        if(n<=0) return 0;
        if(n==1) return 2;
        return 2*n*multipleEvens(n-1);
    }
}
