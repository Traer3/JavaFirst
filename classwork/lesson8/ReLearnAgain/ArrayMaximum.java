package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;

public class ArrayMaximum {
    public static void main(String[] args) {
        byte[] numbers = new byte[8];
        byte maximum = 0;

        for (byte i = 0; i < numbers.length; i++) {
            numbers[i] = (byte) Methods.generateRandom(1, 10);
            System.out.println(numbers[i]);
        }
        for (byte number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println("Максимальное значение");
        System.out.println(maximum);

    }
}
