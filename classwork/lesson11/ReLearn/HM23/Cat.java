package com.hillel.classwork.lesson11.ReLearn.HM23;

public class Cat {

    String name;
    int age;
    int weigh;
    String breed;

    public Cat(){

    }
    public Cat(String name, int age , int weigh, String breed){
        this.name = name;
        this.age = age;
        this.weigh = weigh;
        this.breed = breed;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя='" + name + '\'' +
                ", возраст=" + age +
                ", вес=" + weigh +
                ", порода='" + breed + '\'' +
                '}';
    }

    public boolean equals(Object obj) {

        if(obj instanceof Cat){
            Cat cat = (Cat) obj;
            return this.weigh == cat.weigh && this.age == cat.age;
        }
        return false;
    }


}
