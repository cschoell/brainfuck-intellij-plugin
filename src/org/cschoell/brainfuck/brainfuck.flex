package org.cschoell.brainfuck;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.cschoell.brainfuck.psi.BrainfuckTypes;

%%

%public

%class _BrainfuckLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

%s WHITE_SPACE


WHITESPACE=[ \t\f]
CRLF=\R
INCREMENT="+"
DECREMENT="-"
DECREMENT_PTR="<"
INCREMENT_PTR=">"
INPUT=","
OUTPUT="."
LBRACK="["
RBRACK="]"

%%


({CRLF}|{WHITESPACE})+           { return TokenType.WHITE_SPACE; }
{INCREMENT}                      { return BrainfuckTypes.INCREMENT; }
{DECREMENT}                      { return BrainfuckTypes.DECREMENT; }
{DECREMENT_PTR}                  { return BrainfuckTypes.DECREMENT_PTR; }
{INCREMENT_PTR}                  { return BrainfuckTypes.INCREMENT_PTR; }
{INPUT}                          { return BrainfuckTypes.INPUT; }
{OUTPUT}                         { return BrainfuckTypes.OUTPUT; }
{LBRACK}                         { return BrainfuckTypes.LBRACK; }
{RBRACK}                         { return BrainfuckTypes.RBRACK; }
      
      
[^]                              { return BrainfuckTypes.COMMENT; }
