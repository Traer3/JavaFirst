package com.hillel.classwork.lesson13.ReLearn.HM29;

public class ResidentialProperties extends TaxBuilding {
    private int totalCost = 15;


    public ResidentialProperties(int totalArea) {
       super(totalArea);
    }

    public double tax(int taxPerSquare) {

        double tax = super.tax(taxPerSquare);

        return (tax / 100 * totalCost) + tax;
    }

    @Override
    public String toString() {
        return "Общая площадь " + totalArea;
    }

}
