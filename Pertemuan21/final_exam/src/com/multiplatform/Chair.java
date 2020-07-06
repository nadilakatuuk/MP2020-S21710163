package com.multiplatform;

public class Chair {
    private String color;
    private String model;

    public Chair(String color, String model) {
        this.color = color;
        this.model = model;
    }
    public void theChair(){
        System.out.println("Detail Chair");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
