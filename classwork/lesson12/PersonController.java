package com.hillel.classwork.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonController {


    public static final BufferedReader READER =  new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //если нам понадобилось вызвать READER в другом классе нам потребовалось писать имя класса ...:: PersonController.READER.readLine();
        System.out.println("Put a name ");
        String name =  PersonController.READER.readLine();


        Person person = new Person(name,18);
        System.out.println(person);

        processPerson(person);
        System.out.println(person);
        //вызов скрытого действия
        //person.secretAction();


        //персона с возрастом , но без имени
        Person person1 = new Person(21);
        System.out.println(person1);

        //Вывод счетчика. Обязательно нужно писать имя класса откуда ты это берешь.
        System.out.println("person count : "+ Person.COUNT);
        Person.printCount();

        //применяем ГЕТЕР для имени. По сути мы получили то что находится в privat типе данных в другом классе (программе).
        System.out.println(person1.getName());

        //применяем СЕТЕР для возроста.По сути опяже приватный тип , а уже менять умеем.
        person1.setAge(5);
        System.out.println(person1.getAge());


    }
    //тут мы проверяем работу public и private типы данных в классе.
    //Используя public  person.age = 33 может меняться кем угодно , а мы хотим использовать private для ограничения чужих полномочий.
    public static void processPerson(Person person){

        //person.age = 33;

    }
}
