package com.hillel.classwork.lesson13.ReLearn;

public class Animal {

    public static String DEFAULT_COLOR = "WHITE";

    protected String color;

    public Animal(String color){
        this.color = color;
    }

    public void speak(){


        System.out.println("Animal speaks");

    }

}
