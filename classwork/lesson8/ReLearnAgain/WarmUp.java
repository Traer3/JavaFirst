package com.hillel.classwork.lesson8.ReLearnAgain;

public class WarmUp {
    public static void main(String[] args) {

        String square = "*";
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(square);
            }
        }
        System.out.println();
        String rightTriangle = "#";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(rightTriangle);
            }
            System.out.println();
        }
    }
}
