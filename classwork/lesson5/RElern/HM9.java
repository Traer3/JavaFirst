package com.hillel.classwork.lesson5.RElern;

public class HM9 {
    public static void main(String[] args) {

        System.out.println("Введите оценку за математику: ");
        byte math = HM8.byteOnly(HM8.READER);
        System.out.println("Введите оценку за английский: ");
        byte english = HM8.byteOnly(HM8.READER);
        System.out.println("Введите оценку за физику: ");
        byte physic = HM8.byteOnly(HM8.READER);
        System.out.println("Введите оценку за русский: ");
        byte russian = HM8.byteOnly(HM8.READER);
        System.out.println("Введите оценку за чтение: ");
        byte reading = HM8.byteOnly(HM8.READER);

        short averageMark = markCalculation(math, english, physic, russian, reading);

        grantCheck(averageMark);

    }

    private static void grantCheck(short averageMark) {
        if (averageMark >= 10) {
            System.out.println("Повышенная стипендия");
        } else if (averageMark >= 8) {
            System.out.println("Обычная стипендия");
        } else {
            System.out.println("Без стипендии");
        }
    }

    private static short markCalculation(byte math, byte english, byte physic, byte russian, byte reading) {
        short averageMark = (short) ((math + english + physic + russian + reading) / 5);
        return averageMark;
    }
}
