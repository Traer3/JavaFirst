package com.hillel.classwork.lesson10;

public class Fill2dArray {
    public static void main(String[] args) {

        int[][] numbers = new int[5][5];

        //fitsMethod(numbers);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i][i] = 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j){
                    numbers[i][j] = 1;
                }
                System.out.print(numbers[i][j] + "  ");
            }
            System.out.println();
        }

    }

    private static void fitsMethod(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i][i] = 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
