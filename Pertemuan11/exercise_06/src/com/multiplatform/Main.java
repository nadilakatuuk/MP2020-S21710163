package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        Number SimpleCalculator = new Number();
       SimpleCalculator.setFirstNumber(5.0);
        SimpleCalculator.setSecondNumber(4);
        System.out.println("add= " + SimpleCalculator.getAdditionResult());
        System.out.println("subtract= " + SimpleCalculator.getSubtractionResult());
        SimpleCalculator.setFirstNumber(5.25);
        SimpleCalculator.setSecondNumber(0);
        System.out.println("multiply= " + SimpleCalculator.getMultiplicationResult());
        System.out.println("divide= " + SimpleCalculator.getDivisionResult());
    }
}
