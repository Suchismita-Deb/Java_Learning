package org.example.DailyDrill.A1;

public class A1PrimitiveWrapper {
    public static void main(String[] args) {
        // Primitive cannot store null.
        int i=10;
        // Wrapper can store null.
        Integer j=null;
        Integer n = 98;
        System.out.println(i);
        System.out.println(j);
        System.out.println(n);

        // Autoboxing: int to Integer.
        int primitiveInt = 89;
        Integer wrapperInt = primitiveInt;

        // Unboxing: Integer to int.
        Integer anotherWrapperInt = 898;
        int anotherPrimitiveInt = anotherWrapperInt;

        short s = (short) 32768;//16 bits, -32768 to 32767
        System.out.println(s);
        int test = 90;
        Integer wrapperTest =Integer.valueOf(test);// Explicit conversion.
        Integer wrapperTest2 = test;// Autoboxing. Implicit conversion.
        System.out.println(wrapperTest +" "+ wrapperTest2);

        int size = 8;
        int primitiveIntArray[] = new int[size]; // Primitive datatype.
        Integer wrapperIntArray[] = new Integer[size]; // Wrapper datatype.
        // int,char,float,boolean are primitive.
        // Integer, Character, Float, Boolean are wrapper.

    }
}
