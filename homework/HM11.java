package com.hillel.homework;

import java.util.Random;

public class HM11 {
    public static void main(String[] args) {

        RandomNumbers();


    }
    static void RandomNumbers(){
        Random generator = new Random();
        int lowNumber = generator.nextInt(1, 10);
        int highNumber = lowNumber;
        int middleNumber = lowNumber;
        int i;
        for (i = 0; i < 3; i++) {
            int randomInt = generator.nextInt(1, 10);
            if (randomInt < lowNumber) {
                lowNumber = randomInt;
            }
            if (randomInt > highNumber) {
                highNumber = randomInt;
            }
            if (middleNumber < highNumber && middleNumber > lowNumber) {

            }

        }
        System.out.println("Минимальное число: " + lowNumber + " Среднее число: " + middleNumber + " Максимальное число : " + highNumber);
        System.out.println();
        System.out.println("Минимальное число: " + lowNumber);

    }

}
