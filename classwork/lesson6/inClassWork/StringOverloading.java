package com.hillel.classwork.lesson6.inClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOverloading {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        lineComb(reader.readLine(), reader.readLine());
    }

    static void lineComb(String line1, String line2) {
        System.out.println("1" + line1 + "2" + line2);
    }
}