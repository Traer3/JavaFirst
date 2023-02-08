package com.hillel.classwork.lesson14.ReLearn.HM30;

public class Kelvin extends Calculator {

    public Kelvin(double degree, String temperatureType){
        super(degree,temperatureType,"");
        covert(degree,temperatureType);
    }

    @Override
    public double covert(double degree, String temperatureType) {

        switch (temperatureType){

            case "Celsius" :
                degree = (degree + 273.15);
                break;
            case "Fahrenheit":
                degree = (degree + 459.67) * (0.55);
        }

        return degree;
    }
}
