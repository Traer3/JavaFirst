package com.hillel.classwork.lesson13;

//extends означает становится наследником разширять класс Cat
public class Cat extends Animal {

    //из за того что родительский конструктор модифицирован наследник Cat не может создатся. Так что мы его переопределяем
    public Cat(String color){
        //super() это обращение к родительскому конструктору
        super(color);
    }

    @Override //Override это пометка переопределенных методов. Такие методы нужно помечать Override это правило хорошего тона.
    public void speak(){
        //с наследника , а именно Cat. Мы можем обратиться к родительским командам Animal с помощь super
        super.speak();
        System.out.println("meAuuuu");
    }
}
