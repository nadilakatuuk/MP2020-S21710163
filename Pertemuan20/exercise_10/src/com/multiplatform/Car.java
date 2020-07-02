package com.multiplatform;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;



    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("This car engine can started");
    }

    public void accelerate() {
        System.out.println("This car can accelerated");
    }

    public void brake() {
        System.out.println("This car can stopped when brakes applied");
    }
}
