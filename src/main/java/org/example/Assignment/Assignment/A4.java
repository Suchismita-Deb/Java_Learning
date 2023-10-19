package org.example.Assignment.Assignment;

public class A4 {
    //Custom Functional Interface.

    //Create your custom functional interface with a single abstract method related to a specific domain of your choice.
    //(e.g., `GreetingFunction` with a method `void greet(String name);`).

    //Implement a lambda expression using your custom functional interface.

    //Write a method that takes a `GreetingFunction` lambda and a name as input and invokes the lambda to perform the greeting.

    public interface GreetingFunction{
        void greet(String name);
    }

    public static void main(String[] args) {
        GreetingFunction greet1 = (name) -> System.out.println("Hello " + name);
        //System.out.println(greet1.greet("Jennifer"));

        greet1.greet("Jennifer");
        GreetName(greet1,"Jennifer");
        //Hello Jennifer.
    }

    public static void GreetName(GreetingFunction greet,String name){
        greet.greet(name);
    }
 }
