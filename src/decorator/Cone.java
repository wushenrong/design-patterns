package decorator;

/**
 * A Cone that is the base of the IceCream and where scoops can be added on top.
 *
 * @author Samuel Wu
 */
public class Cone extends IceCream {
  /** Creates a new Cone for scoops of ice cream to be put on top of. */
  public Cone() {
    numScoops = 0;
    asciiArt = FileReader.getLines("bin/decorator/txt/cone.txt");
    asciiArt.add(0, ANSI_BROWN);
    asciiArt.add(ANSI_RESET);
  }
}
