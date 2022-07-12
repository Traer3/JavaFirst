package com.hillel.classwork.lesson13.ReLearn.HM28;

public class Tea extends HotDrinks{

    // Black tea

    public Tea (String type){
        super(type);
    }

    @Override
    public void cook(){
        System.out.println("Ваш чай готовится");
    }
}
