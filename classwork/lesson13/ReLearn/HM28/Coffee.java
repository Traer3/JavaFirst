package com.hillel.classwork.lesson13.ReLearn.HM28;

public class Coffee extends CoffeeMachine {

    private String type;
    private Integer cost;

    // Americano
    // Latte
    // Cappuccino


    public Coffee (String type){

         coffeeCooking(type);

    }






    private String coffeeCooking (String type){

        String message = "Americano "+"\n"+"Latte "+"\n"+"Cappuccino";

        String coffeeCost = "0" ;

        switch (type){
            case "Americano":
                System.out.println("Готовится Американо");
                coffeeCost = "15" ;
                break;
            case "Latte":
                System.out.println("Готовится Латте");
                coffeeCost = "10";
                break;
            case "Cappuccino":
                System.out.println("Готовится Капучино");
                coffeeCost = "20";

                break;
            default:
                System.out.println(message);
                coffeeCooking(type);
        }
        return coffeeCost;
    }

    public Integer cost(Integer choice){
        if (choice == 1){
            return 15;
        }else if(choice == 2){
            return 10;
        }else {
            return 20;
        }
    }


    @Override
    public void cook() {
        super.cook();

    }

}
