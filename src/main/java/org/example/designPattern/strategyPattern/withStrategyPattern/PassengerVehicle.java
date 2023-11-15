package org.example.designPattern.strategyPattern.withStrategyPattern;

import org.example.designPattern.strategyPattern.withStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
