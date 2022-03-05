package com.hillel.classwork.lesson13;

//extends означает становиться наследником расширять класс Dog
public class Dog extends  Animal{

    public Dog(){
        super("black");
    }

    @Override //Override правило хорошего тона.
    public void speak(){
        System.out.println("Bark!");
        //Напомню что приватный метод может быть вызван только из publiчного метода таким образом...
        tailMove();
    }
    //тут я написал private так как это действие только к собаке относится. Нет смысла давать возможность вызывать этот метод кому угодно.
    private void tailMove(){
        System.out.println("Tail moving");
    }
}
