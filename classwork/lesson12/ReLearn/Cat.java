package com.hillel.classwork.lesson12.ReLearn;

public class Cat {

    private final String name;
    private final byte weight;
    private final byte strength;
    private byte age;

    public Cat(String name,byte weight,byte strength ,byte age){
        this.name = name;
        this.weight = weight;
        this.strength =strength;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Cat = " + name + ", age = " + age + ", weight = " + weight + ", strength = " + strength;
    }

    public boolean fight(Cat cat){
        System.out.println("Ваш кот сильнее ? ");
        boolean answer = false;
        if(this.strength > cat.strength && this.weight > cat.weight){
            answer = true;
        }
        return answer;
    }

    public void setAge(byte age){
        this.age = age;
    }
}
