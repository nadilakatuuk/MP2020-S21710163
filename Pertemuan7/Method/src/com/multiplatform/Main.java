package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	printMessage ("Jhon");
	int res = addittion (0 ,0);
        System.out.println("Result = " + res);

    }
    public static  void printMessage(String name){
        System.out.println("Hello " + name);
    }
    public static int addittion(int a, int b){
        if(a == 0 && b == 0){
            return -1;
        }
        int result = a+b;
        return result;
    }
}
