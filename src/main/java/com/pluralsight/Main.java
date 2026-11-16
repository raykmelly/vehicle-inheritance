package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test moped
        // (Inherits its properties and methods from SuperClass Vehicle.java)
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setNumberOfPassengers(2);
        moped.setCargoCapacity(0);
        moped.setFuelCapacity(5);

        System.out.println(
                "[Moped]" +
                        "\n-> Color: " + moped.getColor() +
                        "\n-> Number of passengers: " + moped.getNumberOfPassengers() +
                        "\n-> Cargo capacity: " + moped.getCargoCapacity() +
                        "\n-> Fuel capacity: " + moped.getFuelCapacity()
        );
    }
}