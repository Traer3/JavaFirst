package com.hillel.classwork.lesson11.ReLearn;

public class Person {
    String name;
    int age;
    int weight;
    double money;

    public Person(){
    }

    public Person(String name, int age, int weight ,double money){
        System.out.println("Person has been created! ");
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.money = money;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Имя='" + name + '\'' +
                ", Возраст=" + age +
                ", Вес=" + weight +
                ", деньги=" + money +
                '}';
    }
}
