package com.hillel.classwork.lesson10;

public class FactorialN {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
    public static int factorial(int number){
        if(number == 1){
            return number;
        }
        return number * factorial(number-1);

    }
}
