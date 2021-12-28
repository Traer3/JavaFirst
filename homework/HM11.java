package com.hillel.homework;

import java.util.Random;

public class HM11 {
    public static void main(String[] args) {
        Random generator = new Random();
        int lowNumber = generator.nextInt(1, 10);
        int highNumber = lowNumber;


        RandomNumbers(lowNumber, highNumber, generator);

    }

    static void RandomNumbers(int lowNumber, int highNumber, Random generator) {
        int i;
        for (i = 0; i < 3; i++) {
            int randomInt = generator.nextInt(1, 10);
            if (randomInt < lowNumber) {
                lowNumber = randomInt;
            }
            if (randomInt > highNumber) {
                highNumber = randomInt;
            }

        }
        System.out.println("Минимальное число: " + lowNumber + " Максимальное число : " + highNumber);
        System.out.println();
        System.out.println("Минимальное число: " + lowNumber);

    }

}
