package com.hillel.classwork.lesson4.RElern;

public class Methods {
    public static void main(String[] args) {

        printMessage();

        int number = generateRandom();
        System.out.println(number);

        int randomInt = generateRandom(1,10);
        System.out.println(randomInt);
    }

    public static void printMessage() {
        System.out.println("Message");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int generateRandom() {
        return (int) (Math.random() * 100);
    }

    public static int generateRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
