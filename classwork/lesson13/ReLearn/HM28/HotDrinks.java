package com.hillel.classwork.lesson13.ReLearn.HM28;

public abstract class HotDrinks extends CoffeeMachine {
    public static int COST = 0;

    private String type;

    public HotDrinks(String type){
        this.type = type;
    }

    public abstract void cook();

}
