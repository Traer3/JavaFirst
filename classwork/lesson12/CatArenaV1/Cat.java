package com.hillel.classwork.lesson12.CatArenaV1;

class Cat {
    private String name;
    private int weight;
    private int strength;
    private int age;

    public Cat(String name, int weight, int strength,int age){

        this.name = name;
        this.weight = weight;
        this.strength = strength;
        this.age = age;

    }

    public void fight(Cat cat){
        if (this.strength > cat.strength){
            System.out.println("win 1");
        }else if (this.strength  < cat.strength) {
            System.out.println("win 2");
        }else{
            System.out.println("lose");
        }
    }


    public String toString() {
        return "Cat S.T.A.T.S -- " + name + ", weight = " + weight + ", strength = " + strength + ", age = " + age;
    }
}

