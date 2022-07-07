package com.hillel.classwork.lesson12.ReLearn.HM26;

public class Meeting {
    public static void main(String[] args) {

        FamilyMember grandfather = new FamilyMember("Игорь");
        FamilyMember grandmother = new FamilyMember("Алена");

        FamilyMember father = new FamilyMember("Дмитрий");
        FamilyMember mother = new FamilyMember("Наташа", grandfather, grandmother);
        FamilyMember son = new FamilyMember("Олег", father, mother);

        FamilyMember son2 = new FamilyMember("Apex", null, mother);
        FamilyMember son3 = new FamilyMember("Anton", father, null);

        System.out.println(son);

        System.out.println(son2);

        System.out.println(son3);


    }
}
