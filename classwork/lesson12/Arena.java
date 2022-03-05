package com.hillel.classwork.lesson12;

public class Arena {

   public static void main(String[] args) {

      Cat Barsik = new Cat(20,50,7);
      Cat Garfield = new Cat(25, 40 ,5);

      catFight(Barsik, Garfield);

   }

   private static void catFight(Cat Barsik, Cat Garfield) {
      if( Barsik.getStrength() > Garfield.getStrength()){
         System.out.println("Barsik силен");
      }else {
         System.out.println("Garfield силен");
      }
   }


}
