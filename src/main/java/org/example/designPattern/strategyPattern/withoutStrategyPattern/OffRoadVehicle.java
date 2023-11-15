package org.example.designPattern.strategyPattern.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Special Functionality.");
    }
}
