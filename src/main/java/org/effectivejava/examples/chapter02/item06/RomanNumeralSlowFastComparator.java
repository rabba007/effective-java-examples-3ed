package org.effectivejava.examples.chapter02.item06;

public class RomanNumeralSlowFastComparator {

    public static void main(String[] args) {

        System.out.println("Program has started");
        long startTime = System.nanoTime();
        org.effectivejava.examples.chapter02.item06.slowversion.RomanNumeral slowRomanNumeral =
                new org.effectivejava.examples.chapter02.item06.slowversion.RomanNumeral();
        for (int i = 0; i < 3000000; i++) {
            slowRomanNumeral.isRomanNumeral("XII");
        }
        long endTime = System.nanoTime();
        System.out.println("Took " + (endTime - startTime) + " ns");

        long timeTakenWithNewPatternInstanceInEachCall = (endTime - startTime);


        long startTime2 = System.nanoTime();
        for (int i = 0; i < 3000000; i++) {
            org.effectivejava.examples.chapter02.item06.fastversion.RomanNumeral.isRomanNumeral("XII");
        }
        long endTime2 = System.nanoTime();
        System.out.println("Took " + (endTime2 - startTime2) + " ns");

        long timeTakenWithJustSinglePatternInstance = (endTime2 - startTime2);

        System.out.println("fast version is faster by : "
                + (((float) (timeTakenWithNewPatternInstanceInEachCall)) / timeTakenWithJustSinglePatternInstance));
    }
}
