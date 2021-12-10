package com.hillel.classwork.lesson4;

import java.util.Scanner;

public class work2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Write 3 random volume : ");
        int width = sc.nextInt();
        int height = sc.nextInt();
        int depth = sc.nextInt();

        int volume = boxCapacity(width, height, depth);
        System.out.println();
        System.out.println("BoxCapacity = " + volume);
    }

    public static int boxCapacity(int width, int height, int depth) {
        return width * height * depth;

    }
}
