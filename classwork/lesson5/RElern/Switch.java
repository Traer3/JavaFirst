package com.hillel.classwork.lesson5.RElern;


import java.io.IOException;


public class Switch {
    public static void main(String[] args) throws IOException {
        System.out.println("Input number");
        int number = Integer.parseInt(HM8.READER.readLine());
        System.out.println("number: " + number);

        printMonth(number);
        printSeason(number);
    }
    private static void printSeason(int number){
        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Введите число от 1 до 12");
        }
    }

    private static void printMonth(int number) {
        switch (number) {
            case 1:
                System.out.println("Янв");
                break;
            case 2:
                System.out.println("Фев");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апр");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Авг");
                break;
            case 9:
                System.out.println("Сен");
                break;
            case 10:
                System.out.println("Окт");
                break;
            case 11:
                System.out.println("Ноя");
                break;
            case 12:
                System.out.println("Дека");
                break;
            default:
                System.out.println("Введите число от 1 до 12");
        }

    }
}
