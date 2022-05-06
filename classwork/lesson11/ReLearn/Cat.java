package com.hillel.classwork.lesson11.ReLearn;

public class Cat {

    String name;
    String breed;
    byte age;

    public Cat() {
        System.out.println("Deploying CAT");
    }


    public void catStats() {
        System.out.println();
        System.out.println("Имя кота = " + this.name);
        System.out.println("Порода кота = " + this.breed);
        System.out.println("Возраст кота = " + this.age);
    }

    public Cat(String name, String breed, byte age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public boolean equals(Object obj) {

        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            if (this.breed.equals(cat.breed) && this.age == cat.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя='" + name + '\'' +
                ", Порода='" + breed + '\'' +
                ", Возраст=" + age +
                '}';
    }
}
