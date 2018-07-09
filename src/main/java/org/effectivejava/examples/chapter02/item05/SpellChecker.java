package org.effectivejava.examples.chapter02.item05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        // TO-DO : implement the logic
        return true;
    }

    public List<String> suggestions(String typo) {
        List<String> suggestions = new ArrayList<>();
        // TO-DO : implement the logic
        return suggestions;
    }
}
