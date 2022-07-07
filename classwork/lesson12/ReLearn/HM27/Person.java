package com.hillel.classwork.lesson12.ReLearn.HM27;

public class Person {
    private final String name;
    private final String secondName;
    Integer age;
    Integer weigh;
    Integer height;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public Person(String name, String secondName, Integer age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(String name, String secondName, Integer age, Integer weigh, Integer height) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.weigh = weigh;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Имя " + this.name + " Фамилия " + this.secondName + " Возраст " + this.age + " Вес " + this.weigh + " Рост " + this.height;
    }
}
