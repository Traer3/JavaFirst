package com.hillel.classwork.lesson13.ReLearn;

public class Dog extends Animal {

    public Dog(){
        super("black");
    }


    @Override
    public void speak(){

        System.out.println("Гав");
        action();
    }

    private void action(){
        System.out.println("виляет хвостом");
    }
}
