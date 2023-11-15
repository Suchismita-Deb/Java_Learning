package org.example;

abstract class AbstractClass{
    protected int i=0; // There can be any type of access modifiers in the abstract class.
    static final int f1=10;// Method can be static and can be non static.
    abstract void show(); // We can have both abstract method and concrete method. The abstract keyword should be used.
    void display(){
        System.out.println("Non abstract method.");
    }
}

public class AbstractClassExample extends AbstractClass{
    // Class can not extend more than one abstract class. Multiple inheritance is not supported in Java.
    // Class can implement more than one interface.
    @Override
    void show() {
        System.out.println("This is the show method of the abstract class.");
    }

    public static void main(String[] args) {
        AbstractClass a = new AbstractClassExample();
        a.show();
        a.display();
        a.i = 20; // We can change the value.
        //a.f1=20; // It is final.
        System.out.println(a.i);
    }
}
