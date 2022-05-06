package com.hillel.classwork.lesson11.ReLearn.HM23;

public class CatMain {
    public static void main(String[] args) {

        Cat testCat = new Cat("Барсик",4,16,"Британский синий");
        Cat homeCat = new Cat("Кин",2,5,"Уличный");

        System.out.println("Коты равны в силе? " + testCat.equals(homeCat));
    }
}
