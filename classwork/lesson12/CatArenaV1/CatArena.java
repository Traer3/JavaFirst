package com.hillel.classwork.lesson12.CatArenaV1;

public class CatArena {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik" , 25,50,5);
        Cat cat2 = new Cat("Garfild" , 50,20,8);

        System.out.println(cat1);
        System.out.println(cat2);


        cat1.fight(cat2);
    }


}
