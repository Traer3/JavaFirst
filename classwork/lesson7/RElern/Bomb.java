package com.hillel.classwork.lesson7.RElern;

public class Bomb {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 10; i >= 0; i--) {
            //System.out.println("До взрыва осталось " + i + " сек" );

        }
        //System.out.println("Boom!");

        int i = 10;
        do {
            System.out.println("До взрыва осталось " + i + " сек");
            Thread.sleep(1000);
            i--;
            if(i == 3) {
                break;
            }


        } while (i > 0);
        if (i == 0) {
            System.out.println("Boom!");
        }
        System.out.println("Я же говорил , только не зеленый");
    }
}
