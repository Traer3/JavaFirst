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

        switch (drinkType){
            case 1:
                Teas.ChoosingTeas();
                cookingTime();
                break;
            case 2:
                System.out.println("кофе");

        }
    }

    private static void cookingTime() throws InterruptedException {
        System.out.println("Подождите 10 секунд готовится");
        Thread.sleep(1000);
        System.out.println("Готово возьмите ваш напиток");
    }
}
