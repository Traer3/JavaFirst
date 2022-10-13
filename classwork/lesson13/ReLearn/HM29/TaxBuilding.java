package com.hillel.classwork.lesson13.ReLearn.HM29;

public class TaxBuilding {

    int totalArea;
    public TaxBuilding(int totalArea){
        this.totalArea = totalArea;
    }

    public double tax(int taxPerSquare) {

        return this.totalArea * taxPerSquare;

    }


    public static void main(String[] args) {

        int taxPerSquare = 90;

        ResidentialProperties case1 = new ResidentialProperties(56);
        CommercialRealEstate case2 = new CommercialRealEstate(120,90);
        IndustrialRealEstate case3 = new IndustrialRealEstate(560);

        System.out.println(case1.tax(taxPerSquare));
        System.out.println(case2.tax(taxPerSquare));
        System.out.println(case3.tax(taxPerSquare));

    }



}
