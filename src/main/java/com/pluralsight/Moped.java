package com.pluralsight;

import java.util.ArrayList;

public class Moped extends Vehicle {
    //field member
    private boolean hasKickstand;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels, boolean hasKickstand) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, new ArrayList<>());
        this.hasKickstand = hasKickstand;
    }
    //getter and setter
    public boolean isHasKickstand() {
        return hasKickstand;
    }

    public void setHasKickstand(boolean hasKickstand) {
        this.hasKickstand = hasKickstand;
    }
}
