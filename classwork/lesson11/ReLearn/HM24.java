package com.hillel.classwork.lesson11.ReLearn;

import com.hillel.classwork.lesson4.RElern.Methods;

public class HM24 {

    public static void main(String[] args) {

        int passwordLength = 8;
        String randomPassword = "";

        String[] bigLetters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] chars = {"1","2","3","4","5","6","7","8","9","0","!","@","#","$","%","^","&","*","-","+","~","№","?","/","|","."};



        for (int i = 0; i < passwordLength; i++) {
            int randomNumber = Methods.generateRandom(1,3);

            if(i%randomNumber ==0){
                if(randomNumber == 1 ){
                    randomPassword += randomCharacter(bigLetters);
                }else if (randomNumber == 2){
                    randomPassword += randomCharacter(letters);
                }
            } else {
                randomPassword += randomCharacter(chars);
            }
        }
        System.out.println(randomPassword);

    }

    private static String randomCharacter(String[] letters) {
        int randomNumber = Methods.generateRandom(1,26);
        String randomLetter = "_";
        for (int i = 0; i <= letters.length; i++) {
           randomLetter = letters[randomNumber];
        }
        return randomLetter;
    }
}
