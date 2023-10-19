package org.example.functionalProgramming.FunctionalInterface;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterface03 {
    public static void main(String[] args) {
        Supplier<Integer> randomNumbers = () -> 2;
        System.out.println(randomNumbers.get());
        // No input and returns an output. Example like factory design, create an object.
        // I want to supply random numbers and the lambda has no parameter.
        // We cannot write randomNumbers =  ->2; or randomNumbers = x->2; as there is no parameter in the lambda function.
        // We need to pass something so we have to put the ().

        // For multiline lambda function we use {}
        Supplier<Integer> randomNumber = () -> {
            return 8;
        };
        // Here we have to mention the return word.
        System.out.println(randomNumber.get());
        
        Supplier<Integer> randomNumberSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        // This will generate random number less than 1000.
        System.out.println(randomNumberSupplier.get());


        // Unary Operator - Takes one input and returns the output of same type.
        UnaryOperator<Integer> unaryOperator = x->3*x;
        System.out.println(unaryOperator.apply(10));

        // BiPredicate - In predicate there is one input and output is boolean.
        // In Bi Predicate there is 2 input and output is boolean.
        BiPredicate<Integer,String> biPredicate = (num,str) -> {
            return num>10 && str.length()>5;
        };
        System.out.println(biPredicate.test(12,"helloWorld"));

        // BiFunction - Takes two input and the return type can be anything.
        BiFunction<Integer,String, String> biFunction = (num,str) -> {
            return num+str;
        };// We have to pass 3 value in the calling, the last one is the return type.
        // Going inside the function we will see the parameters.
        System.out.println(biFunction.apply(10,"Hello"));
        // We can also see the method name from going inside the method and the unimplemented method should be called.


        // BiConsumer - Takes 2 input and return nothing.
        BiConsumer<Integer,String> biConsumer = (num,str) ->{
            System.out.println("The number is "+num +" The string is "+str);
        };
        biConsumer.accept(10,"Java");
    }
}
