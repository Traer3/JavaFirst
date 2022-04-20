package com.hillel.classwork.lesson10;

import com.hillel.classwork.lesson4.RElern.Methods;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Methods.generateRandom(1,10);
                System.out.print("(" + (i+1) + ", " + (j+1) + "): has value " + array[i][j] + "; ");
            }
            System.out.println();
        }

    }
}
