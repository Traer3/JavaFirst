package com.hillel.homework;

import java.util.Random;

public class HM11 {
    public static void main(String[] args) {

        int firstNumber = randomIntMethode();
        int secondNumber = randomIntMethode();
        int thirdNumber = randomIntMethode();

        randomNumber(firstNumber, secondNumber, thirdNumber);

    }

    static int randomIntMethode() {
        Random generator = new Random();

        int randomInt = generator.nextInt(1, 10);

        return randomInt;
    }

    static void randomNumber(int firstNumber, int secondNumber, int thirdNumber) {


        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            System.out.println("Минимальное : " + firstNumber);

        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            System.out.println("Минимальное : " + secondNumber);
        } else {
            System.out.println("Минимальное : " + thirdNumber);

        }


    }


}
