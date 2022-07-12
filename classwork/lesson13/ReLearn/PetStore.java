package com.hillel.classwork.lesson13.ReLearn;

import java.util.ArrayList;
import java.util.List;

import static com.hillel.classwork.lesson13.ReLearn.Animal.DEFAULT_COLOR;

public class PetStore  {

    public static void main(String[] args) {

        Animal cat = new Cat("white","siam");
        Animal dog = new Dog();

        List<Animal> animals = new ArrayList<>();


        animals.add(cat);
        animals.add(dog);
        animals.add(new Rat(DEFAULT_COLOR));


        for (Animal animal:animals ) {
            animal.speak();

        }

    }
}
