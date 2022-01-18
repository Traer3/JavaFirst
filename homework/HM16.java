package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM16 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите общую длину масива ");
        int[] numbersAmount = new int[Integer.parseInt(READER.readLine())];
        System.out.println("Введите первую длину масива ");
        int[] firstHalf = new int [Integer.parseInt(READER.readLine())];
        System.out.println("Введите вторую длину масива ");
        int[] secondHalf = new int [Integer.parseInt(READER.readLine())];

        int firstHalfIncrease = 0;
        int secondHalfIncrease = 0;

        separateInTwo(numbersAmount, firstHalf, secondHalf, firstHalfIncrease, secondHalfIncrease);

        printTwoHalf(firstHalf, secondHalf);

    }

    private static void separateInTwo(int[] numbersAmount, int[] firstHalf, int[] secondHalf, int firstHalfIncrease, int secondHalfIncrease) throws IOException {
        for (int i = 0; i < numbersAmount.length; i++) {
            System.out.println("Введите значение для  " + (i+1) + " элемента ");
            numbersAmount[i] = Integer.parseInt(READER.readLine());
            if (i < firstHalf.length){
                firstHalf[firstHalfIncrease] = numbersAmount[i];
                firstHalfIncrease++;
            }else {
                secondHalf[secondHalfIncrease] = numbersAmount[i];
                secondHalfIncrease++;
            }

        }
    }
    private static void printTwoHalf(int[] firstHalf, int[] secondHalf) {
        for (int i = 0; i < firstHalf.length ; i++) {
            System.out.println("Первоя половина масива: " + firstHalf[i]);

        }
        for (int i = 0; i < secondHalf.length; i++) {
            System.out.println("Вторая половина масива:  " + secondHalf[i]);

        }
    }
}
