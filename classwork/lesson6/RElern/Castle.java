package com.hillel.classwork.lesson6.RElern;

import com.hillel.classwork.lesson4.RElern.Methods;

public class Castle {
    public static void main(String[] args) {

        short distanceStarts = 1000;
        short distanceEnds = 1500;

        short cannonSpreadStarts = 800;
        short cannonSpreadEnds = 1800;
        short canonShootSpray = (short) Methods.generateRandom(cannonSpreadStarts,cannonSpreadEnds);

        System.out.println("Пушечное ядро OR попало ? ");
        System.out.println("Ответ: " + ORisCannonballHit(distanceStarts, distanceEnds, canonShootSpray));
        System.out.println("Пушечное ядро AND попало ? ");
        System.out.println("Ответ: " + ANDisCannonballHit(distanceStarts, distanceEnds, canonShootSpray));
    }

    private static boolean ORisCannonballHit(short distanceStarts, short distanceEnds, short cannonShoot) {
        boolean cannonballHit;
        if (cannonShoot < distanceStarts || cannonShoot > distanceEnds) {
            cannonballHit = false;
        } else {
            cannonballHit = true;
        }
        return cannonballHit;
    }

    private static boolean ANDisCannonballHit(short distanceStarts, short distanceEnds, short cannonShoot) {
        boolean cannonballHit;
        if (cannonShoot >= distanceStarts && cannonShoot <= distanceEnds) {
            cannonballHit = true;
        } else {
            cannonballHit = false;
        }
        return cannonballHit;
    }
}
