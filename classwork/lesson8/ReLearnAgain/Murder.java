package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;


public class Murder {
    public static void main(String[] args) {

        byte[] bytes = new byte[10];
        byte highSuspicion = 0;
        byte highSuspicionNumber = 0;
        for (byte i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Methods.generateRandom(1, 10);
            if (bytes[i] >= highSuspicion) {
                highSuspicion = bytes[i];
                highSuspicionNumber = (i);
            }
        }

        System.out.println(highSuspicion + " " + (highSuspicionNumber + 1));
    }
}
