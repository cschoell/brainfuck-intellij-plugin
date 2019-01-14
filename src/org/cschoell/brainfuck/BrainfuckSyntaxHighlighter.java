package org.cschoell.brainfuck;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.cschoell.brainfuck.psi.BrainfuckTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class BrainfuckSyntaxHighlighter extends SyntaxHighlighterBase {
  public static final TextAttributesKey OPERATOR =
      createTextAttributesKey("BRAINFUCK_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey BRACKET =
      createTextAttributesKey("BRAINFUCK_BRACKET", DefaultLanguageHighlighterColors.BRACKETS);
  public static final TextAttributesKey FUNCTION =
      createTextAttributesKey("BRAINFUCK_FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL);
  public static final TextAttributesKey POINTER =
      createTextAttributesKey("BRAINFUCK_POINTER", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey COMMENT =
      createTextAttributesKey("BRAINFUCK_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  
  private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
  private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{BRACKET};
  
  private static final TextAttributesKey[] IO_KEYS = new TextAttributesKey[]{FUNCTION};
  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] POINTER_KEYS = new TextAttributesKey[]{POINTER};

  @NotNull
  @Override
  public Lexer getHighlightingLexer() {
    return new BrainfuckLexerAdapter();
  }

  @NotNull
  @Override
  public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    if (tokenType.equals(BrainfuckTypes.DECREMENT) || tokenType.equals(BrainfuckTypes.INCREMENT)) {
      return OPERATOR_KEYS;
    } else if (tokenType.equals(BrainfuckTypes.INPUT) || tokenType.equals(BrainfuckTypes.OUTPUT)) {
      return IO_KEYS;
    } else if (tokenType.equals(BrainfuckTypes.INCREMENT_PTR) || tokenType.equals(BrainfuckTypes.DECREMENT_PTR)) {
      return POINTER_KEYS;
    } else if (tokenType.equals(BrainfuckTypes.RBRACK) || tokenType.equals(BrainfuckTypes.LBRACK)) {
      return BRACKET_KEYS;
    } else if (tokenType.equals(BrainfuckTypes.COMMENT)) {
      return COMMENT_KEYS;
    } else {
      return COMMENT_KEYS;
    }
  }
}