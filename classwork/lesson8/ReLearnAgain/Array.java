package com.hillel.classwork.lesson8.ReLearnAgain;



public class Array {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int num = numbers[0];
        System.out.println(num);
        System.out.println(numbers[3]);
        numbers[3] = 500;
        System.out.println(numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите значение индекса");
            numbers[i] = TryCatch.intOnly();


        }
        printArray(numbers);
    }

    private static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i+1) + " index " + numbers[i]);
        }

    }
}
