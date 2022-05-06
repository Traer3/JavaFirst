package com.hillel.classwork.lesson11.ReLearn;

public class Dog {

    String breed;
    String size;
    byte age;
    String color;

    public Dog() {
        System.out.println("Собака было создана");
        System.out.println();
    }

    public Dog(String breed, String size, byte age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void dogStats() {
        System.out.println("Порода собаки = " + this.breed);
        System.out.println("Размер собаки = " + this.size);
        System.out.println("Возраст собаки = " + this.age);
        System.out.println("Цвет собаки = " + this.color);
    }

    public void run() {
        System.out.println("Dog runs");
    }

    public boolean equals(Object obj) {

        if (obj instanceof Dog) {

            Dog dog = (Dog) obj;

            if (this.size.equals(dog.size) && this.age == dog.age) {
                return true;
            }

            //            return this.size.equals(dog.size) && this.age == dog.age;
        }

        return false;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
