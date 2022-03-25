package com.hillel.classwork.lesson7.RElern;

public class WashCar {
    public static void main(String[] args) throws InterruptedException {
        int dirtyCars = 10;
        while (true) {
            System.out.println("Насколько грязный транспорт: " + dirtyCars + "/10");
            dirtyCars--;
            Thread.sleep(1000);

            if (dirtyCars == 0) {
                System.out.println("Транспорт чист");
                break;
            }
            if (dirtyCars >= 5) {
                washCar();
            } else {
                dryCar();
            }


        }
    }

    private static void dryCar() {
        System.out.println("Сушим машину");
    }

    private static void washCar() {
        System.out.println("Используем мыло ");
    }

}
