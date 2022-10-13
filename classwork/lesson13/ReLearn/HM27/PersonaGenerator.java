package com.hillel.classwork.lesson13.ReLearn.HM27;

import com.hillel.classwork.lesson4.Methods;

import static com.hillel.classwork.lesson13.ReLearn.HM27.Person.RANDOM_NAMES;
import static com.hillel.classwork.lesson13.ReLearn.HM27.Person.RANDOM_SECOND_NAMES;

public class PersonaGenerator {
    public static void main(String[] args) {

        Person[] people = new Person[100];
        for (int i = 1; i <= people.length; i++) {
            System.out.print("# " + i +" ");
            randomPerson(Methods.generateRandom(1,4));
        }

    }

    public static void randomPerson(int number) {
        int randomName = Methods.generateRandom(0,RANDOM_NAMES.length);
        int randomSecondName = Methods.generateRandom(0, RANDOM_SECOND_NAMES.length);
        int randomAge = Methods.generateRandom(8, 76);
        int randomHeight = Methods.generateRandom(150,250);
        int randomWeight = Methods.generateRandom(56,120);
        switch (number){
            case 1:
                Person human = new Person(RANDOM_NAMES[randomName], RANDOM_SECOND_NAMES[randomSecondName]);
                System.out.println(human);
                break;
            case 2:
                Person secondHuman = new Person(RANDOM_NAMES[randomName], RANDOM_SECOND_NAMES[randomSecondName],randomAge);
                System.out.println(secondHuman);
                break;
            case 3:
                Person thirdHuman = new Person(RANDOM_NAMES[randomName], RANDOM_SECOND_NAMES[randomSecondName],randomAge,randomHeight,randomWeight);
                System.out.println(thirdHuman);
                break;
        }

    }
}
