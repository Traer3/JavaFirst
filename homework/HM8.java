package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Выбирите тип сумки ");
        System.out.println("Введите 1 , если вы хотите выбрать чемодан");
        System.out.println("Введите 2 , если вы хотите выбрать рюкзак");

        int SelectingBagType = Integer.parseInt(reader.readLine());
        System.out.println("Введите пожалуйста параметры вашей сумки");
        System.out.println("Длина");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Ширина");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Высота");
        int height = Integer.parseInt(reader.readLine());

        bagType(SelectingBagType, length, width, height);

    }

    private static void bagType(int SelectingBagType, int length, int widt, int height) {
        switch (SelectingBagType) {
            case 1:
                if (length > 40 && widt > 22 && height > 53) {
                    System.out.println("Ваш чемодан слишком большой ");
                } else {
                    System.out.println("Пройдите дальше");
                }
                break;
            case 2:
                if (length > 55 && widt > 20 && height > 40) {
                    System.out.println("Ваш рюкзак слишком большой");
                } else {
                    System.out.println("Пройдите дальше");
                }
                break;
        }
    }
}