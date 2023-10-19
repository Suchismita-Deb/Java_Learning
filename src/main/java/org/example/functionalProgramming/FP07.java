package org.example.functionalProgramming;

import java.util.List;

public class FP07 {
    public static void main(String[] args) {
        // Working with Stream.
        // Finding sum of the number in the list.

        List<Integer> ll = List.of(1,2,3,4,5,7,8,123,6,8);
        int val = ll.stream()
                    // Combine all the elements and getting one value.
                    // Stream of number -> one value is called reduce method.
                    .reduce(0,FP07::sum);
                    // .reduce(0, (x,y) -> x+y); // We can use lambda function to find the sum.
                    // .reduce(0, Integer::sum); // sum is also a method.
        System.out.println(val);

        // Finding the multiplication of all the elements in the list.
        // FRom a list of number we are finding one value so reduce will be used.
        int val1 = ll.stream()
                    .reduce(1,FP07::mul);
                    // The first value is the idempotent value or identity.
        System.out.println(val1);

        // Find the max number from the List.
        // From a list of number we are finding one value. So will use reduce.
        int valMax = ll.stream()
                        .reduce(-1,FP07::maxVal);
        System.out.println(valMax);

        // We can also use lambda in reduce function.
        int valMin = ll.stream()
                        .reduce(100000, (x,y) -> Integer.min(x,y));
        System.out.println(valMin);

        int valMin1 = ll.stream()
                        .reduce(Integer.MAX_VALUE, (x,y) -> x>y?y:x);
        System.out.println(valMin1);

        // The internal work of reduce.
        int valCheck = ll.stream()
                        .reduce(0, (x,y) -> x);
        System.out.println(valCheck);// The output is 0. Everytime it will check with the first value 0.
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int maxVal(int a, int b){
        System.out.println(a+" "+b);
        return a>b?a:b;
        //-1 1
        // 1 2
        // 2 3
        // 3 4
        // 4 5
        // 5 7
        // 7 8
        // 8 123
        // 123 6
        // 123 8
        // First comparision with the identity value and then the answer is stored in the identity.
    }
}
