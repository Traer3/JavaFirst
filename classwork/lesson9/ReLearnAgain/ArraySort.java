package com.hillel.classwork.lesson9.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Methods.generateRandom(1, 10);
        }

        long start = System.currentTimeMillis();
        // bubbleSort(numbers);
         Arrays.sort(numbers);
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(numbers));
        System.out.println("Время :" + (end - start));
        //private static void bubbleSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}
