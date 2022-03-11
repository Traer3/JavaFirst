package com.hillel.classwork.lesson6.RElern;

public class Castle {
    public static void main(String[] args) {

        short distanceStarts = 1000;
        short distanceEnds = 1500;

        short cannonSpreadStarts = 800;
        short cannonSpreadEnds = 1800;
        short cannonShoot = canonShootSpray(cannonSpreadStarts, cannonSpreadEnds);

        System.out.println("Пушечное ядро OR попало ? ");
        System.out.println("Ответ: " + ORisCannonballHit(distanceStarts, distanceEnds, cannonShoot));
        System.out.println("Пушечное ядро AND попало ? ");
        System.out.println("Ответ: " + ANDisCannonballHit(distanceStarts, distanceEnds, cannonShoot));
    }

    private static short canonShootSpray(short cannonSpreadStarts, short cannonSpreadEnds) {
        short cannonShoot = (short) ((Math.random() * (cannonSpreadEnds - cannonSpreadStarts)) + cannonSpreadStarts);
        return cannonShoot;
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
