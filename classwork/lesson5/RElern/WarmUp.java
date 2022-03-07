package com.hillel.classwork.lesson5.RElern;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину: ");
        byte length = scanner.nextByte();
        System.out.println("Введите ширину: ");
        byte width = scanner.nextByte();
        System.out.println("Введите высоту: ");
        byte height = scanner.nextByte();
        System.out.println("Нужный вес: ");
        byte totalNeededWeight = scanner.nextByte();;

        short trackVolume = calculateVolume(length, width, height);
        System.out.println("Объем грузовика: " + trackVolume);

        System.out.println("Максимальный допустимый вес: " + totalWeight(trackVolume, totalNeededWeight));
    }

    public static short calculateVolume(byte length, byte width, byte height) {

        return (short) (length * width * height);
    }

    public static int totalWeight(short trackVolume, byte totalTrackWeight) {
        return  (trackVolume * totalTrackWeight);
    }
}
