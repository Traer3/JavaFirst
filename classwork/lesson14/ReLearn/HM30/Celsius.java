package com.hillel.classwork.lesson14.ReLearn.HM30;

public class Celsius extends Calculator  {

    public Celsius(double degree, String temperatureType){
        super(degree,temperatureType,"");
        covert(degree,temperatureType);
    }



    @Override
    public double covert(double degree, String temperatureType) {

        switch (temperatureType){

            case "Fahrenheit" :
                degree = (degree-32)*(0.55);
                break;
            case "Kelvin":
                degree = (degree - 273.15);
        }

        return degree;
    }

}
