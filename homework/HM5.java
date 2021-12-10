package com.hillel.homework;

import java.util.Scanner;

public class HM5 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float abs = Math.abs(a - b);
        float prePow =  (a + b);
        int pow = (int) Math.pow(prePow, 3);
        float divide = (abs / pow);

        double square = Math.sqrt(c);
        System.out.println("i never like math = " + (divide - square));



    }

}
