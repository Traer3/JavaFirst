package com.hillel.classwork.lesson4.RElern;

public class WarmUp {
    public static void main(String[] args) {

        short firstWorker = 3000;
        short secondWorker = 4500;
        short thirdWorker = 5800;
        byte tax = 5;

        System.out.println("Вычет налога для первого сотрудника");
        salary(firstWorker, tax);
        System.out.println("Вычет налога для второго сотрудника");
        salary(secondWorker, tax);
        System.out.println("Вычет налога для третьего сотрудника");
        salary(thirdWorker, tax);
    }

    private static void salary(short salary, byte tax) {

        byte decade = 12 * 10;

        int decadeSalary = salary * decade;
        int taxControl = taxControl(salary, tax);
        int salaryTaxDecade = taxControl(decadeSalary, tax);
        System.out.println("Зарплата за 10 лет " + decadeSalary);
        System.out.println("Вычет налога с месячная зарплаты " + taxControl);
        System.out.println("Вычет налога за 10 лет " + salaryTaxDecade);
        System.out.println();
    }

    private static int taxControl(int payment, byte tax) {
        return (payment / 100) * tax ;
    }

}
