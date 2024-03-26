package org.example.course;

public class AlgoParadigm {
    public static void main(String[] args) {
        // Brute Force takes exponential complexity so using the algorithm paradigm we can solve in less complexity.
        // Algorithm Paradigm contains 3 types. Dp, Greedy and Divide and conquer.
        // divide and conquer - when the problem is solved in sub problem with less input. Binary search.


        // Memorization is Bottom Up Approach.
        System.out.println(fibMemorization(5));

        // Tabulation is top Down Approach.
        System.out.println(fibTabulation(5));

        // One or two stairs and total number of ways to reach the last.
        // If n=3 then one can take 1 1 1, 2 1, 1 2.
        // Always think from the last. Like for fibonacci of 5 we are thinking fibonacci of 4 and 3. So for the last stair we need to think about the way we can go to the last stair.
        // To reach the last stair we have f(n-1) and f(n-2) and will add all the count.
        // The base will be f(0) there is 1 way to reach to the top if n=0. and f(1) = 1 way to reach to the top.

        // To get the minimum number of steps to reach the top. Min(f(n-1),f(n-2)) + 1.
        NumberofWaystoReachEnd();

    }

    private static void NumberofWaystoReachEnd() {
        // Only we can move right and left.
        // 2D array given.
    }

    private static int fibTabulation(int n) {
        int tab[] = new int[n];
        tab[0] = 0;
        tab[1] = 1;
        for(int i=2;i<n;i++){
            tab[i] = tab[i-1]+tab[i-2];
        }
        return tab[n];
    }

    private static int fibMemorization(int n) {
        int tab[] = new int[n+1];
        if(n<=1){
            return n;
        }
        if(tab[n]!=0){
            return tab[n];
        }
        else{
            tab[n] = fibMemorization(n-1)+fibMemorization(n-2);
            return tab[n];
        }
    }
}