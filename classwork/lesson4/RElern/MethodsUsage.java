package com.hillel.classwork.lesson4.RElern;

import java.util.Scanner;

public class MethodsUsage {
    public static void main(String[] args) {

        Methods.printMessage();
        System.out.println(Methods.generateRandom(10, 20));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу ");
        String massage = scanner.next();
        Methods.printMessage(massage);
    }
}
