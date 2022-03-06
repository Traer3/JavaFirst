package com.hillel.classwork.lesson4.RElern;

import java.util.Scanner;

public class HM6 {
    public static void main(String[] args) {


        Scanner aircraftScanner = new Scanner(System.in);

        System.out.println("Введите тип истребителя");
        String aircraftFighterName = aircraftScanner.next();
        System.out.println("Введите модель истребителя");
        String aircraftFighterType = aircraftScanner.next();

        System.out.println("Введите тип самолёта");
        String economyAircraftName = aircraftScanner.next();
        System.out.println("Введите модель самолёта");
        String economyAircraftType = aircraftScanner.next();
        System.out.println("Введите количество мест");
        short economyClassSeats = aircraftScanner.nextShort();

        System.out.println("Введите тип самолёта");
        String businessAircraftName = aircraftScanner.next();
        System.out.println("Введите модель самолёта");
        String businessAircraftType = aircraftScanner.next();
        System.out.println("Введите количество эконом мест");
        short economyBusinessClassSeats = aircraftScanner.nextShort();
        System.out.println("Введите количество бизнес мест");
        short businessClassSeats = aircraftScanner.nextShort();

        printAirplaneInfo(aircraftFighterName, aircraftFighterType);
        printAirplaneInfo(economyAircraftName, economyAircraftType, economyClassSeats);
        printAirplaneInfo(businessAircraftName, businessAircraftType, economyBusinessClassSeats,businessClassSeats);
    }

    private static void printAirplaneInfo(String aircraftName, String aircraftType) {
        System.out.println("Тип самолета: " + aircraftName + ", модель: " + aircraftType);
    }

    private static void printAirplaneInfo(String aircraftName, String aircraftType, short economyClassSeats) {
        System.out.println("Тип самолета: " + aircraftName + ", модель: " + aircraftType + ", кол. пассажиров эконом класса: " + economyClassSeats);
    }
    private static void printAirplaneInfo(String aircraftName, String aircraftType, short economyClassSeats,short businessClassSeats) {
        System.out.println("Тип самолета: " + aircraftName + ", модель: " + aircraftType + ", кол. пассажиров эконом класса: " + economyClassSeats + ", пассажиров бизнес класса: " + businessClassSeats);

    }

}
