package org.example.DailyDrill.A1;

public class A2Typecasting {
    public static void main(String[] args) {
        int n=10;
        double d = n; // Widening Casting(automatic)

        int i = (int)d; // Narrowing Casting(manual)

        Number n1 = 10; // Number class is an abstract class that serves as a superclass for all the numeric wrapper classes (Integer, Double).
        Integer i1 = (Integer) n1;
        int j = (int) n1;
        System.out.println(n1+" " + i1 +" "+j);
        System.out.println(n1.getClass().getSimpleName());// Finding datatype of the variable.
        // We cannot check the data type for the primitive classes. As it is not treated as an object.

        //PARSE  string to Primitive Type
        int primitiveFromParseInt = Integer.parseInt("7");// Needs a Regular Expression ()
        //ValueOf string to Wrapper Type
        Integer wrapperFromValueOf = Integer.valueOf("7");
    }
}
