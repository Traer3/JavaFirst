package com.hillel.classwork.lesson9.ReLearnAgain;

import com.hillel.classwork.lesson4.RElern.Methods;
import com.hillel.classwork.lesson5.RElern.HM8;

import java.util.Arrays;

public class HM18 {
    public static void main(String[] args) {
        byte[] winNumbers = new byte[7];
        byte[] playerNumbers = new byte[winNumbers.length];

        inputNumbers(winNumbers, playerNumbers);

        Arrays.sort(winNumbers);
        Arrays.sort(playerNumbers);

        System.out.println(Arrays.toString(winNumbers));
        System.out.println(Arrays.toString(playerNumbers));

        casinoHart(winNumbers, playerNumbers);
    }

    private static void casinoHart(byte[] winNumbers, byte[] playerNumbers) {
        byte coincidence = 0;

        for (byte i = 0; i < winNumbers.length; i++) {
            if(winNumbers[i] == playerNumbers[i]){
                coincidence++;
                System.out.print("Совпал " + winNumbers[i] + "й элемент, ");
            }
        }
        System.out.println();
        System.out.println("Количество совпадений " + coincidence);
    }

    private static void inputNumbers(byte[] winNumbers, byte[] playerNumbers) {
        for (byte i = 0; i < winNumbers.length; i++) {
            winNumbers[i] = (byte) Methods.generateRandom(0,9);
        }

        for (byte i = 0; i < winNumbers.length; i++) {
            System.out.println("Введите " +(i+1)+ "й элемент");
            playerNumbers[i] = HM8.byteOnly(HM8.READER);

        }
    }
}
