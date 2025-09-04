package decorator;

public class BlueBerry extends ScoopDecorator {
  public BlueBerry(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    createAsciiArt(ANSI_BLUE);
  }
}
