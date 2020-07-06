package com.multiplatform;

public class Wardrobe {
    private String color;
    private String model;
    private int size;

    public Wardrobe(String color, String model, int size) {
        this.color = color;
        this.model = model;
        this.size = size;
    }
public void theWardrobe(){
    System.out.println("Wardrobe Detail");
}
    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }
}
