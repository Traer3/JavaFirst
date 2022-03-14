package com.hillel.classwork.lesson6.RElern;

public class HM11 {
    public static void main(String[] args) {

        short firstRandomNumber = shortRandom();
        short secondRandomNumber = shortRandom();
        short thirdRandomNumber = shortRandom();

        System.out.println("Случайные числа: " + firstRandomNumber + " " + secondRandomNumber + " " + thirdRandomNumber);

        minRandomNumber(firstRandomNumber, secondRandomNumber, thirdRandomNumber);

    }

    private static void minRandomNumber(short rn1, short rn2, short rn3) {
        short minRN;
        if (rn1 < rn2 && rn1 < rn3) {
            minRN = rn1;
        } else if (rn2 < rn1 && rn2 < rn3) {
            minRN = rn2;
        } else {
            minRN = rn3;
        }
        System.out.println("Минимальное случайное число: " + minRN);
    }

    public static short shortRandom() {
        return (short) (Math.random() * 100);
    }
}
