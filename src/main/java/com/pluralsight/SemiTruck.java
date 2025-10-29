package com.pluralsight;

import java.util.ArrayList;

public class SemiTruck extends Vehicle {
    // field members
    private int axelCount;

    // constructor
    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, int axelCount) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, new ArrayList<>());
        this.axelCount = axelCount;
    }

    //getters and setters
    public int getAxelCount() {
        return axelCount;
    }

    public void setAxelCount(int axelCount) {
        this.axelCount = axelCount;
    }
}
