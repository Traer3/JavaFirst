package com.hillel.classwork.lesson11;

public class DogMain {
    public static void main(String[] args) {

        //используем наш конструктор Dog он же наш новый тип который мы создали. И создаем новую собаку dog и присваем ей "String breed; String  size; int age; String color;"
        Dog dog = new Dog();
        //класс dog вызывает метот run
        dog.run();




        //таким образом мы присваиваем нашей собаке характеристики
        System.out.println();
        dog.breed = "Mastiff";
        dog.size = "Big";
        dog.age = 5;
        dog.color = "black";

        //проверяем что есть в нашей собока
        System.out.println("Порода = "+dog.breed);
        System.out.println("Размер = "+dog.size);
        System.out.println("Возраст = "+dog.age);
        System.out.println("Цвет = "+dog.color);

        //собак можно создовать сколько душе угодно
        Dog dog2 = new Dog();
        dog2.breed = "Mastiff";
        dog2.size = "Medium";
        dog2.age = 5;
        dog2.color = "black-white";

        System.out.println();
        System.out.println("Порода = "+dog.breed);
        System.out.println("Размер = "+dog.size);
        System.out.println("Возраст = "+dog.age);
        System.out.println("Цвет = "+dog.color);

        dog2.run();

        //тут проверка ссылочного типа. Мол что будет если dog3 = dog . То мы получаем 2 одинаковые собаки
        Dog dog3 = dog;

        System.out.println();
        System.out.println(dog);
        System.out.println();
        System.out.println(dog2);
        System.out.println();
        System.out.println(dog3);

        //тут присвоение цвета если мы присвом dog3 цвет то и dog тоже его поменяет.
        System.out.println("Цвет = "+dog.color);
        System.out.println("Цвет = "+dog3.color);
        dog3.color = "Brown";
        System.out.println("Цвет = "+dog.color);
        System.out.println("Цвет = "+dog3.color);

        //нихуя! Можно сравнить ссылки . И она проверит сходства
        System.out.println(dog == dog2);
        //ну тут и так все понятно это одна и таже собака
        System.out.println(dog == dog3);
        System.out.println();

        //та же функция но с использование .equals() которая была взята из класса Object
        //только теперь в классе Dog.java ,а именно в --> public boolean equals(Object obj) мы модифицировали свой Dog.equals() на проверку breed и age
        System.out.println("таже хуйня ");
        System.out.println(dog.equals(dog3));
        System.out.println(dog.equals(dog2));

        //тут мы используем новый конструктор Dog и создаём собаку в один шаг
        Dog dog4 = new Dog("Chow chow","Medium",6,"White");
        // и теперь после того как мы создали toString нам не надо выводить все харак. по отдельности. Мы можем вывести
        System.out.println(dog4);


    }
}
