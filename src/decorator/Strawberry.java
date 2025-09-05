package decorator;

/**
 * A scoop of Strawberry ice cream.
 *
 * @author Samuel Wu
 */
public class Strawberry extends ScoopDecorator {
  /**
   * Creates a scoop of Strawberry ice cream and put it on top of an existing IceCream.
   *
   * @param iceCream The ice cream to put the scoop on.
   * @param numScoops The number of scoops to put on the ice cream.
   */
  public Strawberry(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    createAsciiArt(ANSI_RED);
  }
}
