package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	Bed Queensize = new Bed ("Red", 160);
	Bookcase Bigland = new Bookcase("Brown","with Pc Desk");
	Chair Napoli = new Chair("blue","Office Chair");
	Wardrobe Almari = new Wardrobe("Brown","3 Door",160);



	Room myDreamRoom= new Room("Queensize","Bigland","Napoli","Almari");
	myDreamRoom.inRoom("Dila room");
    }
}
