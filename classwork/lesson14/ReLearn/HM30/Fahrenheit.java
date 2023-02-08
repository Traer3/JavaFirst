package com.hillel.classwork.lesson14.ReLearn.HM30;

public class Fahrenheit extends Calculator {


    public Fahrenheit(double degree, String temperatureType){
        super(degree,temperatureType,"");
        covert(degree,temperatureType);
    }

    @Override
    public double covert(double degree, String temperatureType) {

        switch (temperatureType){

            case "Celsius" :
                degree = (degree * (1.8) + 32);
                break;
            case "Kelvin":
                degree = (degree * (1.8) - 459.67);
        }

        return degree;
    }

}
