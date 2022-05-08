package com.hillel.classwork.lesson12.ReLearn;

public class PersonController {
    public static void main(String[] args) {

        Person person = new Person("TestSubject",(byte) 18);
        Person secondPerson = new Person("TestSubject 2",(byte) 19,"cooking");
        Person thirdPerson = new Person((byte) 19);



        System.out.println(person);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);


        processPerson(person);
        processPerson(secondPerson);
        processPerson(thirdPerson);

        System.out.println(person);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);

        System.out.println(thirdPerson.getHobby());

        thirdPerson.setAge((byte) 20);
        System.out.println(thirdPerson.getAge());


    }
    public static void processPerson(Person person){

        person.hobby = "Testing";
    }
}
