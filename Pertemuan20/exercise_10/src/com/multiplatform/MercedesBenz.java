package com.multiplatform;

public class MercedesBenz extends Car {

    public MercedesBenz(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes Benz engine can started");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes Benz can accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes Benz can stopped when brakes applied");
    }
}
