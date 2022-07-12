package com.hillel.classwork.lesson13.ReLearn.Phone;

public abstract class WirelessPhone extends AbstractPhone{

    private  int hours;

    public WirelessPhone(int year, int hours){
        super(year);
        this.hours = hours;
    }
}
