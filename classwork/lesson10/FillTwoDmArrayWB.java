package com.hillel.classwork.lesson10;

public class FillTwoDmArrayWB {
    public static void main(String[] args) {
        String[][] numbers = new String[5][5];

        //fitsMethod(numbers);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j){
                    numbers[i][j] = "W";
                }else {
                    numbers[i][j] = "B";
                }
                System.out.print(numbers[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
