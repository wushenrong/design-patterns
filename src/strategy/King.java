package strategy;

/**
 * A King character in a text-based game.
 *
 * @author Samuel Wu
 */
public class King extends Character {
  /**
   * Creates a new King character with a given name.
   *
   * @param name The name of the king.
   */
  public King(String name) {
    super(name);
  }

  /**
   * Creates a string representation of the king character.
   *
   * @return A string representation of the king.
   */
  @Override
  public String toString() {
    return "|^K^|\nKing: " + name;
  }
}
