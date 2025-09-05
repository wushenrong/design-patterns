package decorator;

import java.util.ArrayList;

/**
 * An IceCream where people can create their own ice cream.
 *
 * @author Samuel Wu
 */
public abstract class IceCream {
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_BROWN = "\u001B[38;5;130m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_WHITE = "\u001B[37m";

  protected ArrayList<String> asciiArt;
  protected int numScoops;

  /** Returns the String representation of the ice cream. */
  public String toString() {
    StringBuilder art = new StringBuilder();

    for (String line : asciiArt) {
      art.append(line);

      // Do not add newlines to color codes which starts with '\u001B'
      if (!line.contains("\u001B")) {
        art.append("\n");
      }
    }

    return art.toString();
  }
}
