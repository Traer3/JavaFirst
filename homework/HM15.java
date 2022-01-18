package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM15 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите палиндром");

        String[] palindrome = {READER.readLine()};


        String palindromeInfoPrint = palindromeChek(palindrome);
        System.out.println(palindromeInfoPrint);

    }
    public static String palindromeChek(String[] palindrome){

        String palindromeChekPositive  = "Это палиндром";
        String palindromeChekNegative = "Это не палиндром";
        int count = 0;
        int palindromeLength = palindrome.length;
        for (int i = 0; i < palindromeLength; i++) {
            if (palindrome[i] == palindrome[palindromeLength - 1 - i]){
                count++;
            }
        }
        if (count == palindromeLength){
           return palindromeChekPositive;}
        else {
            return palindromeChekNegative;
        }


    }
}
