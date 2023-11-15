package org.example.functionalProgramming.FunctionalInterface;

@FunctionalInterface
interface A{
    int show(int i);
}
class B implements A{

    @Override
    public int show(int i) {
        System.out.println("In show.");
        return i;
    }
}

public class F1 {
    public static void main(String[] args) {
        A funcInterface = new B();
        A funcInterface1 = new A() {
            @Override
            public int show(int i) {
                System.out.println("In the main method.");
                return i;
            }
        };
        A obj = (i) -> {return i+i;};
        funcInterface.show(8);
        funcInterface1.show(88);
        System.out.println(obj.show(98));

    }
}
