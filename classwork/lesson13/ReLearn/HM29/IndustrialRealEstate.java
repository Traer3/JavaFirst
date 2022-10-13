package com.hillel.classwork.lesson13.ReLearn.HM29;

public class IndustrialRealEstate extends TaxBuilding {


    public IndustrialRealEstate(int totalArea) {
        super(totalArea);
    }
    @Override
    public double tax(int taxPerSquare) {
        System.out.print("Стоимость налога ");
        return super.tax(taxPerSquare);

    }

    @Override
    public String toString() {
        return "Общая площадь " + totalArea;
    }
}
