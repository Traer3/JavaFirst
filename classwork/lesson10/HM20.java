package com.hillel.classwork.lesson10;

import com.hillel.classwork.lesson5.RElern.HM8;

public class HM20 {
    public static void main(String[] args) {
        System.out.println("Введите количество столбцов");
        byte tableRow = HM8.byteOnly(HM8.READER);
        System.out.println("Введите количество строк");
        byte tableColumn = HM8.byteOnly(HM8.READER);

        int[][] matrix = new int[tableRow][tableColumn];

        TransposingMatrix.fillRandom2DimArray(matrix,tableRow,tableColumn);

        TransposingMatrix.print2DArray(matrix,tableRow,tableColumn);

        System.out.println();

        int[][] transposedMatrix = new int[tableColumn][tableRow];

        TransposingMatrix.transposingMatrix(matrix,transposedMatrix,tableColumn,tableRow);


    }
}
