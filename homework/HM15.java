package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM15 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        System.out.println("Введите палиндром");

        String original = READER.readLine();

        palindromeCheck(original);

    }
    public static boolean palindromeCheck(String original){

        String revers = "";
        boolean palindrome = true;
        for (int i = original.length() - 1 ; i >=0; i--) {
            revers += original.charAt(i);
        }

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != revers.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("Палиндром");
        }else {
            System.out.println("Не палиндром");
        }
        return true;
    }
}
