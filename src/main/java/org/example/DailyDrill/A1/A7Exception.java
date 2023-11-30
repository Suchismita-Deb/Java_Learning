package org.example.DailyDrill.A1;

public class A7Exception {
    public static void main(String[] args) {
        int result = -1;
        try {
            result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception occurred: " + e.getMessage());
        }
    }
}
