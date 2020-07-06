package com.multiplatform;

public class Room {
    private Bed theBed;
    private Bookcase  theBookcase;
    private Chair theChair;
    private Wardrobe theWardrobe;

    public Room(Bed theBed, Bookcase theBookcase, Chair theChair, Wardrobe theWardrobe) {
        this.theBed = theBed;
        this.theBookcase = theBookcase;
        this.theChair = theChair;
        this.theWardrobe = theWardrobe;
    }

    public Room(String queensize, String bigland, String napoli, String almari) {
    }


    public void inRoom(String theRoom){
        theBed.theBed();
        theBookcase.theBookcase();
        theChair.theChair();
        theWardrobe.theWardrobe();
    }
    public Bed getTheBed() {
        return theBed;
    }

    public Bookcase getTheBookcase() {
        return theBookcase;
    }

    public Chair getTheChair() {
        return theChair;
    }

    public Wardrobe getTheWardrobe() {
        return theWardrobe;
    }
}
