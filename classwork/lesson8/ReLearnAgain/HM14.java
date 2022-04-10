package com.hillel.classwork.lesson8.ReLearnAgain;

public class HM14 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите значение для " + (i+1) + " ячейки");
            numbers[i] = TryCatch.intOnly();
        }
        boolean successively = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] <= numbers[i+1]) {
                successively = true;
            }else {
                successively = false;
                break;
            }
        }
        System.out.println("Последовательность строго возрастающая " + successively);
    }
}
