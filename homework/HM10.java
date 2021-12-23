package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM10 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int num1 = numbers();

        System.out.println("Введите операцию : ");

        char operation = READER.readLine().charAt(0);

        int num2 = numbers();

        int result = numbersCalculation(num1, operation, num2);
        System.out.println("Результат = " + result);


    }

    private static Integer numbers() {
        try {
            System.out.println("Введите первое значение : ");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return numbers();
        }
    }


    static int numbersCalculation(int num1, char operation, int num2) throws IOException {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                operation = READER.readLine().charAt(0);
                result = numbersCalculation(num1, operation, num2);
        }
        return result;
    }
}
