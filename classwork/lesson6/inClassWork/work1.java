package com.hillel.classwork.lesson6.inClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class work1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();
        String combLine = lineComb(line1, line2);
        System.out.println("Mix: " + combLine);
        String combLineX3 = lineComb(line1, line2, line3);
        System.out.println("Mix: " + combLineX3);

    }

    static String lineComb(String line1, String line2) {
        return (line1 + line2);
    }

    static String lineComb(String line1, String line2, String line3) {
        return (line1 + line2 + line3);

    }
}