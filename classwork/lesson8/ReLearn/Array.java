package com.hillel.classwork.lesson8.ReLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите длину масива ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

        arrayFill(numbers);

        arrayPrint(numbers);

    }
    public static void arrayFill(int[] numbers) throws IOException {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите значение для  " + i + " элемента ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }
    }
    public static void arrayPrint(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Значение : " + i + " элемента =  " + numbers[i]);

        }
    }

}

