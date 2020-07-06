package com.multiplatform;

public class Bed {
    private String color;
    private int size;

    public Bed(String color, int size) {
        this.color = color;
        this.size = size;
    }
public void theBed(){
    System.out.println("Bed Detail");
}
    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
