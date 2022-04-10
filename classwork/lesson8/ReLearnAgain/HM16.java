package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;


import java.util.Arrays;

public class HM16 {
    public static void main(String[] args) {
        System.out.println("Введите общею длину массива");
        int[] numbers = new int[TryCatch.intOnly()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Methods.generateRandom(1, 20);
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("Введите первую длину массива");
        int[] numbersFirstHalf = new int[TryCatch.intOnly()];
        System.out.println("Введите вторую длину массива");
        int[] numbersSecondHalf = new int[TryCatch.intOnly()];

        arraySeparator(numbers, numbersFirstHalf, numbersSecondHalf);

        System.out.println(Arrays.toString(numbersFirstHalf));
        System.out.println(Arrays.toString(numbersSecondHalf));

    }

    private static void arraySeparator(int[] numbers, int[] numbersFirstHalf, int[] numbersSecondHalf) {
        for (int i = 0; i < numbersFirstHalf.length; i++) {
            if(numbersFirstHalf.length >= i){
                numbersFirstHalf[i] += numbers[i];
            }
        }
        for (int i = 0; i < numbersSecondHalf.length; i++) {
            if(numbersSecondHalf.length >= i){
                numbersSecondHalf[i] += numbers[i+ numbersFirstHalf.length];
            }
        }
    }
}
