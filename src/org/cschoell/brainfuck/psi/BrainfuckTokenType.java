package org.cschoell.brainfuck.psi;

import com.intellij.psi.tree.IElementType;
import org.cschoell.brainfuck.BrainfuckLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BrainfuckTokenType extends IElementType {
    private String tokenName;
    
    public BrainfuckTokenType(@NotNull @NonNls String debugName) {
        super(debugName, BrainfuckLanguage.INSTANCE);
        tokenName = debugName;
    }

    @Override
    public String toString() {
        return "BrainfuckTokenType." + super.toString();
    }

    public String tokenText() {
        return tokenName;
    }
}