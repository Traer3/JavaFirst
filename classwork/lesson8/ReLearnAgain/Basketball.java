package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;

public class Basketball {
    public static void main(String[] args) {
        byte[] people = new byte[10];
        byte evenCells = 0;
        byte oddCells = 0;
        for (byte i = 1; i < people.length; i++) {
            people[i] = (byte) Methods.generateRandom(1,10);

            if(i%2 != 0){
                System.out.println(people[i]);
                oddCells += people[i];
            }else {
                System.out.println(people[i]);
               evenCells += people[i];
            }
        }
        System.out.println("не четные "+oddCells);
        System.out.println("четные: " + evenCells);


    }
}
