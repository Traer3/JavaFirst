package com.hillel.homework;

public class HM17 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Первоя команда из 25 человек");
        System.out.println();
        int[] firstTeam = new int[25];

        int firstSum = 0;

        int secondSum = 0;

        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = mathRandom();
            firstSum = firstSum + firstTeam[i];
            System.out.println("Игроку № " + (i + 1) + " --- " + firstTeam[i] + " лет ");

        }
        int FirstTeamAverageAge = firstSum / firstTeam.length;
        System.out.println();
        System.out.println("средний возраст первой команды состовляет: " + FirstTeamAverageAge );

        System.out.println();
        System.out.println("Вторая команда из 25 человек ");
        System.out.println();
        int[] secondTeam = new int[25];

        for (int i = 0; i < secondTeam.length; i++) {
            secondTeam[i] = mathRandom();
            secondSum = secondSum + secondTeam[i];
            System.out.println("Игроку № " + (i + 1) + " --- " + secondTeam[i] + " лет ");
        }
        int SecondTeamAverageAge = secondSum / secondTeam.length;

        System.out.println();
        System.out.println("средний возраст второй команды состовляет: " + SecondTeamAverageAge );
        System.out.println();

        if (FirstTeamAverageAge > SecondTeamAverageAge){
            System.out.println("Первоя команда старше втрой ");
        }else if(FirstTeamAverageAge < SecondTeamAverageAge) {
            System.out.println("Втроя команда старше первой ");
        }else {
            System.out.println("Команды равны");
        }

    }

    public static int mathRandom() {
        double random = Math.random();
        int r = (int) (10 + random * 50);
        return r;
    }
}
