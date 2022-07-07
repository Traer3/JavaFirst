package com.hillel.classwork.lesson12.ReLearn.HM26;

public class FamilyMember {

    private final String name;
    FamilyMember father;
    FamilyMember mother;

    public FamilyMember(String name) {
        this.name = name;

    }

    public FamilyMember(String name, FamilyMember father, FamilyMember mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;

    }

    @Override
    public String toString() {
        if (this.father == null && this.mother == null) {
            return this.name + ", Сирота ";
        } else if (this.father == null) {
            return this.name + " без Отца,  Мать = " + mother;
        } else if (this.mother == null) {
            return this.name + " без Матери , Отец = " + father;
        } else {
            return this.name + ", Отец = " + father + " Мать = " + mother;
        }
    }

}
