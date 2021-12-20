package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое значение : ");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите операцию : ");
        String operation = reader.readLine();
        System.out.println("Введите второе значение : ");
        int number2 = Integer.parseInt(reader.readLine());
        int result = numbersCalculation(number1, operation, number2);
        System.out.println("Результат = " + result);


    }

    static int numbersCalculation(int number1, String operation, int number2) {
        int result;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = numbersCalculation(number1, operation, number2);
        }
        return result;
    }
}
