package com.hillel.classwork.lesson11.ReLearn;

public class DogMain {

    public static void main(String[] args) {

        Dog testDog = new Dog();

        testDog.breed = "Mastiff";
        testDog.size = "Big";
        testDog.age = 5;
        testDog.color = "White";

        testDog.run();

        System.out.println("Порода собаки = " + testDog.breed);
        System.out.println("Размер собаки = " + testDog.size);
        System.out.println("Возраст собаки = " + testDog.age);
        System.out.println("Цвет собаки = " + testDog.color);

        System.out.println();

        Dog anotherDog = new Dog();

        anotherDog.breed = "Alabai";
        anotherDog.size = "Large";
        anotherDog.age = 6;
        anotherDog.color = "White-Black";

        anotherDog.run();
        System.out.println();

        anotherDog.dogStats();

        System.out.println();

        Dog dogClone = anotherDog;
        dogClone.color = "Brown";

        System.out.println(testDog == anotherDog);
        System.out.println(testDog.equals(anotherDog));
        System.out.println(testDog == dogClone);
        System.out.println(testDog.equals(dogClone));

        System.out.println();

        Dog ultimateDog = new Dog("White Dog","Average", (byte) 5,"White");

        System.out.println(ultimateDog);
    }

}
