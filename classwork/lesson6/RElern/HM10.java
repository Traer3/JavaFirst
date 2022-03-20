package com.hillel.classwork.lesson6.RElern;


import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;


public class HM10 {
    public static void main(String[] args) throws IOException {


        System.out.println("Введите первое число: ");
        double number1 = correctNumber();
        System.out.println("Введите математическую операцию: ");
        String mathChar = HM8.READER.readLine();
        System.out.println("Введите второе число: ");
        double number2 = correctNumber();

        action(mathChar, number1, number2);
    }

    private static Double correctNumber() {

        try {
            String number = HM8.READER.readLine();
            return Double.parseDouble(number);
        } catch (Exception e) {
            System.out.println("Введите адекватное значение");
            return correctNumber();
        }
    }


    public static void action(String mathChar, double n1, double n2) throws IOException {


        switch (mathChar) {

            case "+":
                System.out.println("Ваш результат: " + sum(n1, n2));
                break;
            case "-":
                System.out.println("Ваш результат: " + minus(n1, n2));
                break;
            case "*":
                System.out.println("Ваш результат: " + multiply(n1, n2));
                break;
            case "/":
                System.out.println("Ваш результат: " + divide(n1, n2));
                break;

            default:
                System.out.println("Введите математическую операцию: ");
                String operation = HM8.READER.readLine();
                action(operation, n1, n2);
                break;
        }
    }

    //Математические операции
    private static double sum(double number1, double number2) {
        return number1 + number2;
    }

    private static double minus(double number1, double number2) {
        return number1 - number2;
    }

    private static double divide(double number1, double number2) {
        return number1 / number2;
    }

    private static double multiply(double number1, double number2) {
        return number1 * number2;
    }

}
