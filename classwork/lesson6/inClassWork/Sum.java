package com.hillel.classwork.lesson6.inClassWork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long line1 = Integer.parseInt(reader.readLine());
        long line2 = Integer.parseInt(reader.readLine());
        double line3 = Integer.parseInt(reader.readLine());
        double line4 = Integer.parseInt(reader.readLine());

        long longSum = SumL(line1, line2);
        System.out.println("Long " + longSum);

        double doubSum = SumD(line3, line4);
        System.out.println("double " + doubSum);


    }

    static long SumL(long line1, long line2) {
        return (line1 + line2);

    }

    static double SumD(double line1, double line2) {
        return (line1 + line2);
    }
}
