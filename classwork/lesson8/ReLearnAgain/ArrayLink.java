package com.hillel.classwork.lesson8.ReLearnAgain;


import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;

public class ArrayLink {
    public static void main(String[] args) throws IOException {
        String[] strings = new String[4];

        fillArray(strings);
        printArray(strings);



        System.out.println();
        System.out.println("strings link: " + strings );
        String[] anotherStrings = strings;
        System.out.println("strings link: " + anotherStrings );
        System.out.println();

        anotherStrings[0] = "test StringsLink";
        System.out.println("anotherStrings[0] = " + anotherStrings[0] );
        System.out.println("strings [0] = " + strings[0] );

        System.out.println();
        System.out.println();

        String[] myStrings = createAndFill();
        printArray(myStrings);

    }
    private static void printArray(String[] strings){
        for (String string  : strings) {
            System.out.println(string);
        }

    }
    public static void fillArray(String[] strings) throws IOException {
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите значение для " + (i+1) + " индекса");
            strings[i] = HM8.READER.readLine();
        }
    }
    public static String[] createAndFill() throws IOException {
        System.out.println("Введите длину масива");
        String[] strings = new String[HM8.byteOnly(HM8.READER)];
        fillArray(strings);
        return strings;
    }
}
