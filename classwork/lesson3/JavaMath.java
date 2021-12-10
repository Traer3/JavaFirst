package com.hillel.classwork.lesson3;

public class JavaMath {

    public static void main(String[] args) {

        //число ПИ
        System.out.println(Math.PI);

        System.out.println(Math.sqrt(Math.PI));
        System.out.println(Math.sqrt(9));

        //в степень
        System.out.println(Math.pow(2, 8));

        //округление
        float f1 = 45.123f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(45.84));

        double random = Math.random();
        System.out.println("random" + random);

        // int intRandom = (int) (random * 100);
        // System.out.println("random int " + intRandom);

        int max = 100;
        int intRandom = (int) (random * max);
        System.out.println("random int " + intRandom);

        int r = (int) (-50 +random * 100);
        System.out.println("random in range " + r);

        int min = -50;
        int r2 = (int) ((random * (max - min)) + min);
        System.out.println(r2);

    }
}
