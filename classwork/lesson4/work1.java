package com.hillel.classwork.lesson4;
import java.util.Scanner;

public class work1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите зарплату 3 людей: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int year = (10 * 12);

        int man1 = (a * year);
        int man2 = (b * year);
        int man3 = (c * year);

        int sel1 = ((man1 / 100) * 5);
        int sel2 = ((man2 / 100) * 5);
        int sel3 = ((man3 / 100) * 5);
        int all = ((sel1+sel2+sel3)/3);

        System.out.println("man1 = " + sel1 );
        System.out.println("man2 = " + sel2 );
        System.out.println("man3 = " + sel3 );
        System.out.println("all = " + all );


    }
}
