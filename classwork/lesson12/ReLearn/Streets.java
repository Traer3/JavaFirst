package com.hillel.classwork.lesson12.ReLearn;

public class Streets {
    public static void main(String[] args) {

        Cat homeCat = new Cat("Barsik",(byte) 17,(byte) 15,(byte) 4);
        Cat strayСat = new Cat("Stray cat",(byte) 10,(byte) 20,(byte) 6);
        Cat secondStrayСat = new Cat("Stray cat #2",(byte) 8,(byte) 10,(byte) 4);
        Cat thirdStrayСat = new Cat("Stray cat #3",(byte) 12,(byte) 13,(byte) 5);

        System.out.println(homeCat);
        System.out.println(strayСat);
        System.out.println(secondStrayСat);
        System.out.println(thirdStrayСat);

        System.out.println(homeCat.fight(strayСat));
        System.out.println(homeCat.fight(secondStrayСat));
        System.out.println(homeCat.fight(thirdStrayСat));
    }
}
