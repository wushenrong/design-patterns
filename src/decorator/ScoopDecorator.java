package decorator;

import java.util.ArrayList;

public abstract class ScoopDecorator extends IceCream {
  protected IceCream iceCream;
  protected int numFlavorScoops;

  public ScoopDecorator(IceCream iceCream, int numScoops) {
    this.iceCream = iceCream;
    this.numFlavorScoops = numScoops;
    this.numScoops = this.iceCream.numScoops + this.numFlavorScoops;
  }

  protected void createAsciiArt(String flavor) {
    this.asciiArt = new ArrayList<String>();
    this.asciiArt.add(flavor);

    for (int i = numFlavorScoops; i > 0; i--) {
      int currentScoop = numScoops - numFlavorScoops + i;
      String scoop = "(";

      scoop = " ".repeat(currentScoop - 1) + scoop;
      scoop += "-".repeat((6 - currentScoop) * 2);
      scoop += ")";

      this.asciiArt.add(scoop);
    }

    this.asciiArt.add(ANSI_RESET);
    this.asciiArt.addAll(this.iceCream.asciiArt);
  }
}
