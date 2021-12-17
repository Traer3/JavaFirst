package com.hillel.classwork.lesson6.inClassWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class work1v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();
        line(line1);
        lineX2(line1,line2);
        lineX3(line1,line2,line3);
    }

    static void line(String line1) {
        System.out.println("1" + line1);

    }

    static void lineX2(String line1, String line2) {
        System.out.println("1" + line1 + "2" + line2);
    }

    static void lineX3(String line1, String line2, String line3) {
        System.out.println("1" + line1 + "2" + line2 + "3" + line3);
    }
}