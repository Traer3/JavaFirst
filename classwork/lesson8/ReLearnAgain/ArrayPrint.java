package com.hillel.classwork.lesson8.ReLearnAgain;

public class ArrayPrint {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }

        System.out.print("1");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("," + numbers[i]);
        }
    }
}
