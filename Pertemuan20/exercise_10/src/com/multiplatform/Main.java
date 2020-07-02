package com.multiplatform;

public class Main {

    public static void main(String[] args) {

        //Pajero
        Car pajero=new Pajero("Pajero",3);
        pajero.startEngine();
        pajero.accelerate();
        pajero.brake();

        //Mercedes benz
        Car mercedesbenz =new MercedesBenz("Mercedes Benz",12);
        mercedesbenz.startEngine();
        mercedesbenz.accelerate();
        mercedesbenz.brake();

        //porsche
        Car porsche =new Porsche("Porsche",4);
        porsche.startEngine();
        porsche.accelerate();
        porsche.brake();
    }
}
