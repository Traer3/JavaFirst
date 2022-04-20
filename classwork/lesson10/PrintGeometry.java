package com.hillel.classwork.lesson10;

public class PrintGeometry {
    public static void main(String[] args) {
        //triangle();
        System.out.println();
        //square();
        triangleButBeater();
        System.out.println();
        squareButBeater();
    }

    //O(1)
    private static void triangleButBeater() {
        String str = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            str = str + "*";
        }
    }

    //O(1)
    private static void squareButBeater() {
        String str = "*  ";
        for (int i = 0; i <= 100; i++) {
            if (i % 10 != 0) {
                System.out.print(str);
            } else {
                System.out.println();
            }
        }
    }

    //O(n^2)
    private static void square() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    //O(n^2)
    private static void triangle() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }
}
