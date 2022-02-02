package com.hillel.homework.HM28;

import java.io.IOException;

public class Teas extends CoffeeMachine {

    public static void ChoosingTeas() throws IOException {
        System.out.println("какой вы хотите чай?");
        System.out.println("Нажмите 1 , если вы хотите Травяной");
        System.out.println("Нажмите 2 , если вы хотите Зеленый");
        System.out.println("Нажмите 3 , если вы хотите Черный");
        int teasType = Integer.parseInt(READER.readLine());
        switch (teasType) {
            case 1:
                System.out.println("Вы выбрали травяной, сколько хотите добавить сахара?");
                sugarQuantity();

                break;
            case 2:
                System.out.println("Зеленый");
                sugarQuantity();
                break;
            case 3:
                System.out.println("Черный");
                sugarQuantity();
                break;
        }
    }

    public static void sugarQuantity() throws IOException {
        System.out.println("Введите количество от 1 до 10 стиков или введите 0 , если без сахара");
        int sugar = Integer.parseInt(READER.readLine());
        if (sugar >= 10) {
            System.out.println("Очень сладкий");
        } else if (sugar == 0) {
            System.out.println("Без сахара");
        }
    }
}
