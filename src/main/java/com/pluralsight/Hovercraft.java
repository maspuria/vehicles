package com.pluralsight;

import java.util.ArrayList;

public class Hovercraft extends Vehicle {
    //field
    private int propellerCount;

    // constructor
    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, int propellerCount) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.propellerCount = propellerCount;
    }

    //getter and setter
    public int getPropellerCount() {
        return propellerCount;
    }

    public void setPropellerCount(int propellerCount) {
        this.propellerCount = propellerCount;
    }
}
