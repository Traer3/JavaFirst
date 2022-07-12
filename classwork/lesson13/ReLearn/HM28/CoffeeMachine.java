package com.hillel.classwork.lesson13.ReLearn.HM28;

import com.hillel.classwork.lesson5.RElern.HM8;
import com.hillel.classwork.lesson8.ReLearnAgain.TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    public static void main(String[] args) throws IOException {

        // System.out.println("Добрый день , что вы хотите заказать ?");
        customerOrder(HM8.READER);

    }

    private static void customerOrder(BufferedReader reader) throws IOException {
        List<HotDrinks> drinks = new ArrayList<>();

        System.out.println("Americano стоит 10" + "\n" + "Latte стоит 15" + "\n" + "Cappuccino стоит 20" + "\n" + "Black tea стоит 5" + "\n");


        int chose = getChose();

        while (chose != 2) {
            System.out.println("Введите название напитка");
            String order = reader.readLine();

            switch (order) {
                case "Americano":
                    drinks.add(new Coffee("Americano"));
                    HotDrinks.COST += 10;
                    chose = getChose();
                    break;
                case "Latte":
                    drinks.add(new Coffee("Latte"));
                    HotDrinks.COST += 15;
                    chose = getChose();
                    break;
                case "Cappuccino":
                    drinks.add(new Coffee("Cappuccino"));
                    HotDrinks.COST += 20;
                    chose = getChose();
                    break;
                case "Black tea":
                    drinks.add(new Tea("Black tea"));
                    HotDrinks.COST += 5;
                    chose = getChose();
                    break;
            }
        }
        for (HotDrinks drink : drinks) {
            drink.cook();
        }
        System.out.println("Вы должны оплатить " + HotDrinks.COST);
    }

    private static int getChose() {
        System.out.println("Желаете заказать напиток? " + "\n" + "Нажмите 1 , что бы продолжить" + "\n" + "Нажмите 2 , что бы завершить");
        int chose = TryCatch.intOnly();
        return chose;

    }


}
