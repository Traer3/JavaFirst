package com.hillel.classwork.lesson8.ReLearnAgain;

public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6};
        int result = sumArray(numbers);
        System.out.println(result);
    }

    public static int sumArray(int[] numbers) {
        int sumResult = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumResult += numbers[i];

        }
        return sumResult;
    }
}
