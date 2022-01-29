package com.hillel.homework.HM26;

public class Family {

    private static final String DEFAULT_NAME = " Не известно ";

    String name;
    String fatherName;
    String motherName;

    public Family(String name, String fatherName, String motherName){
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }
    public Family(String name){
        this.name = name;
        this.fatherName = DEFAULT_NAME;
        this.motherName = DEFAULT_NAME;
    }

    @Override
    public String toString() {
        return  "Имя : " + name + " Имя папы: " + fatherName + " Имя мамы: " + motherName;

    }
}
