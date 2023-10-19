package org.example.Assignment.Assignment;

public interface A1 {
    //Part 1 - Basic Lambda Expressions:
    //Create a functional interface called `MathOperation` that defines a single abstract method `int operate(int a, int b);`.

    //Implement three lambda expressions using the `MathOperation` interface for the following operations:
    //Addition: `a + b`
    //Subtraction: `a - b`
    //Multiplication: `a * b`

    //Write a method called `performOperation` that takes two integers and a `MathOperation` lambda as parameters and returns
    //the result of applying the operation on the given integers.

    public interface MathOperation{
        int operate(int a,int b);
    }

    public static void main(String[] args) {
        MathOperation addition = (a,b) -> (a + b);
        MathOperation subtraction = (a,b) -> (a - b);
        MathOperation multiplication = (a,b) -> (a * b);

        int res = addition.operate(8,12); // Output is 20.
        System.out.println(res);

        int resadd = performOperation(10,19,addition);
        System.out.println("Using method "+resadd);

        //20.
        //Using method 29.
    }

    public static int performOperation(int a, int b, MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }
}
