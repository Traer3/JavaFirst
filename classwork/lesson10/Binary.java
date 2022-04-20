package com.hillel.classwork.lesson10;

public class Binary {
    public static void main(String[] args) {

        int number = 45;
        System.out.println(number + " в двоичное " + Integer.toBinaryString(number));

        int result = ~number;
        System.out.println(result + " в двоичное " + Integer.toBinaryString(result));

        int i = 56;
        System.out.println(i + " в двоичное " + Integer.toBinaryString(i));
        int and = number & i;
        System.out.println(and + "  " + Integer.toBinaryString(and));
    }
}
