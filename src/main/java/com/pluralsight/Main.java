package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test for creating a moped, (inherited methods and parameters from Vehicle)
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setFuelCapacity(5);

        System.out.println(
                        "[Moped]\n-> Color: " + moped.getColor() +
                        "\n-> Fuel Capacity: " + moped.getFuelCapacity()
        );
    }
}