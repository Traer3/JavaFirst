package com.hillel.homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM6 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.println("Введите название истребителя");
        String airFighterName = reader.readLine();
        System.out.println("Введите тип истребителя");
        String airFighterType = reader.readLine();
        System.out.println("Введите тип эконом самолета");
        String aircraftName = reader.readLine();
        System.out.println("Введите модель эконом самолета");
        String aircraftType = reader.readLine();
        System.out.println("Введите количество мест эконом класса");
        String economyClassSeats = reader.readLine();
        System.out.println("Введите тип бизнес самолета");
        String businessAircraftName = reader.readLine();
        System.out.println("Введите модель бизнес самолета");
        String businessAircraftType = reader.readLine();
        System.out.println("Введите количество мест эконом класса");
        String businessEconomyClassSeats = reader.readLine();
        System.out.println("Введите количество мест бизнес класса");
        String businessClassSeats = reader.readLine();

        printAirplaneInfo(airFighterName,airFighterType);
        printAirplaneInfo(aircraftName,aircraftType,economyClassSeats);
        printAirplaneInfo(businessAircraftName,businessAircraftType,businessEconomyClassSeats,businessClassSeats);

    }
    public static void printAirplaneInfo(String airFighterName,String airFighterType){
        System.out.println("Тип самалета: " + airFighterName + ",модель: " + airFighterType);
    }
    static void printAirplaneInfo(String aircraftName,String aircraftType,String economyClassSeats){
        System.out.println("Тип самалета: " + aircraftName + ",модель: " + aircraftType + " кол. пасажиров эконом класса: " + economyClassSeats );
    }
    static void printAirplaneInfo(String businessAircraftName,String businessAircraftType,String businessEconomyClassSeats, String businessClassSeats ){
        System.out.println("Тип самалета: " + businessAircraftName + ",модель: " + businessAircraftType + " кол. пасажиров эконом класса: " + businessEconomyClassSeats + ", пассажиров бизне скласса:" + businessClassSeats );
    }

}
