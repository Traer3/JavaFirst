package com.hillel.homework.HM27;

public class OneHundredPersons {
    public static void main(String[] args) {


        String[] randomPerson = new String[100];

        for (int i = 0; i < randomPerson.length; i++) {

           randomPerson[i] += new Person(Person.nameGenerator(),Person.secondNameGenerator(),Person.personAgeGenerator(),Person.personWeightGenerator(),Person.personSizeGenerator());

            System.out.println(randomPerson[i]);
        }








    }



}
