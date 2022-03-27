package com.hillel.classwork.lesson8.ReLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work2 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите количество подозреваемых ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

        arrayFill(numbers);

        arrayPrint(numbers);

    }
    public static void arrayFill(int[] numbers) throws IOException {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите процент вероятности для  " + (i+1) + " подозреваемого ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }
    }
    public static void arrayPrint(int[] numbers){
        int index = 0;
        int max = numbers[index];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("№" + index+" убил человека у него вероятность: "  + max + "%");

    }
}
