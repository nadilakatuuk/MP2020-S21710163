package com.multiplatform;

public class Motherboard {
    private  String model;
    private  String manufacture;
    private int ramSlots;
    private  String bios;

    public Motherboard(String model, String manufacture, int ramSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}
