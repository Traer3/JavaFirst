package com.hillel.classwork.lesson11.ReLearn;

public class CatMain {
    public static void main(String[] args) {

        Cat testCat = new Cat();

        testCat.name = "Schrodinger";
        testCat.breed = "normalCat";
        testCat.age = 4;

        testCat.catStats();

        Cat orangeCat = new Cat("Garfield","normalCat",(byte) 4);

        orangeCat.catStats();


        System.out.println();

        //System.out.println(testCat);
        //System.out.println(orangeCat);


        System.out.println("Are they equals? " + testCat.equals(orangeCat));


    }
}
