package com.hillel.classwork.lesson13.ReLearn.Phone;

public class VideoPhone extends AbstractPhone{
    public VideoPhone(int year){
        super(year);
    }
    @Override
    public void call(int outputNumber){
        System.out.println("Подключаю видеоканал для абонента " + outputNumber);
    }
    @Override
    public void ring (int inputNumber){
        System.out.println("У вас входящий видеовызов..." + inputNumber);
    }
}
