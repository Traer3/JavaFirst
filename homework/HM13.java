package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HM13 {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Random generator = new Random();
        int mysteryNumber = generator.nextInt(0, 10);


        String randomNumber=String.valueOf(mysteryNumber);
        System.out.println("Введите случайное число в диапазоне от 1 до 10");
        String input = READER.readLine();



        while(!input.equalsIgnoreCase(randomNumber)) {

            Integer random=Integer.valueOf(randomNumber);
            Integer number= Integer.valueOf(input);
            if (random > number){
                System.out.println("Мало");
            }
            if (random < number){
                System.out.println("Много");
            }

            System.out.println("Вы ввели : " + input);
            input = READER.readLine();
        }
    }
}
