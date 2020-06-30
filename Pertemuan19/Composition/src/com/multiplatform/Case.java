package com.multiplatform;

public class Case {
    private  String model;
    private  String manufacture;
    private String powerSupply;

    public Case(String model, String manufacture, String powerSupply) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
    }
public  void  pressPowerButton(){
    System.out.println("Power Button On");
}
    public String getModel() {

        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getPowerSupply() {
        return powerSupply;
    }
}
