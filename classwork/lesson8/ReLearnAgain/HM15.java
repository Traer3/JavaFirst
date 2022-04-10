package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;


public class HM15 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите палиндром");
        String palindrome = HM8.READER.readLine();
        String palindromeRevers = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            palindromeRevers += palindrome.charAt(i);
        }

        System.out.println("Это " + palindrome.equals(palindromeRevers) + " палиндром");
    }
}
