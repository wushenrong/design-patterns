package decorator;

/**
 * A Cone that is the base of the IceCream and where scoops can be added on top.
 *
 * @author Samuel Wu
 */
public class Cone extends IceCream {
  /** Creates a new Cone for scoops of ice cream to be put on top of. */
  public Cone() {
    this.numScoops = 0;
    this.asciiArt = FileReader.getLines("bin/decorator/txt/cone.txt");
    this.asciiArt.add(0, ANSI_BROWN);
    this.asciiArt.add(ANSI_RESET);
  }
}
