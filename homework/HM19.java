package com.hillel.classwork.lesson9.ReLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HM19 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Сколько чисел вы хотите ввести?  ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];
        numbersInput(numbers);


        bubbleSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    swap(numbers, i, j);
                }
            }
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[j];
        numbers[j] = numbers[i];
        numbers[i] = temp;
    }
    private static int numbersInput(int[] numbers) throws IOException {

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println("Введите " + (i + 1) + " число ");
                numbers[i] = Integer.parseInt(READER.readLine());
                index = numbers[i];
                return index;
            } catch (Exception exception) {
                System.out.println("Error: " + exception.getMessage());
                return numbersInput(numbers);
            }
        }

        return index;
    }
    }

}
