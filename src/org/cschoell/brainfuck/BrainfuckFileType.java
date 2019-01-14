package org.cschoell.brainfuck;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BrainfuckFileType extends LanguageFileType {
  public static final BrainfuckFileType INSTANCE = new BrainfuckFileType();

  private BrainfuckFileType() {
    super(BrainfuckLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Brainfuck file";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Brainfuck language file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "bf";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return BrainfuckIcons.FILE;
  }
}