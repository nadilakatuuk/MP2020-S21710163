package com.multiplatform;


public class Bookcase  {
    private String color;
    private String model;

    public Bookcase(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void theBookcase(){
        System.out.println("BookCase Detail");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
