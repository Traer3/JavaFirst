package com.hillel.classwork.lesson7.RElern;

import com.hillel.classwork.lesson4.RElern.Methods;

public class BombRandomEnding {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println("До взрыва осталось: " + i);
            if (i == 0) {
                if (Methods.generateRandom(1, 10) <= 5) {
                    System.out.println("BOOM!");
                } else {
                    System.out.println("Бомба не взорвалась");
                }
            }
        }

    }
}
