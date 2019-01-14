package org.cschoell.brainfuck;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class BrainfuckLexerAdapter extends FlexAdapter {
  public BrainfuckLexerAdapter() {
    super(new _BrainfuckLexer((Reader) null));
  }
}
