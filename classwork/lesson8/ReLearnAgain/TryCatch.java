package com.hillel.classwork.lesson8.ReLearnAgain;

import com.hillel.classwork.lesson5.RElern.HM8;


public class TryCatch {
    public static void main(String[] args) {

        Integer correctNum = intOnly();
        System.out.println(correctNum);
        //tryCatch продолжает работать если в catch {только вывод ошибки}


    }

    public static Integer intOnly() {

        try {
            String str1 = HM8.READER.readLine();
            Integer number = Integer.parseInt(str1);
            return number;

        } catch (Exception e) {
            System.out.println("Введите целое число: " + e.getMessage());
            return intOnly();
        }
    }

}
