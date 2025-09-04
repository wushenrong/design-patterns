package decorator;

public class Cone extends IceCream {
  public Cone() {
    this.asciiArt = FileReader.getLines("bin/decorator/cone.txt");
    this.asciiArt.add(0, ANSI_BROWN);
    this.asciiArt.add(ANSI_RESET);
  }
}
