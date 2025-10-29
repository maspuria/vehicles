package com.pluralsight;

import java.util.ArrayList;

public class Car extends Vehicle {
    //field
    private Trunk trunk;


    // constructor
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, Trunk trunk) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
        this.trunk = trunk;
    }

    //getter and setter
    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }
}
