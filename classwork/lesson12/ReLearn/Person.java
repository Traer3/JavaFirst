package com.hillel.classwork.lesson12.ReLearn;

public class Person {

    private static final String DEFAULT_NAME = "Unknown";
    public static int COUNT = 0;

    private final String name;
    private  byte age;
    String hobby;

    public Person (byte age){
        this.name = DEFAULT_NAME;
        this.age = age;
        COUNT++;
        secretAction();

    }

    public Person (String name,byte age){
        this.name = name;
        this.age = age;
        COUNT++;
        secretAction();
    }
    public Person (String name,byte age,String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        COUNT++;
        secretAction();
    }

    @Override
    public String toString(){
        System.out.println();
        return "Person = " + name + ", age = " + age + ", hobby = " + hobby;
    }
    private void secretAction(){
        System.out.println(this.name);
        System.out.println("secret action");
        printCount();
    }

    public static void printCount(){
        System.out.println("Количество персон " + COUNT);
    }

    public String getName(){
        return name;
    }
    public byte getAge(){
        return age;
    }
    public String getHobby(){
        return hobby;
    }

    public void setAge(byte age){
        this.age = age;
    }


}
