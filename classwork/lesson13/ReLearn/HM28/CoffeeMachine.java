package com.hillel.classwork.lesson13.ReLearn.HM28;

import com.hillel.classwork.lesson8.ReLearnAgain.TryCatch;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    public static void main(String[] args) {

        List<HotDrink> hotDrinks = new ArrayList<>();

        System.out.println("Что вы хотите заказать");
        menu();
        customerOrder(hotDrinks);


        for (HotDrink hotDrink : hotDrinks) {
            hotDrink.cooking();
        }
        System.out.println("Стоимость заказа " + HotDrink.getCOST());
    }

    private static void customerOrder(List<HotDrink> hotDrinks) {

        int order = TryCatch.intOnly();
        if (order == 1) {
            hotDrinks.add(new Coffee(10));
        } else if (order == 2) {
            hotDrinks.add(new Coffee(12));
        } else if (order == 3) {
            hotDrinks.add(new Coffee(13));
        } else if (order == 4) {
            hotDrinks.add(new Tea(5));
        }

        System.out.println("Хотите ещё заказать ? " + "Нажмите 1" + "\n" + "Хотите завершить заказ нажмите 2");

        int choice = TryCatch.intOnly();
        if (choice == 1) {
            menu();
            customerOrder(hotDrinks);
        } else {
            System.out.println("Спасибо за заказ");
        }
    }

    private static void menu() {
        System.out.println("Нажмите 1 , если хотите заказать Латте" + "\n" + "Нажмите 2 , если хотите заказать Американо" + "\n" + "Нажмите 3 , если хотите заказать Капучино" + "\n" + "Нажмите 4 , если хотите заказать Чай" + "\n");
    }
}
