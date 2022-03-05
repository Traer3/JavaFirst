package com.hillel.classwork.lesson2.RElern;

public class HM3 {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        System.out.println(a);
        System.out.println(b);

        byte hold = a;
        a = b;
        b = hold;

        System.out.println(a);
        System.out.println(b);
    }
}
