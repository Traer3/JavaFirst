package com.hillel.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HM18 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        System.out.println("Введите длину первого случайного масива ");
        System.out.println();
        int[] first = arrayLength();
        System.out.println("Введите длину второй масива чисел");
        System.out.println();
        int[] second = arrayLength();

        arrayRandom(first);
        arrayFill(second);


        bubbleSort(first);
        bubbleSort(second);

        overlap(first, second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }

    private static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    swap(numbers, i, j);
                }
            }
        return numbers;
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[j];
        numbers[j] = numbers[i];
        numbers[i] = temp;
    }

    private static void overlap(int[] first, int[] second) {

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                System.out.println("совпали элементы " + first[i] + " и " + second[i]);
            }

        }
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
    public static void arrayFill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите значение для  " + (i+1) + " элемента ");
            try {
                numbers[i] = Integer.parseInt(READER.readLine());
            } catch (Exception e) {
                System.out.println("Ошибка введите значения еще раз");
                arrayFill(numbers);
            }

        }
    }

    public static void arrayRandom(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = mathRandom();
        }
    }

    public static int mathRandom() {
        double random = Math.random();
        int r = (int) (10 + random * 50);
        return r;
    }
}
