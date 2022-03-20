package com.hillel.classwork.lesson4.RElern;

public class Zoo {
    public static void main(String[] args) {
        short bears =20;
        short zebras = 30;
        short elephant = 3;
        short giraffes = 8;

        int allAnimals = (bears+zebras+elephant+giraffes);

        int animalsInZoo = calculateAnimals(bears,zebras,elephant,giraffes);

        int animalsInZooNextYear = animalIncrease(allAnimals, animalsInZoo);




        System.out.println("Животных в зоопарке: " + calculateAnimals(bears,zebras,elephant,giraffes));
        System.out.println("Ориентировочное число животных в зоопарке на следующий год " + animalsInZooNextYear);

    }

    private static int animalIncrease(int allAnimals, int animalsInZoo) {
        float animalIncrease = (float) animalsInZoo / allAnimals;

        int animalsInZooNextYear = (int) (animalsInZoo * animalIncrease);
        return animalsInZooNextYear;
    }

    private static int calculateAnimals(short bears,short zebras,short elephant,short giraffes) {
        float bearsIncrease = bears * 0.30F;
        bears += bearsIncrease;
        float zebrasIncrease = zebras * 0.10F;
        zebras += zebrasIncrease;
        float elephantIncrease = elephant * 0.15F;
        elephant += elephantIncrease;
        float giraffesIncrease = giraffes * 0.50F;
        giraffes += giraffesIncrease;

        int animalsInZoo = (bears+ zebras+elephant+giraffes);

        return animalsInZoo;
    }

}
