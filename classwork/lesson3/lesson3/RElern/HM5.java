package com.hillel.classwork.lesson3.RElern;

public class HM5 {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        byte c = 5;
        byte pow = 3;

        int module = Math.abs(a * b);
        byte sum = (byte) (a + b);
        float prePow = (float) Math.pow(sum, pow);
        double root = Math.sqrt(c);

        float findResult = (float) ((module / prePow) - root);

        System.out.println("ответ " + findResult);

    }
}
