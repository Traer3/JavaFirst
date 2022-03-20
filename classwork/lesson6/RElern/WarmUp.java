package com.hillel.classwork.lesson6.RElern;


import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;


public class WarmUp {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку 1: ");
        String string1 = HM8.READER.readLine();
        System.out.println("Введите строку 2: ");
        String string2 = HM8.READER.readLine();

        concatenation(string1, string2);

    }

    private static void concatenation(String string1, String string2) {
        System.out.println(string1 + string2);
    }
}
