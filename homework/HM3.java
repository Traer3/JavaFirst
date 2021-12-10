package com.hillel.homework;
import java.util.Scanner;

public class HM3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа a и b :");

        byte a = sc.nextByte();
        byte b = sc.nextByte();

        byte BoxOfRice = a;

        System.out.println();

        a = b;
        b = BoxOfRice;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println();

        short result1 = (short) (a + b);
        System.out.println("this is A + B = " + result1);

        short result2 = (short) (a - b);
        System.out.println("this is A - B = " + result2);

        short result3 = (short) (a * b);
        System.out.println("this is A * B = " + result3);

        short result4 = (short) (a / b);
        System.out.println("this is A / B = " + result4);

        System.out.println();

        char ch3 = '\u263A';
        System.out.println(ch3);

        System.out.println();

        //I haven't forgotten about the floating point

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите числа c и d :");

        System.out.println();

        float c = sc1.nextFloat();
        double d = sc1.nextDouble();

        System.out.println();

        System.out.println(c);
        System.out.println(d);

        System.out.println();

        double result5 = (c + d);
        System.out.println("this is C + D = " + result5);

        double result6 =  (c - d);
        System.out.println("this is C - D = " + result6);

        double result7 =  (c * d);
        System.out.println("this is C * D = " + result7);

        double result8 =  (c / d);
        System.out.println("this is C / D = " + result8);




    }
}
