package org.example.designPattern.strategyPattern.withStrategyPattern;

import org.example.designPattern.strategyPattern.withStrategyPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
