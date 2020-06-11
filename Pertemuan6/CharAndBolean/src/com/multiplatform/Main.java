package com.multiplatform;

public class Main {

    public static void main(String[] args) {

        char myChar ='D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myOtherUnicodeChar = '\u00A9';
        System.out.println(myOtherUnicodeChar);

        boolean myFirstBoolean = true;
        boolean mySecondBoolean = false;
        boolean isLoggedIn = true;

        //string it's actually a class.
        //String is a sequence of charcters.

        String myString ="This is a string";
        System.out.println("My string : " + myString);
        myString = myString + ", this is more";
        System.out.println("My string : " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("My string : " + myString);

        String myNumberString = "50.25";
        System.out.println("40.75" + myNumberString);
        int myInt =10;
        myNumberString = myNumberString + myInt;
        System.out.println( myNumberString);




    }
}
