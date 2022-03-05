package com.hillel.classwork.lesson3.RElern;

public class JavaMath {
    public static void main(String[] args) {


        double Pi = Math.PI;
        System.out.println(Pi);

        System.out.println("Корень of Pi" + Math.sqrt(Pi));
        System.out.println("В степень BD programmer " + Math.pow(2, 8));

        float f1 = 45.47F;
        System.out.println("Округление " + Math.round(f1));
        System.out.println("Округление " + Math.round(45.87F));
        System.out.println();


        byte max = 50;
        byte min = -50;
        double random = Math.random();
        int intRandom = (int) (random * max);
        System.out.println("double random = " + random);
        System.out.println("int random = " + intRandom);

        int randomNumber = (int) (min + random * max);
        System.out.println("random in range : " + randomNumber);

        int randomNumberII = (int) ((random * (max - min) + min));
        System.out.println("random in range v2 : " + randomNumberII);

    }
}
