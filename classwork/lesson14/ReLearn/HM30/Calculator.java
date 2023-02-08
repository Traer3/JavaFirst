package com.hillel.classwork.lesson14.ReLearn.HM30;

public abstract class Calculator implements Convertible {

    String desiredTemperature;

    public Calculator(double degree, String temperatureType, String desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
        choice(degree, temperatureType, desiredTemperature);
    }

    public static double choice(double degree, String temperatureType, String desiredTemperature) {
        switch (desiredTemperature) {
            case "Celsius":
                Calculator celsius = new Celsius(degree, temperatureType);
                return celsius.covert(degree, temperatureType);

            case "Kelvin":
                Calculator kelvin = new Kelvin(degree, temperatureType);
                return kelvin.covert(degree, temperatureType);

            case "Fahrenheit":
                Calculator fahrenheit = new Fahrenheit(degree, temperatureType);
                return fahrenheit.covert(degree, temperatureType);
        }
        return degree;
    }



}
