package decorator;

public class Vanilla extends ScoopDecorator {
  public Vanilla(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    createAsciiArt(ANSI_WHITE);
  }
}
