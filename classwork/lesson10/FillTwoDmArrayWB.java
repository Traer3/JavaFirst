package com.hillel.classwork.lesson10;

import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;

public class FillTwoDmArrayWB {
    public static void main(String[] args) throws IOException {
        String[][] numbers = new String[8][8];

        System.out.println("Выберите два цвета для шахматной доски");
        System.out.println("Введите первый цвет");
        String firstColor = HM8.READER.readLine();
        System.out.println("Введите второй цвет");
        String secondColor = HM8.READER.readLine();

         firstMethod(numbers,firstColor,secondColor);
        System.out.println();


        for (int i = 0; i < 8; i++) {
            if(i % 2 == 0){
                color(firstColor,secondColor);
                System.out.println();
            }else {
                color(secondColor,firstColor);
                System.out.println();
            }
        }


    }

    private static void color(String firstColor, String secondColor) {
        for (int i = 0; i < 5; i++) {
            if (i % 8 != 0) {
                System.out.print(" "+firstColor + " " + secondColor);
            }
        }
    }

    private static void firstMethod(String[][] numbers,String firstColor, String secondColor) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length/2; j++) {
                if (i % 2 == 0) {
                    numbers[i][j] = " "+firstColor + " " + secondColor;
                } else {
                    numbers[i][j] = " "+secondColor + " " + firstColor;
                }
                System.out.print(numbers[i][j]);
            }

            System.out.println();
        }
    }
}
