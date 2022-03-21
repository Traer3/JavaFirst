package com.hillel.classwork.lesson7.RElern;

import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;

public class WhileSum {
    public static void main(String[] args) throws IOException {

        System.out.println("Сумирует пока не напишешь Sum");
        String inputNumbers = HM8.READER.readLine();
        int sum = 0;
        while (!inputNumbers.equalsIgnoreCase("Sum")) {
            int i = Integer.parseInt(inputNumbers);
            sum += i;
            System.out.println("Введите значение: ");
            inputNumbers = HM8.READER.readLine();

        }
        System.out.println("Сума чисел: " + sum);

    }
}
