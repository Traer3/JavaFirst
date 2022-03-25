package com.hillel.classwork.lesson7.RElern;

import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;

public class TimeToChoose {
    public static void main(String[] args) throws IOException {

        System.out.println("Время сделать выбор или убежать");
        String quit = "";
        while (!quit.equalsIgnoreCase("убежать")) {

            System.out.println("Выберите одно из трех действий");
            quit = HM8.READER.readLine();
            if (quit.equalsIgnoreCase("убежать")) {
                break;
            }
            System.out.println(offerChoice(quit));

        }
    }

    private static String offerChoice(String choose) throws IOException {

        switch (choose) {
            case "1":
                return choose = "Действие 1";
            case "2":
                return choose = "Действие 2";
            case "3":
                return choose = "Действие 3";
            default:
                return choose = "Попытайтесь ещё";
        }

    }
}
