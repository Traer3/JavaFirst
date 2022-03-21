package com.hillel.classwork.lesson7.RElern;

public class Continue {
    public static void main(String[] args) {


        int i = 0;
        do {

            i++;
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);


        } while (i <= 100);

    }
}
