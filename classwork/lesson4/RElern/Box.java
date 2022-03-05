package com.hillel.classwork.lesson4.RElern;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину,глубину,высоту : ");
        byte width = scanner.nextByte();
        byte height = scanner.nextByte();
        byte depth = scanner.nextByte();
        System.out.println("Глубина коробки " + calculation(width, height, depth));
    }

    public static int calculation(byte width, byte height, byte depth) {

        return width * height * depth;
    }
}
