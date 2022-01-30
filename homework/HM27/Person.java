package com.hillel.homework.HM27;

import java.util.Random;

public class Person {
    String name;
    String secondName;
    int age;
    int weight;
    int size;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public Person(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(String name, String secondName, int age, int weight, int size) {

        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;
        this.size = size;
    }


    public static String nameGenerator() {
        Random randomNamer = new Random();

        String[] firstNames = {"Myles", "Eliezer", "Douglas", "Darian", "Brock", "Johnny", "Reed", "Howard", "Cristofer", "Kolten", "Eugene", "Neil", "Jason", "Franklin", "Joe", "Jerry", "Allen", "Samuel", "Dario", "Nelson", "Antonio", "Carsen", "Adan", "Alijah"};
        String name = "";
        int firstIndex = randomNamer.nextInt(firstNames.length);
        name = firstNames[firstIndex];
        return name;
    }

    public static String secondNameGenerator() {
        Random randomNamer = new Random();

        String[] secondNames = {" Lester", " Bryan", " Rojas", " Cameron", " Vega", " Dickson", " Leonard", " Faulkner", " Kelly", " Friedman", "  Kaiser", "Hester", "Francis", "Burke", "Flowers", "Santos", "Farrell", "Myers", "Key", "Maynard", "Davidson"};
        String secondName = "";
        int secondIndex = randomNamer.nextInt(secondNames.length);
        secondName = secondNames[secondIndex];
        return secondName;
    }

    public static int personAgeGenerator() {
        double random = Math.random();
        int age = (int) (10 + random * 60);
        return age;
    }

    public static int personWeightGenerator() {
        double random = Math.random();
        int weight = (int) (45 + random * 150);
        return weight;
    }

    public static int personSizeGenerator() {
        double random = Math.random();
        int size = (int) (150 + random * 50);
        return size;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }
}
