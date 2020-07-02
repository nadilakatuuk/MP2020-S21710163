package com.multiplatform;

public class Porsche  extends Car{

    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public void startEngine() {
        System.out.println("Porsche engine can started");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche can accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Porsche can stopped when brakes applied");
    }
}
