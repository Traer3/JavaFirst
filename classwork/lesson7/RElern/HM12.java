package com.hillel.classwork.lesson7.RElern;

public class HM12 {
    public static void main(String[] args) {

        System.out.println("Используя Do While");
        System.out.println();
        usingDoWhile();
        System.out.println("Используя For");
        System.out.println();
        usingFor();
        System.out.println("Используя While");
        System.out.println();
        usingWhile();

    }

    private static void usingWhile() {
        int i = 0;
        while (i <= 100) {
            i++;
            if (i / 10 == 4 || i / 10 == 9) {
                continue;
            } else if (i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            System.out.println(i);
            if (i == 100) {
                break;
            }

        }
    }

    private static void usingFor() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 4 || i % 10 == 9) {
                continue;
            } else if (i / 10 == 4 || i / 10 == 9) {
                continue;
            }
            System.out.println(i);
        }
    }

    private static void usingDoWhile() {
        int i = 0;
        do {

            i++;
            if (i % 10 == 4 || i % 10 == 9) {
                continue;
            } else if (i / 10 == 4 || i / 10 == 9) {
                continue;
            }
            System.out.println("i= " + i);
            if (i == 100) {
                break;
            }

        } while (i <= 100);
    }
}
