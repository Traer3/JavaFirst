package com.hillel.classwork.lesson6.RElern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarmUp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку 1: ");
        String string1 = reader.readLine();
        System.out.println("Введите строку 2: ");
        String string2 = reader.readLine();

        concatenation(string1, string2);

    }

    private static void concatenation(String string1, String string2) {
        System.out.println(string1 + string2);
    }
}
