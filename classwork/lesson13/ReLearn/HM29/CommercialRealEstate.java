package com.hillel.classwork.lesson13.ReLearn.HM29;

public class CommercialRealEstate extends TaxBuilding {

    public final int tradeProceeds;


    public CommercialRealEstate(int totalArea, int tradeProceeds) {
        super(totalArea);
        this.tradeProceeds = tradeProceeds;
    }


    @Override
    public double tax(int taxPerSquare) {

        if (this.tradeProceeds >= 100) {
            return super.tax(taxPerSquare);
        }
        System.out.println("Выручка меньше 100 грн" );
        System.out.print("Стоимость налога ");
        return 0;


    }

    @Override
    public String toString() {
        return "Общая площадь " + totalArea + " Выручка за месяц " + tradeProceeds;
    }
}
