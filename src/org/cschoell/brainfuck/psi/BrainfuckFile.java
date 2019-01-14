package org.cschoell.brainfuck.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.cschoell.brainfuck.BrainfuckFileType;
import org.cschoell.brainfuck.BrainfuckLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class BrainfuckFile extends PsiFileBase {
  public BrainfuckFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, BrainfuckLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return BrainfuckFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "Brainfuck File";
  }

  @Override
  public Icon getIcon(int flags) {
    return super.getIcon(flags);
  }
}