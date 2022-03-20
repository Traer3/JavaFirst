package com.hillel.classwork.lesson5.RElern;

import java.io.IOException;

public class IfElse {
    public static void main(String[] args) throws IOException {

        System.out.println("Input number");
        int number = Integer.parseInt(HM8.READER.readLine());
        System.out.println("number: "+ number);

        if(number > 100){
            System.out.println("больше чем 100");
        }

        if (number > 20 && number < 30){
            System.out.println("Ваше число между 20 и 30");
        }else if (number > 10 && number < 20) {
            System.out.println("Ваше число между 10 и 30");
        }else if (number > 0 && number < 10) {
            System.out.println("Ваше число между 1 и 10");
        }else if (number <= 0){
            System.out.println("Ваше число меньше либо равно 0");
        }else {
            System.out.println("Ваше число больше 30");
        }


    }
}
