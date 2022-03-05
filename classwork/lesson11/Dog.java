package com.hillel.classwork.lesson11;

public class Dog {

    String breed;
    String size;
    int age;
    String color;


    // public Dog() это конструктор , имя конструктора Dog должно совподать с именем класса public class Dog ,а иначе это будет метод
    //после каждой созданой собки терменал будет выводить "Dog has been created!"
    public Dog(){
        System.out.println("Dog has been created!");
    }

    //создаем конструктор с параметрами для удобства создания
    public Dog(String breed, String  size, int age, String color){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;

    }

    public void run() {
        System.out.println("dog runs");
    }

    public boolean equals(Object obj) {

        //если обект "obj" который мы передали в этот метод "equals" будет подхоить "instanceof" нашей собаке "Dog"

        if (obj instanceof Dog) {
            //то мы преобразоваем этот обект в собаку
            Dog dog = (Dog) obj;
            //дальше мы проверяем по каким пораметрам мы будет сравнивать собак
            //слово .this используется НЕ В СТАТИЧЕСКИХ МЕТОДАХ
            //еще одна штука .equals() СРАВНИВАЕТ СТРОКИ
            if (this.breed.equals(dog.breed) && this.age == dog.age) {
                return true;
            }
        }
        return false;


    }
    //метод который при выводе ссылочного типа будет выдавать нам не набор Хэш кода ,а характеристики собаки
    //можно сгенирировать метод с помощью команды ALT + INS и выбрать метод toString и он нам гненирирует это...
    @Override
    public String toString() {
        return "Dog{" +
                "breed= '" + breed + '\'' +
                ", size= '" + size + '\'' +
                ", age= " + age +
                ", color= '" + color + '\'' +
                '}';
    }
}


