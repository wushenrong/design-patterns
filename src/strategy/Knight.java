package strategy;

/**
 * A Knight character in a text-based game.
 *
 * @author Samuel Wu
 */
public class Knight extends Character {
  /**
   * Creates a new Knight character with a given name.
   *
   * @param name The name of the knight.
   */
  public Knight(String name) {
    super(name);
  }

  /**
   * Creates a string representation of the knight character.
   *
   * @return A string representation of the knight.
   */
  @Override
  public String toString() {
    return "K-|\nKnight: " + this.name;
  }
}
