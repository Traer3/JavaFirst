package com.hillel.classwork.lesson5.RElern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExperiencedEmployee {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите месячную зарплату: ");
        short monthPayday = shortOnly(reader);
        System.out.println("Введите опыт работы: ");
        byte employeeExperience = HM8.byteOnly(reader);
        paymentCheck(monthPayday, employeeExperience);
    }

    private static void paymentCheck(short monthPayday, byte employeeExperience) {

        if(employeeExperience >= 5 && employeeExperience <=9){
            monthPayday += 100;
            System.out.println("Ваша зарплата увеличена на: 100$" );
            System.out.println("Зарплата: " + monthPayday);
        }
        if(employeeExperience >= 10){
            monthPayday += 500;
            System.out.println("Ваша зарплата увеличена на: 500$" );
            System.out.println("Зарплата: " + monthPayday);
        }else {
            System.out.println("Продолжайте усердно работать ");
        }
    }

    public static short shortOnly(BufferedReader reader) {
        try {
            String str = reader.readLine();
            return Short.parseShort(str);
        } catch (Exception exception) {
            System.out.println("Ошибка введите целое число: ");
            return shortOnly(reader);
        }
    }
    
}
