package org.cschoell.brainfuck;

import com.intellij.lang.Language;

public class BrainfuckLanguage extends Language {

    public static final String BRAINFUCK = "brainfuck";

    public static final BrainfuckLanguage INSTANCE = new BrainfuckLanguage();

    protected BrainfuckLanguage() {
        super(BRAINFUCK);
    }

}
