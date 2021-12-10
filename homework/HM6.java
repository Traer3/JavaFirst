package com.hillel.homework;

public class HM6 {
    public static void main(String[] args) {

        String airFighter = "Jet,model:";
        String model = "F-22 Raptor,";
        String empty = " ";

        String Typ1 = printAirplaneInfo(airFighter, model);
        System.out.println(Typ1);

        printAirplaneInfo();

        String Typ2 = printAirplaneInfo(empty);
        System.out.println(Typ2);


    }

    public static String printAirplaneInfo(String airFighter, String model) {
        return (airFighter + model);
    }

    public static void printAirplaneInfo() {
        System.out.println("Airliner, модель: Aerobus 737, кол. пасажиров эконом класса: 120");

    }
    public static String printAirplaneInfo(String empty) {
        System.out.println("Airliner, модель: Boeing 777, кол. пасажиров эконом класса: 180, пассажиров бизне скласса: 28");

        return empty;
    }

}
