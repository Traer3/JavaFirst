package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;

public class HM17 {
    public static void main(String[] args) {
        byte[] firstTeam = new byte[25];
        byte[] secondTeam = new byte[25];

        teamAge(firstTeam);
        teamAge(secondTeam);

        int averageAgeFirstTeam = 0;
        int averageAgeSecondTeam = 0;

        int ageFirstTeam = averageAgeCalculations(firstTeam, averageAgeFirstTeam);
        int ageSecondTeam = averageAgeCalculations(secondTeam,averageAgeSecondTeam);


        System.out.println("Средний возраст первой команды " + averageAgeCalculations(firstTeam, averageAgeFirstTeam));
        System.out.println("Средний возраст второй команды " + averageAgeCalculations(secondTeam,averageAgeSecondTeam));

        judge(ageFirstTeam, ageSecondTeam);

    }

    private static void judge(int ageFirstTeam, int ageSecondTeam) {
        if(ageFirstTeam > ageSecondTeam){
            System.out.println("Первая команда опытнее");
        }else if (ageFirstTeam < ageSecondTeam) {
            System.out.println("Вторая команда опытнее");
        }else {
            System.out.println("Команды равны");
        }
    }

    private static int averageAgeCalculations(byte[] teamAge, int averageTeamAge) {
        for (int i = 0; i < teamAge.length; i++) {
            averageTeamAge += teamAge[i];
        }
        return averageTeamAge /= teamAge.length;
    }

    private static void teamAge(byte[] people) {
        for (int i = 0; i < people.length; i++) {
            people[i] = (byte) Methods.generateRandom(17,35);
        }
    }
}
