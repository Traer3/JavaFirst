package com.hillel.classwork.lesson7.RElern;

import com.hillel.classwork.lesson5.RElern.HM8;

import java.io.IOException;

public class While {
    public static void main(String[] args) throws IOException {


        String input = HM8.READER.readLine();
        while (!input.equalsIgnoreCase("stop")){
            System.out.println("your input: "+input);
            input = HM8.READER.readLine();
        }
    }
}
