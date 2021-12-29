package com.hillel.homework;


import java.util.Random;

public class HM11 {
    public static void main(String[] args) {

        int firstNumber = randomNumber();
        int secondNumber = randomNumber();
        int thirdNumber = randomNumber();

        int answer = sortRandomNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println("Минимальное : " + answer);

    }

    static int randomNumber() {
        Random generator = new Random();

        int randomInt = generator.nextInt(10);

        return randomInt;
    }

    static int sortRandomNumber(int firstNumber, int secondNumber, int thirdNumber) {


        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;


        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;


        } else {
            return thirdNumber;
           

        }


    }


}

