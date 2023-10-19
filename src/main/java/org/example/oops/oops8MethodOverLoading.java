package org.example.oops;

class Demo{
    public int sumOfTwoNumbers(int a, int b){
        return a+b;
    }
    public double sumOfTwoNumber(double a, double b){
        return a+b;
    }
    public int sumOfTwoNumber(int a, int b, int c){
        return a+b+c;
    }
}
public class oops8MethodOverLoading {
    public static void main(String[] args) {
        Demo d= new Demo();
        System.out.println(d.sumOfTwoNumbers(8,9));
        System.out.println(d.sumOfTwoNumber(10.25,10.20));
        System.out.println(d.sumOfTwoNumber(10.25f,10.20));
        // Here it is float still it is not giving any error as in this case the float is promoted to double.
        // byte gets promoted to short.
        // short gets promoted to int.
        // int gets promoted to long.
        // long gets promoted to float.
        // float gets promoted to double.

        // char get promoted to int.
        // We cannot provide double to the float method. Reverse is not possible.
        System.out.println(d.sumOfTwoNumber(7,8,9));
    }
}
