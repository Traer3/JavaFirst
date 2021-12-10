package com.hillel.homework;

import java.util.Scanner;

public class HM4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите диаметр 3 шаров: ");
        float sphere1 = sc.nextFloat();
        float sphere2 = sc.nextFloat();
        float sphere3 = sc.nextFloat();

        float SV1voulume = sphereVolume(sphere1);
        float SV2voulume = sphereVolume(sphere2);
        float SV3voulume = sphereVolume(sphere3);

        float weight = SV1voulume + SV2voulume + SV3voulume;

        System.out.println();
        System.out.println("Вес снеговика в kg : " + weight);
    }

    public static float sphereVolume(float radius) {
        float thickness = 0.7F;

        return (float) ((4 / 3) * Math.PI * radius) * thickness;
    }


}