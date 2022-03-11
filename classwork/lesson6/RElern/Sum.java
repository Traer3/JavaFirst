package com.hillel.classwork.lesson6.RElern;


public class Sum {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 2;
        double result = sum(number1, number2);
        System.out.println(result);
        System.out.println(sum(50L, 20L));
        System.out.println(sum(6.1, 3.1));


    }


    public static double sum(int number1, int number2) {
        return (number1 + number2);
    }

    public static long sum(long number1, long number2) {
        return (number1 + number2);
    }

    public static double sum(double n1, double n2) {
        return (n1 + n2);
    }
}
