package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM14 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Сколько чисел вы хотите ввести?  ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

        numbersInput(numbers);

        consecutiveNumbers(numbers);


    }

    private static void numbersInput(int[] numbers) throws IOException {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите " + (i + 1) + " число ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }
    }

    private static void consecutiveNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.println("Непоследовательно");
            }
            System.out.println("Последовательно");

        }
    }

}
