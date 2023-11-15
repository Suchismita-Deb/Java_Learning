package org.example.designPattern.strategyPattern.withStrategyPattern;

import org.example.designPattern.strategyPattern.withStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    // Will not make like new NormalDriveStrategy. It is only the object of DriveStrategy.

    // Constructor Injection.
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
        // It will call the drive method of the driveObject.
    }
}
