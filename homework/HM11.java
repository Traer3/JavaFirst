package com.hillel.homework;

import java.util.Random;

public class HM11 {
    public static void main(String[] args) {

        Random generator = new Random();
        int min = generator.nextInt(0, 10);
        int max = min;
        int mid = min;
        int i;
        for (i = 0; i < 3; i++) {
            int randomInt = generator.nextInt(0, 10);
            if (randomInt < min) {
                min = randomInt;
            }
            if (randomInt > max) {
                max = randomInt;
            }
            if (mid < max && mid > min) {

            }

        }
        System.out.println("min: " + min + " mid: " + mid + " max: " + max);


    }

}
