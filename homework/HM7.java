package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM7 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.println("Введите количество собак: ");
        String dogsAmount = reader.readLine();
        System.out.println("Введите количество котов: ");
        String catsAmount = reader.readLine();
        System.out.println("Сколько грамм в порции: ");
        String foodQuantity = reader.readLine();
        System.out.println("Введите количество приемов порций: ");
        String dailyFood = reader.readLine();
        System.out.println("Введите стоимость порций: ");
        String foodCost = reader.readLine();

        int dogs = Integer.parseInt(dogsAmount);
        int cats = Integer.parseInt(catsAmount);
        int moneyForFood = Integer.parseInt(foodCost);
        int onePortion = Integer.parseInt(foodQuantity);
        int amountPortions = Integer.parseInt(dailyFood);
        int dogsFoodPerMonth = animalFoodPerMonth(onePortion,amountPortions,dogs);
        int catsFoodPerMonth = animalFoodPerMonth(onePortion,amountPortions,cats);
        int animalShelterCostPerMonth = animalShelterCost(amountPortions,moneyForFood,dogs,cats);

        System.out.println("Сколько нужно купить корма для собак в граммах: " + dogsFoodPerMonth);
        System.out.println("Сколько нужно купить корма для котов в граммах: " + catsFoodPerMonth);
        System.out.println("Стоимость еды в месяц: " + animalShelterCostPerMonth + "$");


    }
    static int animalFoodPerMonth(int onePortion,int amountPortions, int animals){
        return ((onePortion * amountPortions) * 31)* animals;

    }
    static int animalShelterCost(int amountPortions ,int moneyForFood, int dogs ,int cats){
        return ((moneyForFood * amountPortions) * (dogs + cats) * 31) ;

    }
}
