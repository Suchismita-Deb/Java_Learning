package org.example.oops;

class Vehicle{
    public void run(){
        System.out.println("Vehicle is running.");
    }
}
class Car extends Vehicle{
    public void run(){
        System.out.println("Car is running.");
    }

}
public class oops9MethodOverRidding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
        // Vehicle is running.

        Car c = new Car();
        c.run();
        // Car is running.

        Vehicle vCar = new Car();
        vCar.run();
        // Car is running.
        // Method will be called in the class written after the new keyword.
    }
}
