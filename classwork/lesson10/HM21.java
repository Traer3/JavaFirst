package com.hillel.classwork.lesson10;

import com.hillel.classwork.lesson4.RElern.Methods;


public class HM21 {
    public static void main(String[] args) {

        int[][] numbers = new int[3][3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length ; j++) {
                numbers[i][j] = Methods.generateRandom(-20, 10);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int temp = numbers[i][j];
                if(temp < 0) {
                    System.out.print("(" + (i+1) + ", " + (j+1) + "): has value " + numbers[i][j] + "; ");
                }else {
                   continue;
                }
            }
            System.out.println();
        }
    }
}
