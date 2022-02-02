package com.hillel.homework.HM28;

import java.io.IOException;

public class Others extends  CoffeeMachine{
    static int hotWater = 5;
    static int hotChocolate = 20;
    static int cocoa = 15;

    static int hotWaterAmount = 200;
    static int hotChocolateAmount = 100;
    static int cocoaAmount = 100;


    public static void сhoosingOthers() throws IOException {
        System.out.println("Что вы хотите ? ");
        System.out.println("Нажмите 1 , если вы хотите Кипяток");
        System.out.println("Нажмите 2 , если вы хотите Горячий шоколад");
        System.out.println("Нажмите 3 , если вы хотите Какао");

        int othersType = Integer.parseInt(READER.readLine());

        switch (othersType) {
            case 1:
                System.out.println("Ваш напиток будет стоить " + hotWater + " грн");
                System.out.println("Вы выбрали кипяток, сколько хотите добавить сахара?");
                sugarQuantity();
                System.out.println("Напиток будет состоять из " + hotWaterAmount + " мл Воды");
                break;

            case 2:
                System.out.println("Ваш напиток будет стоить " + hotChocolate + " грн");
                System.out.println("Вы выбрали горячий шоколад, сколько хотите добавить сахара?");
                sugarQuantity();
                System.out.println("Напиток будет состоять из " + hotWaterAmount + " мл Воды и " + hotChocolateAmount + " гр." );
                break;
            case 3:
                System.out.println("Ваш напиток будет стоить " + cocoa + " грн");
                System.out.println("Вы выбрали какао, сколько хотите добавить сахара?");
                sugarQuantity();
                System.out.println("Напиток будет состоять из " + hotWaterAmount + " мл Воды и " + cocoaAmount + " гр." );
                break;
        }

    }
}
