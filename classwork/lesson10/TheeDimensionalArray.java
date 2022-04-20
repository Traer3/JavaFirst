package com.hillel.classwork.lesson10;



public class TheeDimensionalArray {
    public static void main(String[] args) {
        boolean[][][] array = new boolean[4][10][5];
        array[0][3][2] = true;
        for (int i = 0; i < array.length; i++) {

            System.out.println("Уровень"+i);

            for (int j = 0; j < array[i].length; j++) {

                for (int k = 0; k < array[i][j].length; k++) {

                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
