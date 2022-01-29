package com.hillel.homework.HM27;

public class PersonGenerator {
    public static void main(String[] args) {


        String[] randomPerson = new String[100];



        for (int i = 0; i < randomPerson.length; i++) {

            randomPerson[i] = Person.personGenerator();

            System.out.println(randomPerson[i]);
            System.out.println("");
        }
    }



}
