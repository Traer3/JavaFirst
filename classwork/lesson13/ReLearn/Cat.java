package com.hillel.classwork.lesson13.ReLearn;

public class Cat extends Animal {

    private String breed;

    public Cat(String color, String breed) {
        super(color);
        this.breed = breed;
    }

    @Override
    public void speak() {

        super.speak();
        System.out.println("Мяу");

    }
}
