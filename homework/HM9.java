package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM9 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Введите оценку за матиматику : ");
        int math = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за информатику : ");
        int informatics = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за русский язык : ");
        int russian = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за черчение : ");
        int drawing = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку за англиский язык : ");
        int english = Integer.parseInt(reader.readLine());

        grantsCalculation(math, informatics, russian, drawing, english);

    }

    static void grantsCalculation(int math, int informatics, int russian, int drawing, int english) {
        int number = (math + informatics + russian + drawing + english) / 5;
        if (number <= 7) {
            System.out.println("нет стипендии");
        } else if (number <= 9) {
            System.out.println("есть стипендия");
        } else if (number <= 12) {
            System.out.println("повышеная стипендия");
        }

    }

}
