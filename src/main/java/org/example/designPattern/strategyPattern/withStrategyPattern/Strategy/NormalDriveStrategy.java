package org.example.designPattern.strategyPattern.withStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy.");
    }
}
