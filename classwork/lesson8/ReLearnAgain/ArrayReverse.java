package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson5.RElern.HM8;

public class ArrayReverse {
    public static void main(String[] args) {

        byte[] bytes = new byte[10];


        for (int i = 0; i < bytes.length; i++) {
            System.out.println("Введите значение для " + (i+1) + " индекса");
            bytes[i] = HM8.byteOnly(HM8.READER);
        }

        for (int i = bytes.length-1; i >= 0; i--) {
            System.out.println("Значение "+i+ " Индекса");
            System.out.println(bytes[i]);

        }

    }
}
