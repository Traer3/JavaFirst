package com.hillel.homework.HM28;

import java.io.IOException;

public class Teas extends CoffeeMachine {
    static int greenTeaCost = 10;
    static int herbalTea = 12;
    static int blackTea = 15;

    static int hotWater = 90;
    static int leafWeight = 10;


    public static void сhoosingTeas() throws IOException {
        System.out.println("Какой вы хотите чай?");
        System.out.println("Нажмите 1 , если вы хотите Травяной");
        System.out.println("Нажмите 2 , если вы хотите Зеленый");
        System.out.println("Нажмите 3 , если вы хотите Черный");

        int teasType = Integer.parseInt(READER.readLine());

        switch (teasType) {
            case 1:
                System.out.println("Ваш напиток будет стоить " + herbalTea + " грн");
                System.out.println("Вы выбрали травяной, сколько хотите добавить сахара?");
                sugarQuantity();
                cookingTea();
                break;

            case 2:
                System.out.println("Ваш напиток будет стоить " + greenTeaCost + " грн");
                System.out.println("Вы выбрали зеленый, сколько хотите добавить сахара?");
                sugarQuantity();
                cookingTea();
                break;
            case 3:
                System.out.println("Ваш напиток будет стоить " + blackTea + " грн");
                System.out.println("Вы выбрали черный, сколько хотите добавить сахара?");
                sugarQuantity();
                cookingTea();
                break;
        }

    }
    private static void cookingTea() {
        System.out.println("Напиток будет состоять из " + hotWater + " мл Воды и " + leafWeight + " г. листьев");
    }


}
