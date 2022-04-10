package com.hillel.classwork.lesson9.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Methods.generateRandom(1, 20);
        }
        System.out.println(Arrays.toString(numbers));
        int[] ints = Arrays.copyOf(numbers, 20);
        System.out.println(Arrays.toString(ints));
    }
}
