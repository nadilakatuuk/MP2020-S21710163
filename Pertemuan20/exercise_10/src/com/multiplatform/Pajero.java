package com.multiplatform;

public class Pajero  extends Car{

    public Pajero(String name, int cylinders){
        super(name, cylinders);
    }
    @Override
    public void startEngine() {
        System.out.println("Pajero engine can started");
    }

    @Override
    public void accelerate() {
        System.out.println("Pajero can accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Pajero can stopped when brakes applied");
    }

}
