package com.pluralsight;

import java.util.ArrayList;

public class VehiclesApplication {

    public static void main(String[] args) {
        Moped moped = new Moped("pink", 1, 0, 2,new ArrayList<Wheel>(), true);
        moped.setColor("Pink");
        System.out.println("This Moped's color: " + moped.getColor());


        // or Trunk trunk = new Trunk();
        Car car = new Car("Purple", 4, 5, 16, new ArrayList<Wheel>(), new Trunk());
        car.setColor("Purple");
        car.setFuelCapacity(16);
        System.out.println("The color of the car is "+ car.getColor() +" and the fuel capacity is "+ car.getFuelCapacity());



//        SemiTruck truck = new SemiTruck();
//        truck.setColor("Rainbow");
//        truck.setNumberOfPassengers(2);
//        truck.setCargoCapacity(111);
//        truck.setFuelCapacity(130);
//        System.out.println(truck);



    }


}
