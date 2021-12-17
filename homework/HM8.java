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

        int selectingBagType = Integer.parseInt(reader.readLine());
        System.out.println("Введите пожалуйста параметры вашей сумки");
        System.out.println("Длина");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Ширина");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Высота");
        int height = Integer.parseInt(reader.readLine());


        bagType(selectingBagType, length, width, height);

    }

    static boolean suitcase(int length, int width, int height) {
        if (length <= 40 && width <= 22 && height <= 53) {
            return true;
        } else {
            return false;
        }

    }

    static boolean backpack(int length, int width, int height) {
        if (length <= 55 && width <= 20 && height <= 40) {
            return true;
        } else {
            return false;
        }

    }




    private static void bagType(int selectingBagType, int length, int width, int height) {

        switch (selectingBagType) {
            case 1:

                suitcase(length, width, height);
                System.out.println("Можно пройти ?  " + suitcase(length, width, height));

                break;
            case 2:

                backpack(length, width, height);
                System.out.println("Можно пройти ?  " + backpack(length, width, height));

                break;
        }
    }


}
