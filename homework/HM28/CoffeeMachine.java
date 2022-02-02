package com.hillel.homework.HM28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CoffeeMachine {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Выберите тип напитка");
        System.out.println("Нажмите 1 , если вы хотите чай");
        System.out.println("Нажмите 2 , если вы хотите кофе");
        System.out.println("Нажмите 3 , если вы хотите разное");
        int drinkType = Integer.parseInt(READER.readLine());

        switch (drinkType) {
            case 1:
                Teas.сhoosingTeas();
                cookingTime();
                break;
            case 2:
                Coffees.сhoosingCoffee();
                cookingTime();
                break;
            case 3:
                Others.сhoosingOthers();
                cookingTime();
                break;
        }

    }

    private static void cookingTime() throws InterruptedException {
        System.out.println("Подождите 10 секунд готовится");
        Thread.sleep(10000);
        System.out.println("Готово возьмите ваш напиток!");
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
