package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Vehicle { // parent class or super class
    // field members
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    private ArrayList<Wheel> wheels;

    public Vehicle() {

    }
    // constructor
    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels){
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.wheels = wheels;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }

    // toString
    @Override
    public String toString() {
        return "Vehicle {" +
                "color = '" + color + '\'' +
                ", numberOfPassengers = " + numberOfPassengers +
                ", cargoCapacity = " + cargoCapacity +
                ", fuelCapacity = " + fuelCapacity +
                ", wheels = " + wheels +
                '}';
    }
}
