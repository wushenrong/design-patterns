package decorator;

import java.util.ArrayList;

public abstract class IceCream {
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_BROWN = "\u001B[38;5;130m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_WHITE = "\u001B[37m";

  protected ArrayList<String> asciiArt;
  protected int numScoops;

  public String toString() {
    String art = "";

    for (String line : asciiArt) {
      art += line;
      art += "\n";
    }

    return art;
  }
}
