// NonInstantiable utility class
package org.effectivejava.examples.chapter02.item04;

public class UtilityClass {

    // Suppress default constructor for non-instantiability
    private UtilityClass() {
        throw new AssertionError();
    }
}
