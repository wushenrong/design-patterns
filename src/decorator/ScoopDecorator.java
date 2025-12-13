package decorator;

import java.util.ArrayList;

/**
 * A scoop of ice cream.
 *
 * @author Samuel Wu
 */
public abstract class ScoopDecorator extends IceCream {
  protected IceCream iceCream;

  /**
   * Creates a scoop of ice cream and puts it on top of an existing IceCream.
   *
   * @param iceCream The ice cream to put the scoop on.
   * @param numScoops The number of scoops to put on the ice cream.
   */
  public ScoopDecorator(IceCream iceCream, int numScoops) {
    this.iceCream = iceCream;
    this.numScoops = this.iceCream.numScoops + numScoops;
  }

  /**
   * Create the ascii art of the scoop and ice cream with a given flavor.
   *
   * @param flavor The ice cream coloring of the flavor of the scoop.
   */
  protected void createAsciiArt(String flavor) {
    asciiArt = new ArrayList<>();
    asciiArt.add(flavor);

    for (int i = numScoops - iceCream.numScoops; i > 0; i--) {
      int currentScoop = iceCream.numScoops + i;
      String scoop = "(";

      // Account for off by one
      scoop = " ".repeat(currentScoop - 1) + scoop;
      // Mirror for the right half of the ice cream.
      scoop += "-".repeat((6 - currentScoop) * 2);
      scoop += ")";

      asciiArt.add(scoop);
    }

    asciiArt.add(ANSI_RESET);
    asciiArt.addAll(iceCream.asciiArt);
  }
}
