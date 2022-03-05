package com.hillel.classwork.lesson12;

class Person {

    //переменная для БЕЗМЕННЫХ пользователей
    private static final String DEFAULT_NAME = "Unknown";

    //создаем простой счетчик.
    public static int COUNT = 0;


    //private ограничивает возможность менять уже введенные данные.
    //final это еше один модификатор. Он ограничивает количество инициализации ввода имени и возраста до 1 раза. И больше его менять нельзя
    private final String name;
    //final с age мы убрали так как будем увеличивать его РАЗ В ГОД.
    private  int age;


    //создаем персону без имени
    public  Person(int age) {
        this.name = DEFAULT_NAME;
        this.age = age;
        //увеличиваем значения счетчика
        COUNT++;
    }


    //конструктор, который будет принимать name и age и не будет позволять их менять.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        //вызов ограниченного метода в другой класс.
        secretAction();
        //увеличиваем значения счетчика
        COUNT++;

    }

    //как раз и private ограничивает вызов этого метода вне класса. НО его можно вызвать внутри класса ,а класс наружу.
    private void secretAction() {

        System.out.println("Secret Action");
        System.out.println("Count " + COUNT);
        printCount();
    }

    public static void printCount(){
        System.out.println("count" + COUNT);
    }

    //Создаем ГЕТЕР для имени. Тут фиксированный тип данных и имя getName
    public String getName(){
        return  name;
    }
    //так же само на возраст. Возраст у нас тип INT ,а имя getAge
    public int getAge(){
        return age;
    }

    //теперь мы пишем СЕТЕР. Тут так же все ограничено. ТОЛЬКО set...
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name = " + name + ", age = " + age;
    }
}
