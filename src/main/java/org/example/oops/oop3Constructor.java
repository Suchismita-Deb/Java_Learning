package org.example.oops;

class ConstructorClass{
    private int a;

    //Constructor.
    //Same name like class name.
    public ConstructorClass(){
        // We can use access modifiers in the constructor.
        // Constructor cannot be abstract, final or static.
        a = 10;
        //Constructor are called at the time of creating object.
    }
}
public class oop3Constructor {
    //To initialise variable at runtime we use constructor.
    // Default, Parameterised and Non parameterised.

    //Constructors are special type of method which is used to initialise objects and the name of the constructor is same as class.
    public static void main(String[] args) {
        ConstructorClass c = new ConstructorClass();

    }
}
