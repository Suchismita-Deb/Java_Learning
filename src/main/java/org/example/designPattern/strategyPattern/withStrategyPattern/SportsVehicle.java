package org.example.designPattern.strategyPattern.withStrategyPattern;

import org.example.designPattern.strategyPattern.withStrategyPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
