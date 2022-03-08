package com.hillel.classwork.lesson5.RElern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Выберите тип багажа");
        System.out.println("Введите 1 , если вы хотите выбрать сумку ");
        System.out.println("Введите 2 , если вы хотите выбрать рюкзак ");

        byte choice = byteOnly(reader);

        System.out.println("Введите длину: ");
        byte length = Byte.parseByte(reader.readLine());
        System.out.println("Введите ширину: ");
        byte width = Byte.parseByte(reader.readLine());
        System.out.println("Введите высоту: ");
        byte height = Byte.parseByte(reader.readLine());

        bagDefiner(choice, length, width, height);
    }

    private static byte byteOnly(BufferedReader reader) {
        byte choice = 0;
        try {
            choice = Byte.parseByte(reader.readLine());
        } catch (Exception e) {
            System.out.println("Введите 1 или 2 ");
            byteOnly(reader);
        }
        return choice;
    }

    private static void bagDefiner(byte choice, byte length, byte width, byte height) {
        switch (choice) {

            case 1:
                if (length <= 55 && width <= 20 && height <= 40) {
                    System.out.println("Ваша сумка подходит");
                } else {
                    System.out.println("Ваша сумка не подходит");
                }
                break;
            case 2:
                if (length <= 40 && width <= 22 && height <= 53) {
                    System.out.println("Ваш рюкзак подходит");
                } else {
                    System.out.println("Ваш рюкзак не подходит");
                }
                break;
            default:
                System.out.println("Введите адекватные данные ");
        }
    }
}
