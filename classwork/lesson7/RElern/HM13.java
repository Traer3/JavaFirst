package com.hillel.classwork.lesson7.RElern;

import com.hillel.classwork.lesson4.RElern.Methods;
import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;

public class HM13 {
    public static void main(String[] args) throws IOException {

        System.out.println("Используя While");
        System.out.println();
        usingWhile();
        System.out.println("Используя For");
        System.out.println();
        usingFor();
        System.out.println("Используя Do While");
        System.out.println();
        usingDoWhile();


    }

    private static void usingDoWhile() throws IOException {
        byte randomNumber = (byte) Methods.generateRandom(1, 10);
        byte guessNumber = 0;
        System.out.println("Угадайте число! ");
        do {
            guessNumber = Byte.parseByte(HM8.READER.readLine());
            if (guessNumber > randomNumber) {
                System.out.println("Горячо");
            } else if (guessNumber < randomNumber) {
                System.out.println("Холодно");
            } else {
                System.out.println("Угадал");
            }

        } while (guessNumber != randomNumber);
    }

    private static void usingFor() throws IOException {
        byte randomNumber = (byte) Methods.generateRandom(1, 10);
        byte guessNumber = 0;
        System.out.println("Угадайте число! ");
        for (int i = 0; i < 10; i++) {
            guessNumber = Byte.parseByte(HM8.READER.readLine());
            if (guessNumber > randomNumber) {
                System.out.println("Горячо");
            } else if (guessNumber < randomNumber) {
                System.out.println("Холодно");
            } else {
                System.out.println("Угадал");
                break;
            }

        }
    }

    private static void usingWhile() throws IOException {
        byte randomNumber = (byte) Methods.generateRandom(1, 10);
        byte guessNumber = 0;
        System.out.println("Угадайте число! ");
        while (guessNumber != randomNumber) {

            guessNumber = Byte.parseByte(HM8.READER.readLine());
            if (guessNumber > randomNumber) {
                System.out.println("Горячо");
            } else if (guessNumber < randomNumber) {
                System.out.println("Холодно");
            } else {
                System.out.println("Угадал");
            }


        }
    }
}
