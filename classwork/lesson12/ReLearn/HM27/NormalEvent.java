package com.hillel.classwork.lesson12.ReLearn.HM27;

import com.hillel.classwork.lesson4.RElern.Methods;


public class NormalEvent {
    public static void main(String[] args) {

        Person[] humans = new Person[100];
        for (int i = 0; i < humans.length; i++) {

            int number = Methods.generateRandom(1,4);

            switch (number){
                case 1:
                    humans[i] = new Person(randomName(), randomSecondName());
                    break;
                case 2:
                    humans[i] = new Person(randomName(), randomSecondName(), randomAge());
                    break;
                case 3:
                    humans[i] = new Person(randomName(), randomSecondName(), randomAge(), randomWeight(), randomHeight());
                    break;
            }



            System.out.println("№ " + (i+1) +" "+  humans[i]);
        }


    }

    public static String randomName() {
        String[] names = {"Harry","Ross","Bruce","Cook","Carolyn","Morgan","Albert","Walker","Randy","Reed","Larry","Barnes","Lois","Wilson","Jesse","Campbell","Ernest","Rogers","Theresa","Patterson","Henry","Simmons","Michelle","Perry","Frank","Butler","Shirley"};
        return names[Methods.generateRandom(1, names.length)];
    }

    public static String randomSecondName() {
        String[] secondName = {"Ruth","Jackson","Debra","Allen","Gerald","Harris","Raymond","Carter","Jacqueline","Torres","Joseph","Nelson","Carlos","Sanchez","Ralph","Clark","Jean","Alexander","Stephen","Roberts","Eric","Long","Amanda","Scott","Teresa","Diaz","Wanda","Thomas"};
        return secondName[Methods.generateRandom(1, secondName.length)];
    }

    public static Integer randomAge() {
        return Methods.generateRandom(18, 30);
    }

    public static Integer randomWeight() {
        return Methods.generateRandom(75, 90);
    }

    public static Integer randomHeight() {
        return Methods.generateRandom(175, 200);
    }

}
