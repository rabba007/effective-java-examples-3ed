package org.effectivejava.examples.chapter02.item06;

/*
 * In the example below, due to one-character typographical error, the variable sum ( in the method
 * sumIntegersWithAccidentalAutoboxing) is declared as Long instead of long, which means the program constructs about
 * 2^31 unnecessary Long instances (roughly each time the long i is added to Long sum). Changing the declaration of sum
 * from Long to long reduces the runtime , roughly six times on my machine.
 * 
 * The lesson is clear : PREFER PRIMITIVES TO BOXED PRIMITIVES, AND WATCH OUT FOR UNINTENTIONAL AUTOBOXING
 */
public class Sum {

    public static void main(String[] args) {
        System.out.println("Program has started");
        long startTime = System.nanoTime();
        sumIntegersWithAccidentalAutoboxing();
        long endTime = System.nanoTime();
        System.out.println("Took " + (endTime - startTime) + " ns");

        long timeTakenWithAutoboxing = (endTime - startTime);

        long startTime2 = System.nanoTime();
        sumIntegersWithPrimitivesOnly();
        long endTime2 = System.nanoTime();
        System.out.println("Took " + (endTime2 - startTime2) + " ns");

        long timeTakenWithPrimitivesOnly = (endTime2 - startTime2);

        float ratio = timeTakenWithAutoboxing / timeTakenWithPrimitivesOnly;
        System.out.println("primitivesOnly is " + ratio + " times faster than Autoboxing");
    }



    private static void sumIntegersWithPrimitivesOnly() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("sum : " + sum);


    }

    private static void sumIntegersWithAccidentalAutoboxing() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("sum : " + sum);

    }
}
