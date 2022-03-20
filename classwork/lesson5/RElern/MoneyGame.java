package com.hillel.classwork.lesson5.RElern;


import com.hillel.classwork.lesson4.RElern.Methods;

import java.io.IOException;


public class MoneyGame {
    public static void main(String[] args) throws IOException {

        short maxPoint = 1000;
        short minPoint = 1;

        int playerCoin = Methods.generateRandom(minPoint,maxPoint);
        int playerCredit = 0;

        System.out.println("У вас на счету: "+ playerCredit +"$");
        System.out.println("Хотите поиграть ?");

        System.out.println("Введите 1 , если хотите сыграть ");
        System.out.println("Введите 0 , если сегодня не ваш день ");
        byte choice = HM8.byteOnly(HM8.READER);

        gambleChoice(playerCoin, playerCredit, choice);


    }

    private static void gambleChoice(int playerCoin, int playerCredit, byte choice) {
        switch (choice){
            case 0:
                System.out.println("Желаю вам удачи");
            case 1:
                gamble(playerCoin, playerCredit);
            default:
                System.out.println("Хорошего вечера");
        }
    }

    private static void gamble(int playerCoin, int playerCredit) {
        if (playerCoin >= 1000){
            playerCredit += 50000;
        }else if (playerCoin >=500 && playerCoin <= 1000){
            playerCredit += 20000;
        }else if (playerCoin >= 100 && playerCoin <= 499){
            playerCredit += 10000;
        }
        System.out.println("У вас на счету: "+ playerCredit +"$");
    }
}
