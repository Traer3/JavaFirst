package com.hillel.classwork.lesson8.ReLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayLink {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] strings = createAndFill(Integer.parseInt(READER.readLine()));

        printArray(strings);

        /**

          //Это принцеп работы ссылочного типа

        System.out.println("strings link " + strings);

        String[] anotherStrings = strings;
        System.out.println("anotherStrings Link " + anotherStrings);

        anotherStrings[0] = "new text";
        System.out.println(strings[0]);
        System.out.println(anotherStrings[0]);

         */

    }

    public static String[] createAndFill(int size) {
        String[] strings = new String[size];
        fillArray(strings);
        return strings;
    }

    public static void fillArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str " + i;

        }

    }

    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
