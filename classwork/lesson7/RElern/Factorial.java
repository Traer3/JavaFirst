package com.hillel.classwork.lesson7.RElern;

import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;

public class Factorial {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число: ");
        byte number = Byte.parseByte(HM8.READER.readLine());
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        System.out.println("Факториал вашего числа: " + factorial);
    }
}
