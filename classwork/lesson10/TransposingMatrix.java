package com.hillel.classwork.lesson10;

import com.hillel.classwork.lesson4.RElern.Methods;

public class TransposingMatrix {
    public static void main(String[] args) {

        byte row = 3;
        byte column = 2;

        int[][] numbers = new int[row][column];


        fillRandom2DimArray(numbers,row,column);

        print2DArray(numbers,row,column);

        System.out.println();



        int[][] transposedMatrix = new int [column] [row];

        transposingMatrix(numbers,transposedMatrix,column,row);


    }

    public static void transposingMatrix(int[][] matrix, int[][] transposedMatrix,byte row,byte column) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposedMatrix[i][j] = matrix[j][i];
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void fillRandom2DimArray(int[][] numbers,byte row,byte column) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column ; j++) {
                numbers[i][j] = Methods.generateRandom(1, 10);
            }
        }

    }

    public static void print2DArray(int[][] numbers,byte row,byte column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }


}
