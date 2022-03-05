package com.hillel.classwork.lesson3.RElern;

public class HM4 {
    public static void main(String[] args) {

        byte firstSnowBall = 1;
        float secondSnowBall = 0.5F;
        float thirdSnowBall = 0.2F;

        float sizeOfFirstSnowBall = (float) (4 / 3 * Math.PI * firstSnowBall);
        float sizeOfSecondSnowBall = (float) (4 / 3 * Math.PI * secondSnowBall);
        float sizeOfThirdSnowBall = (float) (4 / 3 * Math.PI * thirdSnowBall);

        float snowManThickness = 0.7F;

        float firstSnowBallWeight = sizeOfFirstSnowBall * snowManThickness;
        float secondSnowBallWeight = sizeOfSecondSnowBall * snowManThickness;
        float thirdSnowBallWeight = sizeOfThirdSnowBall * snowManThickness;

        float snowManWeight = firstSnowBallWeight + secondSnowBallWeight + thirdSnowBallWeight;

        System.out.println("вес снеговика " + snowManWeight);

    }
}
