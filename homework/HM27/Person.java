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

    public static String personGenerator(){

        Random randomNamer = new Random();
        String[] firstNames = { "Myles", "Eliezer", "Douglas", "Darian", "Brock", "Johnny", "Reed", "Howard", "Cristofer", "Kolten", "Eugene", "Neil", "Jason", "Franklin", "Joe", "Jerry", "Allen", "Samuel", "Dario", "Nelson", "Antonio", "Carsen", "Adan", "Alijah"  };
        String[] secondNames = { " Lester", " Bryan", " Rojas", " Cameron", " Vega", " Dickson", " Leonard", " Faulkner", " Kelly", " Friedman", "  Kaiser" ,"Hester","Francis","Burke","Flowers","Santos","Farrell","Myers","Key","Maynard","Davidson"};

        String name = "";
        String secondName = "";

        for (int i = 0; i < 1; i++) {
            int firstIndex = randomNamer.nextInt(firstNames.length);
            int secondIndex = randomNamer.nextInt(secondNames.length);

            name = firstNames[firstIndex];
            secondName = secondNames[secondIndex];

        }
        double random = Math.random();
        int age = (int) (10 + random * 60);

        int weight = (int) (45 + random * 150);

        int size = (int) (150 + random * 50);

        return name + secondName  + age + weight + size;
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
