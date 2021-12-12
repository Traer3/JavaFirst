package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.print("Мои любимые места в одессе  ");
        char ch3 = '\u263A';
        System.out.println(ch3);
        System.out.println();
        System.out.println("Выбери случайное число от 1 - 8: ");

        int number = Integer.parseInt(reader.readLine());
        System.out.println("Кординаты №: " + number);

        printPlace(number);

    }

    private static void printPlace(int number) {
        switch (number) {
            case 1:
                System.out.print("latitude : ");
                System.out.println("46.58962604053726");
                System.out.print("longitude : ");
                System.out.println("30.795835136752896");
                break;
            case 2:
                System.out.print("latitude : ");
                System.out.println("46.48393665026677");
                System.out.print("longitude : ");
                System.out.println("30.737154831200446");
                break;
            case 3:
                System.out.print("latitude : ");
                System.out.println("46.475534198814245");
                System.out.print("longitude : ");
                System.out.println("30.709326353158957");
                break;
            case 4:
                System.out.print("latitude : ");
                System.out.println("46.46898367432307");
                System.out.print("longitude : ");
                System.out.println("30.742029039125832");
                break;
            case 5:
                System.out.print("latitude : ");
                System.out.println("46.460147093794056");
                System.out.print("longitude : ");
                System.out.println("30.749543826476486");
                break;
            case 6:
                System.out.print("latitude : ");
                System.out.println("46.43760446601472");
                System.out.print("longitude : ");
                System.out.println("30.74637102651043");
                break;
            case 7:
                System.out.print("latitude : ");
                System.out.println("46.430418911355666");
                System.out.print("longitude : ");
                System.out.println("30.729014019009497");
                break;
            case 8:
                System.out.print("latitude : ");
                System.out.println("46.399042093482215");
                System.out.print("longitude : ");
                System.out.println("30.7222088039146");
                break;
            default:
                System.out.println("Неизвестное место");
                break;
        }
    }
}
