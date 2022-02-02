package com.hillel.homework.HM28;

import java.io.IOException;

public class Coffees extends CoffeeMachine {
    static int americano = 15;
    static int latte = 14;
    static int cappuccino = 18;

    static int coffeeInDrinks = 22;
    static int hotWater = 70;
    static int milkFoam = 0;
    static int milk = 0;


    public static void сhoosingCoffee() throws IOException {
        System.out.println("Какое вы хотите кофе?");
        System.out.println("Нажмите 1 , если вы хотите Американо");
        System.out.println("Нажмите 2 , если вы хотите Лате");
        System.out.println("Нажмите 3 , если вы хотите Капучино");

        int coffeeType = Integer.parseInt(READER.readLine());

        switch (coffeeType) {
            case 1:
                System.out.println("Ваш напиток будет стоить " + americano + " грн");
                System.out.println("Вы выбрали американо, сколько хотите добавить сахара?");
                sugarQuantity();
                System.out.println("Напиток будет состоять из " + hotWater + " мл Воды и " + coffeeInDrinks + " г. кофе");
                break;

            case 2:
                milkFoam += 20;
                milk += 170;
                System.out.println("Ваш напиток будет стоить " + latte + " грн");
                System.out.println("Вы выбрали лате, сколько хотите добавить сахара?");
                sugarQuantity();
                System.out.println("Напиток будет состоять из " + milkFoam + " % молочной пены и  " + milk + " мл. молока и " + coffeeInDrinks + " г. кофе");
                break;
            case 3:
                milkFoam += 30;
                milk += 200;
                System.out.println("Ваш напиток будет стоить " + cappuccino + " грн");
                System.out.println("Вы выбрали капучино, сколько хотите добавить сахара?");
                sugarQuantity();
                System.out.println("Напиток будет состоять из " + milkFoam + " % молочной пены и  " + milk + " мл. молока и " + coffeeInDrinks + " г. кофе");

                break;
        }

    }

}
