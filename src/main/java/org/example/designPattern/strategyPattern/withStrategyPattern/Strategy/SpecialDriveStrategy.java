package org.example.designPattern.strategyPattern.withStrategyPattern.Strategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive Strategy.");
    }
}
