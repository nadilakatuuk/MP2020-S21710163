package com.multiplatform;

public class Fish extends Animal{
    private int eyes;
    private int fins;

    public Fish(String name, int height, int eyes, int fins){
        super(name, 1, 1, height);
        this.eyes=eyes;
        this.fins= fins;
    }

@Override
    public void eat(){
        System.out.println(" is eating");
    }
 @Override
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    private  void swim(){
        System.out.println(getName() + "is swimming");
    }
 @Override
    public void move(int speed){
        System.out.println("Animal is moving");
    }


    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
