package com.hillel.classwork.lesson13;

import java.util.ArrayList;
import java.util.List;

public class PetStore {

    public static void main(String[] args) {


        //используя extends  Animal мы можем обращатся с привычного Cat cat = new Cat();Dog dog = new Dog(); в :...
        Animal cat = new Cat("white");
        Animal dog = new Dog();
        Animal cat2 = new Cat("black");

        //команда speak находится в Animal но так как Cat является наследником Animal , то он может использовать команду
        cat.speak();
        dog.speak();


        //позволяет создовать список животных
        List<Animal> animals = new ArrayList<>();

        //в этот список можно добовлять (animal.add()) наших созданых животный и вызывать animal.get()
        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        //после того как список был создан. Мы можем создать новый класс (Rat) и без всяких Animal rat = new Rat(); можем написать animals.add(new Rat()); и она добавится.
        animals.add(new Rat("multi"));



        //это foreach делает так что каждое животное выполнит команду animal.speak
        for (Animal animal: animals) {
            animal.speak();
        }

    }
}
