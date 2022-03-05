package com.hillel.classwork.lesson3.RElern;

public class FitnessTracker {

    public static void main(String[] args) {

        short stepsAmount = 10_000;
        byte hours = 12;

        float result = (float) stepsAmount / hours;

        System.out.println("Steps perHour " + result);

    }
}
