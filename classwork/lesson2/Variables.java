package com.hillel.classwork.lesson2;

public class Variables {

    public static void main(String[] args) {

        byte myByte = 101;
        System.out.println("this is byte: " +myByte);

        short myShort = 30000;
        System.out.println("this is short: "+myShort);

        int result = myByte + myShort;
        System.out.println("this is int: " + result);

        int myInt = 345678190;
        System.out.println(myInt);

        long myLong = 100_000_000_000L;
        System.out.println(myLong);

        float myFloat = 45.743F;
        System.out.println(myFloat);

        double myDouble = 234123412341234.1234123412341234;
        System.out.println(myDouble);

        boolean isValid = false;
        System.out.println(isValid);

        char myChar = '#';
        System.out.println(myChar);

        char myNumericChar = 12344;
        System.out.println(myNumericChar);

        char ch3 = '\u0054';
        System.out.println(myChar);


        String string = "test";
        System.out.println("this is string: " + string);


    }
}
