package com.hillel.classwork.lesson5.RElern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        System.out.println(str);

        Double d = Double.parseDouble(str);
        System.out.println("double" + d);

        int i = Integer.parseInt(str);
        System.out.println("int" + i);

    }
}
