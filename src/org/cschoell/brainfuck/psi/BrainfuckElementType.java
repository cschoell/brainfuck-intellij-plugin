package org.cschoell.brainfuck.psi;

import com.intellij.psi.tree.IElementType;
import org.cschoell.brainfuck.BrainfuckLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BrainfuckElementType extends IElementType {
  public BrainfuckElementType(@NotNull @NonNls String debugName) {
    super(debugName, BrainfuckLanguage.INSTANCE);
  }
}