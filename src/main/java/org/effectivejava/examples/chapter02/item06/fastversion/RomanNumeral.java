package org.effectivejava.examples.chapter02.item06.fastversion;

import java.util.regex.Pattern;

// Reusing expensive object for improved performance. For the context around performance check the build up in
// RomanNumeral class defined in package org.effectivejava.examples.chapter02.item06.slowversion;
public class RomanNumeral {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    public static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
