package com.hillel.classwork.lesson13.ReLearn.HM27;

public class Person {
    private final String name;
    private final String secondName;
    int age;
    int height;
    int weight;
    public static String[] RANDOM_NAMES = {"Myles", "Eliezer", "Douglas", "Darian", "Brock", "Johnny", "Reed", "Howard", "Cristofer", "Kolten", "Eugene", "Neil", "Jason", "Franklin", "Joe", "Jerry", "Allen", "Samuel", "Dario", "Nelson", "Antonio", "Carsen", "Adan", "Alijah"};
    public static String[] RANDOM_SECOND_NAMES = {" Lester", " Bryan", " Rojas", " Cameron", " Vega", " Dickson", " Leonard", " Faulkner", " Kelly", " Friedman", "  Kaiser", "Hester", "Francis", "Burke", "Flowers", "Santos", "Farrell", "Myers", "Key", "Maynard", "Davidson"};


    public Person(String name,String secondName) {
        this.name = name;
        this.secondName = secondName;

    }
    public Person(String name,String secondName,int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;

    }


    public Person(String name, String secondName, int age, int height, int weight) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "Имя='" + name + '\'' +
                ", Фамилия='" + secondName + '\'' +
                ", возраст=" + age +
                ", рост=" + height +
                ", вес=" + weight ;
    }

    public void personTalk(){
        System.out.println("Разговор людей");
    }

}
