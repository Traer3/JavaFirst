package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HM19 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] numbers = arrayLength();

        arrayFill(numbers);

        bubbleSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static int[] arrayLength() {
        try {
            System.out.println("Сколько чисел вы хотите ввести?  ");
            int[] numbers = new int[Integer.parseInt(READER.readLine())];
            return numbers;
        } catch (Exception e) {
            System.out.println("Ошибка введите значения еще раз");
            return arrayLength();
        }
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

    public static void arrayFill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите значение для  " + i + " элемента ");
            try {
                numbers[i] = Integer.parseInt(READER.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка введите значения еще раз");
                arrayFill(numbers);
            }

        }
    }

}
