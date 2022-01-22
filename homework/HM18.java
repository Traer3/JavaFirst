package com.hillel.homework;

import java.util.Arrays;

public class HM18 {
    public static void main(String[] args) {

        int[] first = {5, 6, 7, 8, 9, 1, 2, 3,};
        int[] second = {7, 5, 3, 8, 7, 8, 3, 0};


        for (int i = 0; i < first.length; i++)
            for (int j = 0; j < first.length; j++) {
                if (first[j] > first[i]) {
                    int temp = first[j];
                    first[j] = first[i];
                    first[i] = temp;
                }
            }

        for (int i = 0; i < second.length; i++)
            for (int j = 0; j < second.length; j++) {
                if (second[j] > second[i]) {
                    int temp = second[j];
                    second[j] = second[i];
                    second[i] = temp;
                }
            }

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if(first[i] == second[i]);
                System.out.println("Элемент = " + i);
            }





        }





        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }

}
