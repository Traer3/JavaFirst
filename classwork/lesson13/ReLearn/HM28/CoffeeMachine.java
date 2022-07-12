package com.hillel.classwork.lesson13.ReLearn.HM28;

import com.hillel.classwork.lesson5.RElern.HM8;
import com.hillel.classwork.lesson8.ReLearnAgain.TryCatch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine  {



    public void cook() {
        System.out.println(" Напиток готовится ");
    }







    public static void main(String[] args) throws IOException {
        List<CoffeeMachine> hotDrinks = new ArrayList<>();
        System.out.println("Если хотите кофе нажмите 1 " +"\n"+ "Если хотите чай  нажмите 2"+"\n"+"Если хотите завершить заказ нажмите 0");
        Integer choice = TryCatch.intOnly();


        while (choice != 0){
            if(choice == 1){
                System.out.println("Какое вы хотите кофе?" +"\n"+"Americano  "+"\n"+"Latte "+"\n"+"Cappuccino");
                System.out.println("Введите название");
                String type = HM8.READER.readLine();
                hotDrinks.add(new Coffee(type));
            }else if(choice==2){
                System.out.println("приготовить чай");
            }
        }
    }

}
