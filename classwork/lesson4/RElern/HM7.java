package com.hillel.classwork.lesson4.RElern;

public class HM7 {
    public static void main(String[] args) {

        byte dog = 24;
        byte cat = 8;
        byte animalFood = 50;
        byte animalFoodCost = 2;
        byte animalFeedingPerDay = 3;
        byte daysInMonth = 31;

        int amountCatFootPerMonth = amountAnimalFootPerMonth(cat, animalFood, animalFeedingPerDay, daysInMonth);
        int amountDogFootPerMonth = amountAnimalFootPerMonth(dog, animalFood, animalFeedingPerDay, daysInMonth);

        System.out.println("Сколько нужно корма для котов в месяц: " + amountCatFootPerMonth);
        System.out.println("Сколько нужно корма для собак в месяц: " + amountDogFootPerMonth);
        System.out.println("Сколько нужно денег в месяц на содержание приюта: " + amountMoneyPerMonth(animalFoodCost, amountCatFootPerMonth, amountDogFootPerMonth));
    }

    private static int amountMoneyPerMonth(byte animalFoodCost, int amountCatFootPerMonth, int amountDogFootPerMonth) {
        return amountCatFootPerMonth + amountDogFootPerMonth * animalFoodCost;
    }

    private static int amountAnimalFootPerMonth(byte cat, byte animalFood, byte animalFeedingPerDay, byte daysInMonth) {
        return animalFood * animalFeedingPerDay * daysInMonth * cat;
    }
}
