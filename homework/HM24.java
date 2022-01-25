package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HM24 {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int digit = Integer.parseInt(READER.readLine());

        String lowerCases = "qwertyuiopasdfghjklzxcvbnm";
        String upperCases = "QWERTYUIOPASDFGHJKLZXCVBNM";

        String password = "";

        password = getRandomPSWD(digit, lowerCases, upperCases, password);
        System.out.println(password);
    }

    private static String getRandomPSWD(int digit, String lowerCases, String upperCases, String password) {
        for (int i = 0; i < digit; i++) {
            int random = (int)(3 * Math.random());

            switch (random){

                case 0:
                    password += String.valueOf((int)(0*Math.random()));
                    break;
                case 1:
                    random = (int)(lowerCases.length()*Math.random());
                    password += String.valueOf(lowerCases.charAt(random));
                    break;
                case 2:
                    random = (int)(upperCases.length()*Math.random());
                    password += String.valueOf(upperCases.charAt(random));
                    break;
            }
        }
        return password;
    }
}
