package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        int myValue =10000;

        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Overflow Max value = " + (myMaxIntValue + 1));
        System.out.println("Overflow Max value = " + (myMaxIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
    }
}
