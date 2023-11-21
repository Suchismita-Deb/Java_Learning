package org.example.DailyDrill.streamLearning;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class S2Exception {
    public static void main(String[] args) {
        List<String> list = List.of("45","89","98");
        List<Integer> listInt = list.stream()
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());
        System.out.println(listInt);
        // Output [45, 89, 98]

        List<String> list1 = List.of("45","89","98i");
        //list1.forEach(x->System.out.println(Integer.parseInt(x)));
        // This will give exception.

        list1.forEach(x->{
            try{
                System.out.println(Integer.parseInt(x));
            }catch(Exception e){
                System.out.println("Exception is "+e);
            }
        });
        //Output.
        //45
        //89
        //Exception is java.lang.NumberFormatException: For input string: "98i".
        // Not recommended as it should be in one line.

        // Approach 2.
        // Make the exception in different method.
        System.out.println();
        list1.forEach(x->exceptionHandling(x));
        System.out.println();
        list1.forEach(S2Exception::exceptionHandling);// Method Reference.
        System.out.println();
        System.out.println("Consumer Method");
        list1.forEach(handleExceptionIfAny(s->Integer.parseInt(s)));

    }
    public static void exceptionHandling(String s){
        try{
            System.out.println(Integer.parseInt(s));
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
    }

    public static <String> Consumer<String> handleExceptionIfAny(Consumer<String> input){
        // The method definition is generic.
        // public static Consumer<String> handleExceptionIfAny(Consumer<String> input)
        // For string consumer.
        return x->{
            try{
                input.accept(x);
                System.out.println(x);
            }
            catch (Exception e){
                System.out.println(e);
            }
        };
    }
}
