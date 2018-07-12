package org.effectivejava.examples.chapter02.item06.slowversion;

public class RomanNumeral {
    // this is the slowerversion . Performance can be greatly enhanced.
    /*
     * The problem with this implementation is that it relies on the String.matches method. While String.matches is the
     * easiest way to check if a string matches a regular expression, it is not suitable for repeated use in performance
     * critical situations.The problem is that it internally creates a Pattern instance for the regular expression and
     * uses it only once, after which it becomes eligible for garbage collection.Creating a Pattern instance is
     * expensive because it requires compiling the regular expression into a finite state machine. To improve the
     * performance, explicitly compile the regular expression into a Pattern instance ( which is immutable) as a part of
     * class initialization, cache it, and reuse the same instance for every invocation of isRomanNumeral method. For
     * implementation details check the RomanNumber class in package
     * org.effectivejava.examples.chapter02.item06.fastversion
     */
    public boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}
