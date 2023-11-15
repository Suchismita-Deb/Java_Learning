package org.example.practice;

interface outerInterface{
    void method1();
    interface innerInterface{
        void method2();
    }
}
class MyClass implements outerInterface, outerInterface.innerInterface {
    @Override
    public void method1() {
        System.out.println("Method 1.");
    }

    @Override
    public void method2() {
        System.out.println("Method 2.");
    }
}

public class I1 {
    public static void main(String[] args) {
        MyClass oI = new MyClass();
        oI.method1();
        oI.method2();
    }
}
