package com.hillel.classwork.lesson13.ReLearn.Practice;

public class PracticeTest {
    public static void main(String[] args) {

        Cow cow = new Whale();
        cow.printName();
        if (cow instanceof Whale){
            Whale whale = (Whale) cow;
        }
        Cow cow1 = new Cow();
        //Whale whale = (Whale) cow1;
    }
}
